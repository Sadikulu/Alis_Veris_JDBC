package yonetici;

import java.util.Scanner;

public class UrunEkleme extends Database {
    static Scanner scan = new Scanner(System.in);

    public static void ekleme() {
        System.out.println("Lütfen ürün eklemek istediğiniz reyonu seçiniz\n"
                + "1 Manav\n" + "2 Sarkuteri\n" + "3 Market");
        for (int i = 0; i <1 ; i++) {
            try {
                int secim = scan.nextInt();
                if (secim == 1) {
                    UrunEklemeManav.urunEkleme();
                } else if (secim == 2) {
                    UrunEklemeSarkuteri.urunEkleme();
                } else if (secim == 3) {
                    UrunEklemeMarket.urunEkleme();
                } else{
                    System.out.println("Geçerli bir işlem giriniz");
                    i--;
                }
            } catch (Exception e) {
                System.out.println("Geçerli bir işlem giriniz");
            }
        }
    }
}
