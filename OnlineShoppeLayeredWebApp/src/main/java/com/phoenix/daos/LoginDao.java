package com.phoenix.daos;

/*@md.faisal
 * 
 */

import java.sql.SQLException;
import java.util.List;
/*
 * @author md.faisal
 */
import com.phoenix.data.User;
//DAO Data Access Object Interface
public interface LoginDao {
	
	//CRUD Methods
	User getUserbyId(String username) throws SQLException;
	List<User>getAllUsers() throws SQLException;
	void insert (User user) throws SQLException;
	void update (User user) throws SQLException;
	void delete (User user) throws SQLException;

}
