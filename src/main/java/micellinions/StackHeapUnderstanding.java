package micellinions;

public class StackHeapUnderstanding {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 10;
        Integer i3 = Integer.valueOf (10);

        System.out.println ("For int values: ");
        System.out.println (i1 == i2);
        System.out.println (i1 == i3);
        System.out.println (i3.equals (i1));

        String name1 = "Sumon Selim";
        String name2 = name1;
        String name3 = new String ("sumon Selim");

        System.out.println ("For names: ");
        System.out.println (name1 == name2);
        System.out.println (name1.equals (name2));
        System.out.println (name1 == name3);
        System.out.println (name1.equalsIgnoreCase (name3));
        System.out.println ("Length of current string: "+ name1.length ());
        // Concat 1
        long currentMillis = System.currentTimeMillis ();
        name1 = name1.concat (" the boss");
        System.out.println ("total execution time 1: " + (System.currentTimeMillis () - currentMillis));
        // Concat 2
        currentMillis = System.currentTimeMillis ();
        name1 = name1 + " the boss";
        System.out.println ("total execution time 2: " + (System.currentTimeMillis () - currentMillis));




    }
}
