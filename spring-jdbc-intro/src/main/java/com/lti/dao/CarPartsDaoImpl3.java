package com.lti.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.lti.entity.CarPart;

@Component("carPartDao3")
public class CarPartsDaoImpl3 implements CarPartsDao {
	
@Autowired
private DataSource dataSource;

	public void addNewPart(CarPart cp1) {
		//No need to add connection and prepared statement 
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		jt.update("insert into TBL_CARPARTS values(?,?,?,?,?)",
			cp1.getPartNo() ,
			cp1.getName(),
			cp1.getCarModel(),
			cp1.getPrice(),
			cp1.getQuantity());
			
	}
		
	
public List<CarPart> getAvailableParts() {
		
	JdbcTemplate jt=new JdbcTemplate(dataSource);
	List<CarPart> list=jt.query("select * from TBL_CARPARTS",new CarPartRowMapper());			//CallBack  Function
	System.out.println("Get available parts called" +list);
	return list;
			
			}
			
	//Each row is getting mapped as an object  using RowMapper
		class CarPartRowMapper implements RowMapper<CarPart>{

			@Override
			public CarPart mapRow(ResultSet rs, int index) throws SQLException {
				//While loop implementation
				CarPart cp=new CarPart();
				cp.setPartNo(rs.getInt(1));
				cp.setName(rs.getString(2));
				cp.setCarModel(rs.getString(3));
				cp.setPrice(rs.getDouble(4));
				cp.setQuantity(rs.getInt(5));
				
				return cp;
			}
			
	
	}

}
