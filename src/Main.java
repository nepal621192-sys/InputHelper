import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        //Test InputHelper methods
        Scanner scan = new Scanner(System.in);

        String number = InputHelper.getRegExString(scan, "Enter phone number [xxx-xxx-xxxx]:", "\\d{3}-\\d{3}-\\d{4}");
        System.out.println(number);
    }
}
