package kullanici;

import java.sql.*;

public class Database {
    static Database db;

    static {
        try {
            db = new Database();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static Connection con = db.connet_to_db("Alis_Veris", "av_user", "A1234");
    static Statement st;

    static {
        try {
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) throws SQLException {
        db.createTable("manav");
        //ManavUrunler.urunEkleme();
        db.createTable("sarkuteri");
        //SarkuteriUrunler.urunEkleme();
        db.createTable("market");
        //MarketUrunler.urunEkleme();

        con.close();
        st.close();
    }
    public Connection connet_to_db(String dbName, String user, String password) {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbName, user, password);
            /*if (con != null) {
                System.out.println("Bağlantı sağlandı");
            } else {
                System.out.println("Bağlantı sağlanamadı");
            }*/
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public void createTable(String tableName) {
        try {
            String query = "CREATE TABLE " + tableName + "(urun_id integer,urun_adi varchar(255),urun_fiyati double precision)";
            st.executeUpdate(query);
            System.out.println("Table oluşturuldu.");
        } catch (Exception e) {
            System.out.println("Tablo zaten var");
        }
    }


}
