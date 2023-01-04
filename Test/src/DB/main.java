package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Online Food","root","");
		Statement st=con.createStatement();
		String q="select * from ss";
		ResultSet ss=st.executeQuery(q);
		while(ss.next())
		{
			String name=ss.getString("name");
			System.out.println(name);
		}
		st.close();
		con.close();
	}

}
