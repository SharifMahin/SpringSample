package repository;

import dto.UserSearchRequest;
import model.User;

public interface UserMapper {
	
	User search ( UserSearchRequest user ) ;

}
