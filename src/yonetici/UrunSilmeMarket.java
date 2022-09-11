package yonetici;

import kullanici.Tablo;

import java.util.Scanner;

public class UrunSilmeMarket extends Database {
    static Scanner scan = new Scanner(System.in);

    public static void urunSilme() {
        Tablo.marketTabloCagir();
        /*scan.nextLine();*/
        System.out.println("Silmek istediğiniz ürünün ismini giriniz");
        String urun = scan.nextLine();
        try {
            String sql1 = "delete from market where urun_adi='" + urun + "'";
            st.executeUpdate(sql1);
            Tablo.marketTabloCagir();
        } catch (Exception e) {
            System.out.println(e);
        }
        YonetimGenel.genel();
    }
}
