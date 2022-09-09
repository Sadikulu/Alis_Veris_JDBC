package kullanici;

import java.util.Scanner;

public class Odeme {
    public static void odeme() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nasıl ödemek istersiniz?\n"
                + "1 Kapıda nakit\n" + "2 Kredi kartı");
        int odeme = scan.nextInt();
        System.out.println("Sepet : " + Secimler.sepet);
        System.out.println("Toplam tutar : " + Secimler.toplamFiyat);
        if (odeme == 1) {
            System.out.println("Siparişiniz alınmıştır.");
        } else if (odeme == 2) {
            System.out.println("Lütfen kart sahibinin adını giriniz");
            String isim = scan.next();
            System.out.println("Lütfen kart sahibinin soyadını giriniz");
            String soyIsim = scan.next();
            for (int i = 0; i < 1; i++) {
                System.out.println("Lütfen kart numaranızı giriniz");
                String kartNo = scan.next();
                if (kartNo.length() == 16) {
                    System.out.println("Lütfen kartınızın son kullanma tarihini giriniz");
                    String skt = scan.next();
                    for (int j = 0; j < 1; j++) {
                        System.out.println("Lütfen CVC kodunuzu giriniz");
                        String cvc = scan.next();
                        if (cvc.length() == 3) {
                            System.out.println("Siparişiniz alınmıştır.");
                        } else {
                            System.out.println("CVC kodunuz hatalı lütfen tekrar deneyiniz");
                            j--;
                        }
                    }
                } else {
                    System.out.println("Kart numaranız hatalı tekrar deneyiniz");
                    i--;
                }
            }
        }
    }
}
