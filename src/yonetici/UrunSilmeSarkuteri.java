package yonetici;

import kullanici.Tablo;

import java.util.Scanner;

public class UrunSilmeSarkuteri extends Database {
    static Scanner scan = new Scanner(System.in);

    public static void urunSilme() {
        Tablo.sarkuteriTabloCagir();
        /*scan.nextLine();*/
        System.out.println("Silmek istediğiniz ürünün ismini giriniz");
        String urun = scan.nextLine();
        try {
            String sql1 = "delete from sarkuteri where urun_adi='" + urun + "'";
            st.executeUpdate(sql1);
            Tablo.sarkuteriTabloCagir();
        } catch (Exception e) {
            System.out.println(e);
        }
        YonetimGenel.genel();
    }
}
