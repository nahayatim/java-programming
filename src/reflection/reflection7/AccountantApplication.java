package reflection.reflection7;

public class AccountApplication {
    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        Statistics statistics = accountant.pay();
        System.out.println("Total amount paid: " + statistics.getTotalPaid() + "€");
        System.out.println("Most paying department: " + statistics.getMostPayingDepartment());
        Employee employee = statistics.getMostPaidEmployee();
        System.out.println("Highest salary employee: " + employee.getName() + " from " + employee.getDepartment() + " with " + employee.getSalary() + "€");

    }
}
