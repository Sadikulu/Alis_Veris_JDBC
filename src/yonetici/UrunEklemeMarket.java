package yonetici;

import kullanici.Tablo;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class UrunEklemeMarket extends Database {
    static Scanner scan=new Scanner(System.in);

    public static void urunEkleme(){
        Tablo.marketTabloCagir();
        System.out.println("Eklemek istediğiniz ürünün no'sunu giriniz");
        int urunId = scan.nextInt();
        System.out.println("Eklemek istediğiniz ürünün adını giriniz");
        scan.nextLine();
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
        for (int i = 0; i < 1; i++) {
            System.out.println("Devam etmek istiyormusunuz? T/F");
            String cevap = scan.next();
            if (cevap.equalsIgnoreCase("T")) {
                for (int j = 0; j < 1; j++) {
                    System.out.println("Aynı kategoride mi devam etmek istiyorsunuz? T/F");
                    String kcevap = scan.next();
                    if (kcevap.equalsIgnoreCase("T")) {
                        UrunEklemeMarket.urunEkleme();
                    } else if (kcevap.equalsIgnoreCase("F")) {
                        YonetimGenel.genel();
                    } else {
                        System.out.println("Lütfen geçerli bir karakter giriniz");
                        j--;
                    }
                }
            } else if (cevap.equalsIgnoreCase("F")) {
                YonetimCikis.hoscakal();
            } else {
                System.out.println("Lütfen geçerli bir karakter giriniz");
                i--;
            }
        }
    }
}
