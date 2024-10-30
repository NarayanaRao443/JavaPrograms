
// set classpath="C:\Program Files (x86)\MySQL\mysql-connector-java-8.0.28.jar\"
// set classpath="C:\Program Files (x86)\MySQL\mysql-connector-j-8.1.0.jar\"
import java.sql.*;

class Jdbc {
    public static void main(String args[]) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/school?useSSl=false";
        String username = "root";
        String password = "knr443";

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            st.executeUpdate("insert into documents values('Nani raj','123123')");
            System.out.println("succesfully added");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}