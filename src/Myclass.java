import java.sql.*;
public class Myclass {
    public static void main(String[] args) {
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/container","root","1982");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from words");
            while (rs.next()){
                System.out.println(rs.getString(1));
            }
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }

}
