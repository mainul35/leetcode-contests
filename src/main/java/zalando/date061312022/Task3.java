package zalando.date061312022;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {

    public int solution(String[] E) {
        Map<String, String> daysPerEmployee = new HashMap<>();
        for (int employeeIndex = 0; employeeIndex < E.length; employeeIndex++) {
            String employee = String.valueOf(employeeIndex);
            String employeeAvailableDays = E[employeeIndex];
            daysPerEmployee.put(employee, employeeAvailableDays);
        }

        Map<Integer, Set<String>> employeesAvailablePerDay = new HashMap<>();
        for (int dayIndex = 0; dayIndex < 10; dayIndex++) {
            String day = String.valueOf(dayIndex);
            Set<String> employers = daysPerEmployee
                    .entrySet().stream()
                    .filter(e -> e.getValue().contains(day))
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());

            employeesAvailablePerDay.put(dayIndex, employers);
        }

        Set<String> maximumAvailableEmployees = new HashSet<>();
        for (int dayOne = 0; dayOne < employeesAvailablePerDay.keySet().size(); dayOne++) {
            var dayOneAvailableEmployees = employeesAvailablePerDay.get(dayOne);
            for (int dayTwo = dayOne + 1; dayTwo < employeesAvailablePerDay.keySet().size(); dayTwo++) {
                Set<String> dayTwoAvailableEmployees = employeesAvailablePerDay.get(dayTwo);

                Set<String> employees = new HashSet<>();
                employees.addAll(dayOneAvailableEmployees);
                employees.addAll(dayTwoAvailableEmployees);

                if (employees.size() > maximumAvailableEmployees.size()) {
                    maximumAvailableEmployees = employees;
                }
            }
        }

        return maximumAvailableEmployees.size();
    }
}
