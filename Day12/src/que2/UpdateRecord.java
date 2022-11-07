package que2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the quantity of product:");
		int quantity=sc.nextInt();
		
		System.out.println("Enter the price of product");
		int price=sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/unit5_sb101";
		
		try(Connection conn=DriverManager.getConnection(url,"root", "Root@123")) {
			
			PreparedStatement ps=conn.prepareStatement("update product set quantity=?,price=? where quantity is null and price is null");
			
			ps.setInt(1, quantity);
			ps.setInt(2, price);

			int x=ps.executeUpdate();
			
			if(x>0) {
				System.out.println("Record updated successfully.......");
			}else {
				System.out.println("Updation fails..............");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
