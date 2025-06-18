public class Main {

    public static void printNameEmployees(Employee[] list) {
        for (final Employee employee : list) {
            if (employee == null) break;
            System.out.printf("%s %s %s%n",
                    employee.getLastName(),
                    employee.getFirstName(),
                    employee.getMiddleName());
        }
    }

    public static int calcMeanSalary(Employee[] list) {
        return calcSalaryMonthly(list) / list.length;
    }

    public static Employee findMaxSalary(Employee[] list) {
        Employee maxSalary = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] == null) break;
            if (list[i].getSalary() > maxSalary.getSalary()) maxSalary = list[i];
        }
        return maxSalary;
    }

    public static Employee findMinSalary(Employee[] list) {
        Employee minSalary = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] == null) break;
            if (list[i].getSalary() < minSalary.getSalary()) minSalary = list[i];
        }
        return minSalary;
    }

    public static int calcSalaryMonthly(Employee[] list) {
        int sum = 0;
        for (final Employee employee : list) {
            if (employee == null) break;
            sum += employee.getSalary();
        }
        return sum;
    }

    public static void printEmployeeList(Employee[] list) {
        for (final Employee employee : list) {
            if (employee == null) break;
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        Employee[] employeeList = new Employee[10];
        employeeList[0] = new Employee("Дмитрий", "Вячеславович",
                "Феденистов", "Первый", 500_000);
        employeeList[1] = new Employee("Кирилл", "Иванович",
                "Петров", "Второй", 250_000);
        employeeList[2] = new Employee("Анатолий", "Юрьевич",
                "Зорин", "Второй", 200_000);
        employeeList[3] = new Employee("София", "Александровна",
                "Крымская", "Третий", 160_000);
        employeeList[4] = new Employee("Владимир", "Олегович",
                "Попов", "Четвёртый", 120_000);
        employeeList[5] = new Employee("Николай", "Александрович",
                "Козлов", "Четвёртый", 100_000);
        employeeList[6] = new Employee("Алексей", "Калинович",
                "Гудько", "Пятый", 80_000);

        printEmployeeList(employeeList);
        System.out.printf("%nРасходы на зарплату в месяц - %dр%n", calcSalaryMonthly(employeeList));
        System.out.printf("%nСотрудник с минимальной зарплатой:%n%s%n", findMinSalary(employeeList));
        System.out.printf("%nСотрудник с максимальной зарплатой:%n%s%n", findMaxSalary(employeeList));
        System.out.printf("%nСотрудник с максимальной зарплатой:%n%s%n", findMaxSalary(employeeList));
        System.out.printf("%nСредняя зарплата у сотрудников - %dр%n", calcMeanSalary(employeeList));
        System.out.printf("%nФИО сотрудников:%n");
        printNameEmployees(employeeList);
    }
}