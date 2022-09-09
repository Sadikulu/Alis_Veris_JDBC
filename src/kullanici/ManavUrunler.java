package kullanici;

public class ManavUrunler {

    public static void urunEkleme() {
        try {
            String str1="Insert into manav values (1,'Domates',2.10)";
            Database.st.execute(str1);
            String str2="Insert into manav values (2,'Patates',3.20)";
            Database.st.execute(str2);
            String str3="Insert into manav values (3,'Biber',1.50)";
            Database.st.execute(str3);
            String str4="Insert into manav values (4,'Soğan',2.30)";
            Database.st.execute(str4);
            String str5="Insert into manav values (5,'Havuç',3.10)";
            Database.st.execute(str5);
            String str6="Insert into manav values (6,'Elma',1.20)";
            Database.st.execute(str6);
            String str7="Insert into manav values (7,'Muz',6.10)";
            Database.st.execute(str7);
            String str8="Insert into manav values (8,'Çilek',4.30)";
            Database.st.execute(str8);
            String str9="Insert into manav values (9,'Kavun',1.90)";
            Database.st.execute(str9);
            String str10="Insert into manav values (10,'Üzüm',2.70)";
            Database.st.execute(str10);
            String str11="Insert into manav values (11,'Limon',0.50)";
            Database.st.execute(str11);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}