import java.sql.*;

public class Sql {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/vasandb1";
        String uname = "root";
        String password = "root";
        String query = "Select * from user where id = 1";

        Connection con = DriverManager.getConnection(url, uname, password);
        Statement st = con.createStatement();
        // st.executeUpdate("insert into employee values(6,'gp',26,'ceo')");
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getString("Name") + " " + rs.getInt("Id"));
        }
        st.close();
        con.close();
    }
}
