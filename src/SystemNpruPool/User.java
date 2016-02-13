/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemNpruPool;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Date;
/**
 *
 * @author Godonlyknows
 */
public class User extends U_System{
    public int u_Id;
   public String u_Firstname;
   public String u_Lastname;
    public String u_Address ; 
    public String u_Birthday ;
    public String u_CardId ;
  public   int u_Type ;
   public  String u_Tel;
    public void ShowUser(){
		Connection connect = null;
                Statement stmt = null;
		
		try {

Class.forName("com.mysql.jdbc.Driver");
String urlConnection = "jdbc:mysql://127.0.0.1/npru_pool?useUnicode=true&characterEncoding=UTF-8";
connect = DriverManager.getConnection ( urlConnection, "root", "" );
stmt=connect.createStatement();
		
             
			
			
			String sql = "SELECT *FROM user JOIN payment WHERE user.U_Id = payment.U_Id ; ";
			
			ResultSet rec = stmt.executeQuery(sql);
			
			while((rec!=null) && (rec.next()))
            {
             
               u_Id= rec.getInt("U_Id");
               u_Firstname =rec.getString("U_Firstname");
               u_Lastname = rec.getString("U_Lastname");
               u_Type = rec.getInt("U_Type");
               u_CardId = rec.getString("U_CardId");
               u_Tel = rec.getString("U_Tel");
                       
             //pay_Id = rec.getInt("P_Id");
            // pay_Type = rec.getString("P_Type");
           //  pay_Money  = rec.getInt("P_Money");
                 System.out.print(rec.getString("U_Id"));   
                System.out.print(" - ");
                System.out.print(rec.getString("U_Firstname"));
                System.out.print(" - ");
                System.out.print(rec.getString("U_Lastname"));
                System.out.print(" - ");
                System.out.print(rec.getString("P_Money"));
                System.out.print(" - ");
                System.out.print(rec.getString("U_Address"));
                System.out.print(" - ");
                System.out.print(rec.getDate("U_Birthday"));
                System.out.print(" - ");
                System.out.print(rec.getString("U_CardId"));
                System.out.print(" - ");
                System.out.print(rec.getInt("U_Type"));
                System.out.print(" - ");
                System.out.print(rec.getString("U_Tel"));
                System.out.print(" - ");
                System.out.print(rec.getInt("P_Id"));
                System.out.print(" - ");
                System.out.print(rec.getInt("P_Money"));
                System.out.print(" - ");
                System.out.print(rec.getString("P_Type"));
                System.out.println("");
            }
           
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			stmt.close();
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
    


    public void InsertUser(String name, String lastname, String address, String birthday, String cardId, int type, String tel) {
       
		Connection connect = null;
                Statement stmt = null;
		
		try {
                        Class.forName("com.mysql.jdbc.Driver");
                        String urlConnection = "jdbc:mysql://127.0.0.1/npru_pool?useUnicode=true&characterEncoding=UTF-8";
                        connect = DriverManager.getConnection ( urlConnection, "root", "" );
			stmt = connect.createStatement();
			String sql = "INSERT INTO user " +
					"(U_Firstname,U_Lastname,U_Address,U_Birthday,U_CardID,U_Type,U_Tel) " + 
					"VALUES ('" + name + "','" + lastname + "'"
                                + "" +
					",'" + address + "','" + birthday + "','" + cardId + "','" + type + "','" + tel + "') ";
                         stmt.execute(sql);
             
                         System.out.println("Record User Inserted Successfully");
             
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Close
		try {
			if(connect != null){
				stmt.close();
				connect.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

    @Override
    public void UpdateUser(String u_Id,String name, String lastname, String address, String birthday, String cardId, int type, String tel) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   	Connection connect = null;
                Statement stmt = null;
		
		try {
                        Class.forName("com.mysql.jdbc.Driver");
                        String urlConnection = "jdbc:mysql://127.0.0.1/npru_pool?useUnicode=true&characterEncoding=UTF-8";
                        connect = DriverManager.getConnection ( urlConnection, "root", "" );
			stmt = connect.createStatement();
                        String sql = "UPDATE User " +
					"SET U_Firstname = '" + name + "' " +
                                "SET U_Lirstname = '" + lastname + "' " +
                                "SET U_Address = '" + address + "' " +
                                "SET U_Birthday = '" + birthday + "' " +
                                "SET U_CardID = '" + cardId + "' " +
                                "SET U_Type = '" + type + "' " +
                                "SET U_Tel = '" + tel + "' " +
					" WHERE U_ID = '" + u_Id + "' ";
             stmt.execute(sql);
            
             System.out.println("Record Update Successfully");
             
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Close
		try {
			if(connect != null){
				stmt.close();
				connect.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    

    @Override
    public void DeleteUser(int U_Id) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Connection connect = null;
                Statement stmt = null;
		
		try {
                        Class.forName("com.mysql.jdbc.Driver");
                        String urlConnection = "jdbc:mysql://127.0.0.1/npru_pool?useUnicode=true&characterEncoding=UTF-8";
                        connect = DriverManager.getConnection ( urlConnection, "root", "" );
			stmt = connect.createStatement();
                        String sql = "DELETE FROM user " +
					" WHERE U_ID ='" + U_Id + "' ";
             stmt.execute(sql);
            
             System.out.println("Record Delete Successfully");
             
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Close
		try {
			if(connect != null){
				stmt.close();
				connect.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    }
    
 
    

