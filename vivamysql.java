import java.sql.*;
class MysqlCon{
public static void main(String args[])
{
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mylab1","root,"Piyush@12R");
statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from emp");
while(rs.next())
System.out.println(rs.getln(1)+:" "+ rs.getString(2)+" "+ rs.getString(3));
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}