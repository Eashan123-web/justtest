package test1.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class ListIteratorDemo
{
    public static void main(String[] args) {
        Connection c=null;
        Statement stmt=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
//getting connection
            c= DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "system","12345");
            System.out.println("database successfully opened");
            stmt =c.createStatement();
            String sql="create table company15 " + "(id int primary key not null," + " name varchar(10) not null," + " age int not null," + "address varchar(50)," + "salary int)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getClass().getName()+":"+e.getMessage());
            System.exit(0);
        }
        System.out.println("table created successfully");
    }
}