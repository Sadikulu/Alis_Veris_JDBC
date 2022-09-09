package yonetici;

import java.util.Scanner;

public class Yonetim {

    public static void panel() {
        String yonEmail = "sadik";
        String yonPassword = "124578";
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen email adresinizi giriniz");
        for (int i = 0; i < 1; i++) {
            String email = scan.next();
            if (!email.equals(yonEmail)) {
                System.out.println("Geçerli email giriniz");
                i--;
            } else {
                System.out.println("Lütfen şifrenizi giriniz");
                for (int j = 0; j < 1; j++) {
                    String pasword = scan.next();
                    if (!pasword.equals(yonPassword)) {
                        System.out.println("Geçerli şifre giriniz");
                        j--;
                    } else {
                        YonetimGenel.genel();
                    }
                }
            }
        }
    }
}