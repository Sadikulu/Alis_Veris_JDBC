package yonetici;

import java.util.Scanner;

public class UrunSilme extends Database {
    static Scanner scan = new Scanner(System.in);

    public static void silme() {
        System.out.println("Lütfen silmek istediğiniz ürünün reyonu seçiniz\n"
                + "1 Manav\n" + "2 Sarkuteri\n" + "3 Market");
        try {
            int secim = scan.nextInt();
            if (secim == 1) {
                UrunSilmeManav.urunSilme();
            } else if (secim == 2) {
                UrunSilmeSarkuteri.urunSilme();
            } else if (secim == 3) {
                UrunSilmeMarket.urunSilme();
            } else {
                System.out.println("Geçerli bir işlem giriniz");
                silme();
            }
        } catch (Exception e) {
            System.out.println("Geçerli bir işlem giriniz");
            silme();
        }
    }
}
