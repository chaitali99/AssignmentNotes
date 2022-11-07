package que2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many product you wanted to insert............");
		int n=sc.nextInt();
		int i=0;
		int pid = 0,quantity = 0,price = 0;
		String name = null;
		while(i<n) {
			System.out.println("Enter the product "+(i+1)+" details");
			
			System.out.println("Enter product id: ");
			pid=sc.nextInt();
			
			System.out.println("Enter the product name: ");
			name=sc.next();
			
			System.out.println("Enter the quantity: ");
			quantity=sc.nextInt();
			
			System.out.println("Enter the price: ");
			price=sc.nextInt();
			
			
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url="jdbc:mysql://localhost:3306/unit5_sb101";
		
		try(Connection conn=  DriverManager.getConnection(url,"root","Root@123")){
			
			PreparedStatement ps= conn.prepareStatement("insert into product values(?,?,?,?)");
			
			ps.setInt(1, pid);
			ps.setString(2, name);
			ps.setInt(3, quantity);
			ps.setInt(4, price);
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				System.out.println(x+" record inserted successfully..............");
			}else {
				System.out.println("fails..................");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		i++;
		
	}
	}

}
