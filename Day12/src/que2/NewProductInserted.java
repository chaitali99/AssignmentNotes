package que2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewProductInserted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		System.out.println("Enter name of product: ");
		String name=sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/unit5_sb101";
		
		try(Connection conn=DriverManager.getConnection(url,"root", "Root@123")) {
			
			PreparedStatement ps= conn.prepareStatement("insert into product values(?,?,null,null)");

			ps.setInt(1, id);
			ps.setString(2, name);
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				System.out.println("Record inserted successfully.......");
			}else {
				System.out.println("Insertion fails..............");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
