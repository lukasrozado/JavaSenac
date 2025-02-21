import java.util.Locale;
import java.util.Scanner;

public class Payment {

    public Integer getUserSalary() {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = input.nextInt();

        input.close();

        return salary;
    }

    public Integer discountINSS(int salary) {
        Locale.setDefault(Locale.US);

        if (salary >= 2000) {
            return (int) (salary * (11.0 / 100));
        } else if (salary >= 1500) {
            return (int) (salary * (9.0 / 100));
        }
        else{
            return (int) (salary * (9.0 / 100));
        }
    }
    public Integer discountTransport(int salary) {
        Locale.setDefault(Locale.US);
        if (salary >= 1000) {
            return (int) (salary * (6.0 / 100));
        }
        else{
            return (int) (salary * (5.0 / 100));
        }
    }
}
