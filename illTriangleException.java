package Su_Dung_Lop_ILLegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IllegalTriangleException ill = new IllegalTriangleException();
        System.out.println("Nhap canh a :");
        int a = scanner.nextInt();
        System.out.println("Nhap canh b :");
        int b = scanner.nextInt();
        System.out.println("Nhap canh c :");
        int c = scanner.nextInt();
        ill.illegalTriangle(a,b,c);

    }
    private void illegalTriangle(int a, int b, int c) {
        try {
            if(a < 0 || b < 0 || c <0 || a + b <c)
                return;


        } catch (Exception e) {
            System.out.println("Xay ra ngoai le");

        }
    }

}