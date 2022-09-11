package yonetici;

import kullanici.Tablo;

import java.util.Scanner;

public class UrunSilmeManav extends Database {
    static Scanner scan = new Scanner(System.in);

    public static void urunSilme() {
        Tablo.manavTabloCagir();
        /*scan.nextLine();*/
        System.out.println("Silmek istediğiniz ürünün ismini giriniz");
        String urun = scan.nextLine();
        try {
            String sql1 = "delete from manav where urun_adi='" + urun + "'";
            st.executeUpdate(sql1);
            Tablo.manavTabloCagir();
        } catch (Exception e) {
            System.out.println(e);
        }
        YonetimGenel.genel();

    }
}
