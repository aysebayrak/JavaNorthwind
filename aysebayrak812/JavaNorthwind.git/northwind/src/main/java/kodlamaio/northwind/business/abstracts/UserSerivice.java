package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;

public interface UserSerivice  {
	
	Result add(User user);
	
	DataResult<User> findByEmail(String email);

}
