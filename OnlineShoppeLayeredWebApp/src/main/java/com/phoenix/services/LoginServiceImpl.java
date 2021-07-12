package com.phoenix.services;

import java.sql.SQLException;
import java.util.List;

import com.phoenix.daos.LoginDao;
import com.phoenix.daos.LoginDaoImpl;
import com.phoenix.data.User;
import com.phoenix.web.exceptions.ServiceException;
import com.phoenix.web.exceptions.UserNotFoundException;
//Service Interface Implementor Class
public class LoginServiceImpl implements LoginService {
	
	//Invokes DAO layer
	private LoginDao loginDao;
	public LoginServiceImpl() {
		//Creating DAO Implementor object in service layer
		loginDao=new LoginDaoImpl();
	}
	
	@Override
	public List<User> findAll() throws ServiceException{
		// TODO Auto-generated method stub
		try {
			return loginDao.getAllUsers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public User findById(String username) throws UserNotFoundException {
		// TODO Auto-generated method stub
		try {
			return loginDao.getUserbyId(username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new UserNotFoundException(e.getMessage());
		}
	}

	@Override
	public void add(User user) throws ServiceException {
		// TODO Auto-generated method stub
		try {
			loginDao.update(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public void edit(User user) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(User user) throws ServiceException{
		// TODO Auto-generated method stub
		try {
			loginDao.delete(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public List<User> sortByUsername() throws ServiceException {
		// TODO Auto-generated method stub
		try {
			List<User> users = loginDao.getAllUsers();
			//sort users by username
			return users;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public List<User> sortByPassword() throws ServiceException{
		// TODO Auto-generated method stub
		
		try {
			List<User> users;
			users = loginDao.getAllUsers();
			return users;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
		}
	
		
	}

	@Override
	public String changePassword(String newPassword)throws ServiceException{
		// TODO Auto-generated method stub
		try {
			User user = new User();
			user.setPassword(newPassword);
			loginDao.update(user);
			return "Password is updated successfully";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e.getMessage());
		}
	}

}
