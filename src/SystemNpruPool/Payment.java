/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemNpruPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Godonlyknows
 */
public class Payment {
    public void InsertPaymet(int money,  String Datepay ,
           String time,
           String type,
           int uid,
           int stid
          ){
       
		Connection connect = null;
                Statement stmt = null;
		
		try {
                        Class.forName("com.mysql.jdbc.Driver");
                        String urlConnection = "jdbc:mysql://127.0.0.1/npru_pool?useUnicode=true&characterEncoding=UTF-8";
                        connect = DriverManager.getConnection ( urlConnection, "root", "" );
			stmt = connect.createStatement();
			String sql = "INSERT INTO payment " +
					"(P_Money,P_Date,P_Time,P_Type,U_Id,St_Id) " + 
					"VALUES ('" + money+ "','" + Datepay + "'"
                                + "" +
					",'" + time + "','" + type + "','" + uid + "','" + stid + "') ";
                         stmt.execute(sql);
             
                         
             
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

