package yonetici;

import kullanici.Tablo;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class UrunEklemeMarket extends Database {
    static Scanner scan = new Scanner(System.in);

    public static void urunEkleme() {
        Tablo.marketTabloCagir();
        System.out.println("Eklemek istediğiniz ürünün id'sini giriniz");
        int urunId = scan.nextInt();
        scan.nextLine();
        System.out.println("Eklemek istediğiniz ürünün adını giriniz");
        String urunAdi = scan.nextLine();
        System.out.println("Eklemek istediğiniz ürünün fiyatını giriniz");
        double urunFiyati = scan.nextDouble();
        try {
            String sql1 = "insert into market values (?,?,?)";
            PreparedStatement pst1 = con.prepareStatement(sql1);
            pst1.setInt(1, urunId);
            pst1.setString(2, urunAdi);
            pst1.setDouble(3, urunFiyati);
            pst1.executeUpdate();
            Tablo.marketTabloCagir();
        } catch (Exception e) {
            System.out.println(e);
        }
        YonetimGenel.genel();
    }
}
