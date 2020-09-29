package TH_Su_dung_NumberException;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);

    }
    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x/y;
            System.out.println("tong" + a);
            System.out.println("hieu" + b);
            System.out.println("tich" + c);
            System.out.println("thuong" + d);
        } catch (ArithmeticException ex) {
            System.out.println("Ngoai le" + ex.getMessage());
        }
    }

}
