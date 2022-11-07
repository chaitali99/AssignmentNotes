package que2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/unit5_sb101";
		
		try(Connection conn=DriverManager.getConnection(url,"root", "Root@123")) {
			
			PreparedStatement ps=conn.prepareStatement("delete from product where quantity<2");
			
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				System.out.println("Record deleted successfully.......");
			}else {
				System.out.println("deletion fails..............");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
