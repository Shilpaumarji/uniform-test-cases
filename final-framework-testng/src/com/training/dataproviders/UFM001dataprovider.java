package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.bean.UniformLoginBean;
import com.training.dao.UniformupskillDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class UFM001dataprovider {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<UniformLoginBean> list = new UniformupskillDAO().getLogins(); 
			
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(UniformLoginBean temp : list){
			Object[]  obj = new Object[11]; 
			obj[0] = temp.getfirstname();
			obj[1] = temp.getlastname();
			obj[2] = temp.getemail();
			obj[3] = temp.gettelephone();
			obj[4] = temp.getaddress1();
			obj[5] = temp.getcity();
			obj[6] = temp.getpostcode();
			obj[7] = temp.getcountryid();
			obj[8] = temp.getzoneid();
			obj[9] = temp.getinputpassword();
			obj[10] = temp.getconfirmpassword();
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
		String fileName ="C:\\Users\\ShilpaUmarji\\git\\unfirom-test-cases-unf001-to-unf003\\final-framework-testng\\Testdata\\TestdataUNFTD-003.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1"); 
	}
}
