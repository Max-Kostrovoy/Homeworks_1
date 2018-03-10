package com.company.lesson_12;

public class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee employeeNext : employees) {
            System.out.printf("%nЗарплата %s равняется " + tabulator(employeeNext)
                    + "%10.2f", employeeNext.getFullname(), employeeNext.getSalary());
        }
    }

    public static String tabulator(Employee employeeNext) {
        StringBuilder s = new StringBuilder(" ");
        for (int i = 0; i < 12 - employeeNext.getFullname().length(); i++) {
            s.append(" ");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jack Jackson", 124.56);
        Employee employee2 = new Employee("Bill Gates", 215.43);
        Employee employee3 = new Employee("Martin Eden", 347.15);
        Employee[] employees = {employee1, employee2, employee3};
        generateReport(employees);
    }
}
