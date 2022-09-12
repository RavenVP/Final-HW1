import java.util.Arrays;

public class Main {
    private static Employee[] worker = new Employee[10];

    public static void main(String[] args) {
        Employee worker1 = new Employee("Иван", "Алексеевич", "Дрёмин", 1 , 45673);
        Employee worker2 = new Employee("Олег", "Николаевич", "Тинькофф", 1 , 123645);
        Employee worker3 = new Employee("Наталья", "Анатольевна", "Гардубей", 2 , 74123);
        Employee worker4 = new Employee("Павел", "Андреевич", "Воронцов", 2 , 75424);
        Employee worker5 = new Employee("Дмитрий", "Станиславович", "Сухарук", 3 , 65482);
        Employee worker6 = new Employee("Ольга", "Викторовна", "Доровина", 3 ,61237);
        Employee worker7 = new Employee("Юлия", "Денисовна", "Мендалёва", 4, 98623);
        Employee worker8 = new Employee("Мария", "Артуровна", "Глазкова", 4 , 46587);
        Employee worker9 = new Employee("Андрей", "Вадимович", "Скрипка", 5 , 235845);
        Employee worker10 = new Employee("Владислав", "Григорьевич", "Власов", 5 , 23423);

        worker[0] = worker1;
        worker[1] = worker2;
        worker[2] = worker3;
        worker[3] = worker4;
        worker[4] = worker5;
        worker[5] = worker6;
        worker[6] = worker7;
        worker[7] = worker8;
        worker[8] = worker9;
        worker[9] = worker10;

        System.out.println("Минимальная зарплата -- " + minSalary());
        System.out.println("Максимальная зарплата -- " + maxSalary());
        System.out.println("Средняя зарплата -- " + avgSalary() + "₽");
        System.out.println("Потрачено на зарплаты  -- " + totalSalary() + "₽" );
        Employee[] w = Arrays.copyOf(worker,11);
        Arrays.stream(w).forEach(System.out::println);
        System.out.println(w.length);

    }

    public static void fullName() {
        for (Employee employee : worker) {
            System.out.println(employee.getLastName());
        }
    }
    public static float totalSalary() {
        int totSal = 0;
        for (Employee employee : worker) {
            totSal = totSal + employee.getSalary();
        }
        return totSal;
    }

    public static Employee minSalary() {
        Employee minResult = worker[0];
        int minSalary = worker[0].getSalary();
        for (Employee employee : worker) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                minResult = employee;
            }
        }
        return minResult;
    }
    public static Employee maxSalary() {
        Employee maxResult = worker[0];
        int minSalary = worker[0].getSalary();
        for (Employee employee : worker) {
            if (minSalary < employee.getSalary()) {
                minSalary = employee.getSalary();
                maxResult = employee;
            }
        }
        return maxResult;
    }
    public static float avgSalary() {
        int avgSal = 0;
        int counter = 0;
        for (Employee employee : worker) {
            if (employee != null) {
                avgSal = avgSal + employee.getSalary();
                counter++;
            }
        }
        return avgSal / counter;
    }
}