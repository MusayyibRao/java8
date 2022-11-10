package mapMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeData {


	public static List<Employee> getData()
	{

		return Stream.of(

				new Employee(1,"raj","raj12@gmail.com",30000,Arrays.asList("1234567891","9876543211")),
				new Employee(2,"rao","rao773@gmail.com",2000,Arrays.asList("23456777771","123452123")),
				new Employee(3,"rajrao","raoraj13@gmail.com",1000,Arrays.asList("987656789","567898765"))
				).collect(Collectors.toList());

	}

}
