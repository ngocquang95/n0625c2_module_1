package ss3_java_overview;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        // System.in: Tiêu chuẩn để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tuổi của bạn: ");
        int age = Integer.parseInt(scanner.nextLine()); // 20 enter

        System.out.print("Nhập vào tên của bạn: ");
        // scanner.nextLine(); // Clear dữ liệu
        String name = scanner.nextLine();

        System.out.println("Tên của bạn là: " + name);
        System.out.println("Tuổi của bạn là: " + age);
    }
}
