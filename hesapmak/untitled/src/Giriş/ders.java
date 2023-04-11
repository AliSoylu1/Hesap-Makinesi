package Giriş;

import java.util.Scanner;

public class ders {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, select;

        System.out.print("Lütfen ilk sayıyı girin:");
        n1 = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı girin:");
        n2 = input.nextInt();

        System.out.print("Lütfen yapmak istediğiniz matematiksel işlemi seçin:");
        System.out.print("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Kalan: " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpım: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.print("Sıfıra bölünemez");
                } else {
                    System.out.print("Bölüm: " + (n1 / n2));
                }
                break;
            default:
                System.out.print("Hatalı giriş yaptınız!");

        }


    }
}
