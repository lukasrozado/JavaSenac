package user;

public class Main {
    public static void main(String[] args) {
        Name name = new Name();
        Cpf cpf = new Cpf();
        Payment salary = new Payment();
        String userName = name.getUserName();
        String userCpf = cpf.getUserCpf();
        int userSalary = salary.getUserSalary();
        int discountInss =  salary.discountINSS(userSalary);
        int discountTransport = salary.discountTransport(userSalary);
        int total = userSalary - discountTransport - discountInss;
        System.out.println("Name: " + userName);
        System.out.println("CPF: " + userCpf);
        System.out.println("Salary: " + userSalary);
        System.out.println("DiscountINSS: " + discountInss);
        System.out.println("Discount Transport: " + discountTransport);
        System.out.println("Total Received: " + total);

    }
}
