package micellinions;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScreenBrightnessManager implements NativeKeyListener {

    private static int BRIGHTNESS_LEVEL = 100;

    public static void main(String[] args) throws IOException {

        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            e.printStackTrace();
        }

        GlobalScreen.addNativeKeyListener(new ScreenBrightnessManager());
        setBrightness(BRIGHTNESS_LEVEL);
    }

    public static void setBrightness(int brightness)
            throws IOException {
        //Creates a powerShell command that will set the brightness to the requested value (0-100),
        // after the requested delay (in milliseconds) has passed.
        String s = String.format("$brightness = %d;", brightness)
                + "$delay = 0;"
                + "$myMonitor = Get-WmiObject -Namespace root\\wmi -Class WmiMonitorBrightnessMethods;"
                + "$myMonitor.wmisetbrightness($delay, $brightness)";
        String command = "powershell.exe  " + s;
        // Executing the command
        Process powerShellProcess = Runtime.getRuntime().exec(command);

        powerShellProcess.getOutputStream().close();

        //Report any error messages
        String line;

        BufferedReader stderr = new BufferedReader(new InputStreamReader(
                powerShellProcess.getErrorStream()));
        line = stderr.readLine();
        if (line != null)
        {
            System.err.println("Standard Error:");
            do
            {
                System.err.println(line);
            } while ((line = stderr.readLine()) != null);

        }
        stderr.close();

    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent evt) {
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent evt) {
        System.out.println(evt.getKeyCode());
        System.out.println(NativeKeyEvent.getKeyText(evt.getKeyCode()));

        /*if (nativeKeyEvent.getKeyCode() == NativeKeyEvent.VC_F9) {
            if (BRIGHTNESS_LEVEL > 0) {
                BRIGHTNESS_LEVEL -= 10;
                try {
                    setBrightness(BRIGHTNESS_LEVEL);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (nativeKeyEvent.getKeyCode() == NativeKeyEvent.VC_F10) {
            if (BRIGHTNESS_LEVEL < 100) {
                BRIGHTNESS_LEVEL += 10;
                try {
                    setBrightness(BRIGHTNESS_LEVEL);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent evt) {

    }
}
