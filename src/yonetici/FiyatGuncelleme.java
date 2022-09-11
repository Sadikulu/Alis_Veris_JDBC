package yonetici;

import java.util.Scanner;

public class FiyatGuncelleme extends Database {
    static Scanner scan = new Scanner(System.in);

    public static void fiyatGuncelleme() {
        System.out.println("Lütfen fiyat güncellemek istediğiniz reyonu seçiniz\n"
                + "1 Manav\n" + "2 Sarkuteri\n" + "3 Market");
        try {
            int secim = scan.nextInt();
            if (secim == 1) {
                ManavFiyatGuncelleme.fiyatGuncelleme();
            } else if (secim == 2) {
                SarkuteriFiyatGuncelleme.fiyatGuncelleme();
            } else if (secim == 3) {
                MarketFiyatGuncelleme.fiyatGuncelleme();
            } else {
                System.out.println("Geçerli bir işlem giriniz");
                fiyatGuncelleme();
            }
        } catch (Exception e) {
            System.out.println("Geçerli bir işlem giriniz");
            fiyatGuncelleme();
        }
    }
}
