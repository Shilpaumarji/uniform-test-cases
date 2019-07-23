package com.training.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import com.training.bean.LoginBean;
import com.training.bean.UniformLoginBean;
import com.training.connection.GetConnection;
import com.training.utility.LoadDBDetails;

// Data Access Object 
public class UniformupskillDAO {
	
	Properties properties; 
	
	public UniformupskillDAO() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<UniformLoginBean> getLogins(){
		String sql = properties.getProperty("get.regestration"); 
		
		GetConnection gc  = new GetConnection(); 
		List<UniformLoginBean> list = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<UniformLoginBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				UniformLoginBean temp = new UniformLoginBean(); 
				temp.setfirstname(gc.rs1.getString(1));
				temp.setlastname(gc.rs1.getString(2));
				temp.setemail(gc.rs1.getString(3));
				temp.settelephone(gc.rs1.getString(4));
				temp.setaddress1(gc.rs1.getString(5));
				temp.setcity(gc.rs1.getString(6));
				temp.setpostcode(gc.rs1.getString(7));
				temp.setcountryid(gc.rs1.getString(8));
				temp.setzoneid(gc.rs1.getString(9));
				temp.setinputpassword(gc.rs1.getString(10));
				temp.setconfirmpassword(gc.rs1.getString(11));

				list.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
	public static void main(String[] args) {
		new UniformupskillDAO().getLogins().forEach(System.out :: println);
	}
	
	
}
