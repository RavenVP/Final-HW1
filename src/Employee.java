public class Employee {
    private int id;
    private String name;
    private String middleName;
    private String lastName;
    private int dept;
    private int salary;
    private static int idNumber = 1;

    public Employee(String name, String middleName, String lastName, int dept, int salary) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dept = dept;
        this.salary = salary;
        this.id = idNumber++;

    }

    public String getName() {
        return name;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getDept() {
        return dept;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        salary = this.salary;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Сотрудник" + "{" + id + "}" +
                "  Ф.И.О: " + lastName  +
                "  " + name  +
                "  " + middleName  + " ||" +
                "Отдел:" + dept + "||" +
                "  Зарплата: " + salary + "₽" ;
    }
}
