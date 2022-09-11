package yonetici;

import kullanici.Tablo;

import java.util.Scanner;

public class MarketFiyatGuncelleme extends Database {
    static Scanner scan = new Scanner(System.in);

    public static void fiyatGuncelleme() {
        Tablo.marketTabloCagir();
        /*scan.nextLine();*/
        System.out.println("Fiyatını güncellemek istediğiniz ürünün ismini giriniz");
        String urun = scan.nextLine();
        System.out.println("Yeni fiyat giriniz");
        double fiyat = scan.nextDouble();
        try {
            String sql1 = "update market set urun_fiyati=" + fiyat + " where urun_adi='" + urun + "'";
            st.executeUpdate(sql1);
            Tablo.marketTabloCagir();
        } catch (Exception e) {
            System.out.println(e);
        }
        YonetimGenel.genel();
    }
}
