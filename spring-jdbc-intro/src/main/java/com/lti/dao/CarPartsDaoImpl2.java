package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.lti.entity.CarPart;

@Component("carPartDao2")
public class CarPartsDaoImpl2 implements CarPartsDao {
	
@Autowired
private DataSource dataSource;

	public void addNewPart(CarPart cp1) {
		Connection con=null;
		PreparedStatement pst=null; //precompiled sql statement
		try {
			con=dataSource.getConnection();
			pst=con.prepareStatement("insert into TBL_CARPARTS values(?,?,?,?,?)");
			pst.setInt(1,cp1.getPartNo() );
			pst.setString(2,cp1.getName());
			pst.setString(3,cp1.getCarModel());
			pst.setDouble(4, cp1.getPrice());
			pst.setInt(5, cp1.getQuantity());
			
			pst.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			try {
				pst.close();
			}
			catch(Exception e) { }
		
		try {
			con.close();
		}
		catch(Exception e) { }
	}
	}
		
	
public List<CarPart> getAvailableParts() {
		
		Connection con=null;
		PreparedStatement pst=null; //precompiled sql statement
		ResultSet rs=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@infva06863:1521:xe","hr","hr");
			pst=con.prepareStatement("select * from TBL_CARPARTS");
			rs=pst.executeQuery();
			
			List<CarPart> list=new ArrayList<CarPart>();
			while(rs.next()) {
				CarPart cp=new CarPart();
				cp.setPartNo(rs.getInt(1));
				cp.setName(rs.getString(2));
				cp.setCarModel(rs.getString(3));
				cp.setPrice(rs.getDouble(4));
				cp.setQuantity(rs.getInt(5));
				
				list.add(cp);
			}
			return list;
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
		finally {
			try {pst.close();} catch(Exception e) { }
			
			try {con.close();} catch(Exception e) { }
		
	        try {rs.close();} catch(Exception e) { }
		}
	

		return null;
	}

}
