package in.edac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class Day16SpringBoot1Application implements CommandLineRunner {

	@Autowired
	Demo1 demo1;

	public static void main(String[] args) {

		SpringApplication.run(Day16SpringBoot1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// enterData();
		// updateData();
		// specificUpdate();
		// delete();
		//findAllDemo();
		selfQuery();
	}

	public void enterData() {
		User obj = new User();
		obj.setMobile(20222222);
		obj.setUserName("dashu");
		obj.setPassword("ashu");
		demo1.save(obj);
	}

	public void updateData() {
		User obj = new User();
		obj.setId(1);
		obj.setUserName("sals");
		demo1.save(obj);
	}
	
	public void specificUpdate() {
		User obj = demo1.findById(2).get();
		obj.setUserName("sakhar");
		demo1.save(obj);

	}

	public void delete() {
		demo1.deleteById(1);

	}

	public void findAllDemo() {
		List<User> list = demo1.findAll();
		list.stream().map(User::getUserName).forEach(System.out::println);

	}
									
	
	public void selfQuery() {
		User obj = demo1.findByUserNameAndPassword("sakhar","ashu");
		System.out.println(obj.getUserName() + " "  +  obj.getPassword());
	}
}










