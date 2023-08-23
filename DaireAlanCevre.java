import java.util.Scanner;
public class DaireAlanCevre {
    public static void  main(String[] args) {
        double r,pi=3.14,a,cevre,alan,da;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        r=input.nextDouble();

        System.out.print("Hesaplamak İstediğiniz daire diliminin açısını giriniz: ");
        a=input.nextDouble();

        alan = pi*r*r;
        cevre = 2*pi*r;
        da= (pi*(r*r)*a)/360;

        System.out.println("Dairenin Alanı: "+alan);
        System.out.println("Dairenin Çevresi: "+cevre);
        System.out.println("Daire Diliminin Alanı:  "+da);
    }
}
