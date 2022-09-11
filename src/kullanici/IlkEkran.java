package kullanici;

import yonetici.Yonetim;

import java.sql.SQLException;
import java.util.Scanner;

public class IlkEkran {
    public static void bas() {
        Scanner scan = new Scanner(System.in);
        int secim;
        for (int i = 0; i <1 ; i++) {
            System.out.println("Lütfen bölüm seçiniz\n"
                    + "1 Kullanıcı\n" + "2 Yönetici");
            try {
                secim = scan.nextInt();
                if (secim == 1) {
                    Secimler.secim();
                } else if (secim == 2) {
                    Yonetim.panel();
                }else{
                    System.out.println("Lütfen geçerli bir kategori numarası giriniz");
                    bas();
                    i--;
                }
            } catch (Exception e) {
                System.out.println("Lütfen geçerli bir kategori numarası giriniz");
                IlkEkran.bas();
                i--;
            }
        }
    }
}
