import atm.*;
import builder.User;
import java.util.Scanner;


public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int amount = scan.nextInt();
        ATM atm = new ATM();


        atm.process(amount);
        User user = User.builder()
                .firstName("Stepan")
                .age(18)
                .gender("m")
                .occupation("developer")
                .occupation("manager")
                .build();

        System.out.println(user.getFirstName());
        System.out.println(user);
    }
}