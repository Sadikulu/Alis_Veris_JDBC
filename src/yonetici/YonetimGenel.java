package yonetici;

import java.util.Scanner;


public class YonetimGenel {
    static Scanner scan = new Scanner(System.in);

    public static void genel(){
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz\n" +
                "1 Ürün Ekleme\n" + "2 Ürün Silme\n"+"3 Fiyat Güncelleme");
        for (int i = 0; i <1 ; i++) {
            try {
                int secim = scan.nextInt();
                if (secim == 1) {
                    UrunEkleme.ekleme();
                }else if (secim == 2) {
                    UrunSilme.silme();
                }else if (secim == 3) {
                    FiyatGuncelleme.fiyatGuncelleme();
                }else{
                    System.out.println("Geçerli bir işlem giriniz");
                    i--;
                }
            } catch (Exception e) {
                System.out.println("Geçerli bir işlem giriniz");
            }
        }
    }

}
