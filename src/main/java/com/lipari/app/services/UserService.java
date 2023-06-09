package com.lipari.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lipari.app.exception.DataException;
import com.lipari.app.model.dao.AddressDao;
import com.lipari.app.model.dao.UserDao;
import com.lipari.app.model.vo.User;

@Service
public class UserService {
	
	UserDao userDao ;
	AddressDao addressDao; 
	
	@Autowired
	public UserService(UserDao userDao, AddressDao addressDao) {
		this.userDao = userDao;
		this.addressDao = addressDao;
	}

	public User loging(String username,String pass)  {
		
		try {
			User u= userDao.getUser(username, pass);				
			return u;
		} catch (DataException e) {			
			e.printStackTrace();
		}
		
		return null;
	}
	
public List<String> adressList(int userId)  {
		
		try {
			return addressDao.getAllAddress(userId);
		} catch (DataException e) {			
			e.printStackTrace();
		}
		
		return null;
	}
}
