package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.UserSearchRequest;
import model.User;
import repository.UserMapper;

@Service
public class UserService {

	    @Autowired
	    private UserMapper userMapper;
	    
	    public User search ( UserSearchRequest userSearchRequest ) { 
	        return userMapper. search ( userSearchRequest ) ;
	    }
}
