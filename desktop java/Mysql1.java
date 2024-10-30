
/*
import java.sql.*;
class Mysql1
{
    public static void main(String args[])
    {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/school?useSSL = false";
        String username = "root";
        String password = "knr443";

        try
        {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            st.executeUpdate("insert into student values('Nani','kumar',130443,'E4')");
            System.out.println("Inserted");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
*/
/*
import java.sql.*;
class Mysql1
{
    public static void main(String args[])
    {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
        String username ="root";
        String password = "knr443";

        try
        {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Database connected successfully");

            Statement st = con.createStatement();
            st.executeUpdate("create table faculty(fname varchar(20), salary int, subject varchar(30))");
            System.out.println("Table created successfully");

            st.executeUpdate("insert into faculty values('Rakshit',20000,'Telugu')");
            System.out.println("Values added successfully");

            ResultSet rs = st.executeQuery("select *from faculty");
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" | "+ rs.getString(2)+" | "+rs.getString(3));
            }
            con.close();
        } 
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
*/
import java.sql.*;

class Mysql1 {
    public static void main(String args[]) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/school?useSSl=false";
        String username = "root";
        String password = "knr443";

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successfully");

            Statement st = con.createStatement();
            st.executeUpdate("create table document(name varchar(20), age int, study varchar(20)");
            System.out.println("Table created ");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
