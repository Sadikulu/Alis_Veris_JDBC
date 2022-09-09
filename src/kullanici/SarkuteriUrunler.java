package kullanici;

public class SarkuteriUrunler {

    public static void urunEkleme() {
        try {
            String str1="Insert into sarkuteri values (1,'Pastırma',200.95)";
            Database.st.execute(str1);
            String str2="Insert into sarkuteri values (2,'Kavurma',125.30)";
            Database.st.execute(str2);
            String str3="Insert into sarkuteri values (3,'Sosis',55.40)";
            Database.st.execute(str3);
            String str4="Insert into sarkuteri values (4,'Sucuk',152.95)";
            Database.st.execute(str4);
            String str5="Insert into sarkuteri values (5,'Salam',40.85)";
            Database.st.execute(str5);
            String str6="Insert into sarkuteri values (6,'Tavuk',65.90)";
            Database.st.execute(str6);
            String str7="Insert into sarkuteri values (7,'Bonfile',175.50)";
            Database.st.execute(str7);
            String str8="Insert into sarkuteri values (8,'Köfte',85.40)";
            Database.st.execute(str8);
            String str9="Insert into sarkuteri values (9,'Yumurta',43.70)";
            Database.st.execute(str9);
            String str10="Insert into sarkuteri values (10,'Zeytin',32.80)";
            Database.st.execute(str10);
            String str11="Insert into sarkuteri values (11,'Kaşar Peyniri',74.50)";
            Database.st.execute(str11);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
