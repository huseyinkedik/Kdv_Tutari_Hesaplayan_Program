import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //değişkenleri olustur
        double tutar, kdvtutar, kdvorani, kdvlitutar, kdvsiztutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Fiyat Giriniz: ");
        tutar = inp.nextInt();

        if (tutar<1000) {
            kdvorani = 0.18;
        } else
            kdvorani = 0.08;

        kdvtutar = tutar * (kdvorani);
        kdvlitutar = tutar + kdvtutar;
        kdvsiztutar =tutar;
        kdvorani = tutar * kdvorani;


        System.out.println("Kdvsiz Tutar: " + kdvsiztutar);
        System.out.println("Kdvli Tutar: " + kdvlitutar);
        System.out.println("Kdv Oranı: "+ kdvorani);


              }
    }