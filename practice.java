// import java.sql.*;

// class practice {
//     public static void main(String[] args) {
//         String driver = "com.mysql.cj.jdbc.Driver";
//         String url = "jdbc://mysql://localhost:3306/yashika?useSSl=false";
//         String username = "root";
//         String password = "knr443";

//         try{
//             Class.forName(driver);
//             Connection con = DriverManager.getConnection(url, username, password);
//             System.out.println("database connection successfully");

//             Statement st = con.createStatement();
//             st.executeUpdate("create table hostel (name varchar(20),age int , id int)");
//             System.out.println("table created ");

//             st.executeUpdate("insert into hostel values('nani',25,12345)");
//             System.out.println("values added");

//             ResultSet rs = st.executeQuery("select *from hostel");
//             while(rs.next()){
//                 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//             }
//             con.close()
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("A thread " + i);
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("B thread " + i);
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class practice {
    public static void main(String[] args) {
        Runnable ob1 = new A();
        Runnable ob2 = new B();

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t2.start();
    }
}