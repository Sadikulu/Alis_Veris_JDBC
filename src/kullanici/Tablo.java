package kullanici;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Tablo extends Database {
    public static void manavTabloCagir() {
        try {
            String sql2 = "select * from manav order by urun_id";
            ResultSet result1 = st.executeQuery(sql2);
            while (result1.next()) {
                System.out.printf("%2d %-7s %4.2f TL\n", result1.getInt(1), result1.getString(2), result1.getDouble(3));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void sarkuteriTabloCagir() {
        try {
            String sql2 = "select * from sarkuteri order by urun_id";
            ResultSet result1 = st.executeQuery(sql2);
            while (result1.next()) {
                System.out.printf("%2d %-13s %6.2f TL\n", result1.getInt(1), result1.getString(2), result1.getDouble(3));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void marketTabloCagir() {
        try {
            String sql2 = "select * from market order by urun_id";
            ResultSet result1 = st.executeQuery(sql2);
            while (result1.next()) {
                System.out.printf("%2d %-8s %5.2f TL\n", result1.getInt(1), result1.getString(2), result1.getDouble(3));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}