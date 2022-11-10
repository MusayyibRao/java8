package mapMethod;

import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {


	public static void main(String args[])
	{

		List<Employee> emp=EmployeeData.getData();


		System.out.println("-----------------------------Map-----------------------------");

		List<String> list1 = emp.stream().map(e ->e.getName()).collect(Collectors.toList());

		System.out.println(list1);

		System.out.println("--------------------------Map-------------------------------");


		List<Integer> list2=emp.stream().map(e->e.getSalary()).collect(Collectors.toList());

		System.out.println(list2);


		System.out.println("-------------------------------Map------------------------------");

		List<List<String>> list3=emp.stream().map(e->e.getPhoneNo()).collect(Collectors.toList());

		System.out.println(list3);

		System.out.println("----------------------------FlatMap---------------------------------");

		List<String> list4 = emp.stream().flatMap(e->e.getPhoneNo().stream()).collect(Collectors.toList());
		
		System.out.println(list4); 


	}

}
