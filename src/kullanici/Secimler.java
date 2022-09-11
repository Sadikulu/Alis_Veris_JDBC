package kullanici;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Secimler {
    public static double toplamFiyat=0.0;
    public static List<String> sepet = new ArrayList<>();
    public static int secim;

    public static void secim() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <1 ; i++) {
            System.out.println("Lütfen kategori seçiniz\n"
                    + "1 Manav\n" + "2 Sarkuteri\n" + "3 Market");
            try {
                secim = scan.nextInt();
                if (secim == 1) {
                    Manav.urunler();
                } else if (secim == 2) {
                    Sarkuteri.urunler();
                } else if (secim == 3) {
                    Market.urunler();
                }else{
                    System.out.println("Lütfen geçerli bir kategori numarası giriniz");
                    Secimler.secim();
                    i--;
                }
            } catch (Exception e) {
                System.out.println("Lütfen geçerli bir kategori numarası giriniz");
                Secimler.secim();
                i--;
            }
        }
    }
}
