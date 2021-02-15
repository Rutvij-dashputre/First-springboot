package in.edac;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Demo1 extends JpaRepository<User, Integer> {

	User findByUserNameAndPassword(String UserName, String Password);

}
