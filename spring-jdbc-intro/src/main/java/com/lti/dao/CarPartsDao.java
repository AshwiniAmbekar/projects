package com.lti.dao;

import java.util.List;
import com.lti.entity.CarPart;

public interface CarPartsDao {
	public void addNewPart(CarPart carPart);
	
	public List<CarPart> getAvailableParts();
}
