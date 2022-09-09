package kullanici;

public class MarketUrunler {

    public static void urunEkleme() {
        try {
            String str1="Insert into market values (1,'İkram',4.20)";
            Database.st.execute(str1);
            String str2="Insert into market values (2,'Cips',9.10)";
            Database.st.execute(str2);
            String str3="Insert into market values (3,'Tutku',5.50)";
            Database.st.execute(str3);
            String str4="Insert into market values (4,'Nutella',25.80)";
            Database.st.execute(str4);
            String str5="Insert into market values (5,'Hobby',3.10)";
            Database.st.execute(str5);
            String str6="Insert into market values (6,'Albeni',3.20)";
            Database.st.execute(str6);
            String str7="Insert into market values (7,'BenimO',3.80)";
            Database.st.execute(str7);
            String str8="Insert into market values (8,'Çekirdek',6.00)";
            Database.st.execute(str8);
            String str9="Insert into market values (9,'Dondurma',12.50)";
            Database.st.execute(str9);
            String str10="Insert into market values (10,'Jelibon',5.70)";
            Database.st.execute(str10);
            String str11="Insert into market values (11,'Tadelle',8.40)";
            Database.st.execute(str11);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
