package kullanici;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Sarkuteri {

    public static void urunler() throws SQLException {

        List<String> sepet = Secimler.sepet;

        Scanner scan = new Scanner(System.in);
        int urunSecim;
        if (Secimler.secim == 2) {
            System.out.println("lütfen ürün seçimini yapınız");
            Tablo.sarkuteriTabloCagir();
            urunSecim = scan.nextInt();
            System.out.println("Kaç kg almak istiyorsunuz");
            int kg = scan.nextInt();
            String sql1="Select urun_fiyati from sarkuteri where urun_id="+urunSecim;
            ResultSet rs1=Database.st.executeQuery(sql1);
            double fiyat=0;
            while (rs1.next()) {
                fiyat=rs1.getDouble(1);
            }
            Secimler.toplamFiyat += (kg * fiyat);
            String sql2="Select urun_adi from sarkuteri where urun_id="+urunSecim;
            ResultSet rs2=Database.st.executeQuery(sql2);
            String urun="";
            while (rs2.next()) {
                urun=rs2.getString(1);
            }
            sepet.add(urun);
            System.out.println(sepet);
            System.out.println("Toplam tutar : " + Secimler.toplamFiyat);
            for (int i = 0; i < 1; i++) {
                System.out.println("Devam etmek istiyormusunuz? T/F");
                String cevap = scan.next();
                if (cevap.equalsIgnoreCase("T")) {
                    for (int j = 0; j <1; j++) {
                        System.out.println("Aynı kategoride mi devam etmek istiyorsunuz? T/F");
                        String kcevap = scan.next();
                        if (kcevap.equalsIgnoreCase("T")) {
                            Sarkuteri.urunler();
                        } else if (kcevap.equalsIgnoreCase("F")) {
                            Secimler.secim();
                        }else {
                            System.out.println("Lütfen geçerli bir karakter giriniz");
                            j--;
                        }
                    }
                } else if (cevap.equalsIgnoreCase("F")) {
                    Odeme.odeme();
                } else {
                    System.out.println("Lütfen geçerli bir karakter giriniz");
                    i--;
                }
            }
        }
    }
}
