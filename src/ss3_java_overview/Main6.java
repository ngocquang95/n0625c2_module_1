package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

/**
 * Nhập năm sinh của một người. Tính tuổi người đó.
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào năm sinh của bạn: ");
        int yearOfBirth = scanner.nextInt();

        int currentYear = Year.now().getValue();
        System.out.println("Tuổi của bạn là: " + (currentYear - yearOfBirth));
        // How to ... in java
        // How to get current year in java
    }
}
