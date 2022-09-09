package yonetici;

import kullanici.Tablo;

import java.util.Scanner;

public class UrunSilmeSarkuteri extends Database {
    static Scanner scan=new Scanner(System.in);

    public static void urunSilme(){
        Tablo.sarkuteriTabloCagir();
        System.out.println("Silmek istediğiniz ürünün no'sunu giriniz");
        int id= scan.nextInt();
        try {
            String sql1="delete from sarkuteri where urun_id="+id;
            st.executeUpdate(sql1);
            Tablo.sarkuteriTabloCagir();
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
                        UrunSilmeSarkuteri.urunSilme();
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
