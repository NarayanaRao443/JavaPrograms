// Table creation

SQL> create table account(acno number(10), name varchar(20),balance number(10));

//Table created


SQL> desc account;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ACNO                                               NUMBER(10)
 NAME                                               VARCHAR2(20)
 BALANCE                                            NUMBER(10)

SQL> select *from account;

//no rows selected

// commit is used to save the entered data
SQL> commit;

//Commit complete.

SQL> select * from account;

      ACNO NAME                    BALANCE
---------- -------------------- ----------
       101 amit                       2000
       102 kumar                      3000
       103 raj                        4000



SQL> select name from account;

NAME
--------------------
amit
kumar
raj

SQL> select acno,name from account;

      ACNO NAME
---------- --------------------
       101 amit
       102 kumar
       103 raj

SQL> select * from account where acno=103;

      ACNO NAME                    BALANCE
---------- -------------------- ----------
       103 raj                        4000

       
SQL> update account set balance = balance+3000;

//3 rows updated.

SQL> select * from account;

      ACNO NAME                    BALANCE
---------- -------------------- ----------
       101 amit                      13000
       102 kumar                     13000
       103 raj                       13000

SQL> update account set balance = balance + 1000 where acno = 101;

//1 row updated.

SQL> select * from account;

      ACNO NAME                    BALANCE
---------- -------------------- ----------
       101 amit                      14000
       102 kumar                     13000
       103 raj                       13000


SQL> delete from account where acno=102;

//1 row deleted.

SQL> select * from account;

      ACNO NAME                    BALANCE
---------- -------------------- ----------
       101 amit                      14000
       103 raj                       13000

       
SQL> delete  from account;

//2 rows deleted.

SQL> select * from account;

//no rows selected


SQL> desc account;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ACNO                                               NUMBER(10)
 NAME                                               VARCHAR2(20)
 BALANCE                                            NUMBER(10)

SQL> drop table account;

//Table dropped.

SQL> desc account;
//ERROR:
//ORA-04043: object account does not exist


Create table in DB from JDBC app

DDL : Create, Drop 
      Statement

DML : Insert, Delete, Update 
      PreparedStatement 

DRL : Select 
      All records - Statement
      One record - PreparedStatement

DDL:  // return type is string

      Statement st = con.createStatement();
      st.execute("create table ....");
      st.execute("drop table ....");

DML: // return type is integer
      Statement st = con.createStatement();
      int count = st.executeUpdate("insert... ");
      int count = st.executeUpdate("update....");
      int count =  st.executeUpdate("update....");

DRL: // return type is boolean
      ResultSet rs = executeQuery("select ...");
      while(rs.next()){
            System.out.println(rs.getInt(1) + " "+ rs.getString(2));
      }


Static SQL Queries: A Query without values

Statement:  by using Statement we can execute only Static Queries
            Statement st = con.createStatement();

DDL:
            st.execute("create table...");
            create table account(....);
            drop table account;
DML:
            st.executeUpdate("insert into....");
            delete from account;
DRL: 
            ResultSet rs = st.executeQuery("select ....");
            select * from account;

Dynamic SQL Queries: A Query with dynamic values

PreparedStatement: by using preparedStatement we can execute dynamic SQL query
            Statement st = con.preparedStatement();

DML: 
            String query = "insert into account values(?,?,?)";
            PreparedStatement ps  = con.preparedStatement(query);

            System.out.println("Enter account details: ")
            int num = scan.nextInt();
            String name = scan.nextLine();
            int balance = scan.nextInt();

            ps.setInt(1,num);
            ps.setString(2,name);
            ps.setInt(3,balance);
            int count = ps.executeUpdate();

            // delete
            String query = "delete from account where num = ?";
            PreparedStatement ps  = con.preparedStatement(query);

            System.out.println("Enter account num to delete: ")
            int num = scan.nextInt();

            ps.setInt(1,num);
            int count = ps.executeUpdate();

            // display
             String query = "select * from account where num = ?";
            PreparedStatement ps  = con.preparedStatement(query);

            System.out.println("Enter account num to delete: ")
            int num = scan.nextInt();

            ps.setInt(1,num);
            ResultSet rs = ps.executeQuery();
