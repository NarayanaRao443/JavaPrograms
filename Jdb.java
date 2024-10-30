// set classpath="C:\Program Files (x86)\MySQL\mysql-connector-j-8.1.0.jar\"
// set classpath=%classpath%;mysql-connector-j-8.1.0.jar\;     

import java.util.*;
import java.sql.*;

public class Jdb {

    public static void main(String[] args) throws Exception {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/johnson?useSSl=false";
        String username = "root";
        String password = "knr443";
        String query = "select * from student";

        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, username, password);
        // System.out.println("connection success");
        Statement st = con.createStatement();
        // st.executeUpdate("create table student(id int , name varchar(20), class
        // varchar(10))");
        // st.executeUpdate("insert into student values(123,'nani kumar','E4')");
        // System.out.println("values inserted");

        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
        }
        System.out.println("values displayed ");
        con.close();

    }
}