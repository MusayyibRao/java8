package stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String args[])
	{


		List<Integer> list=Arrays.asList(2,3,5,7,12,15);		

		System.out.println(list);

		System.out.println("----------------------------------------------");

		List<Integer> list1=list.stream().filter(e-> e>5).collect(Collectors.toList());

		System.out.println(list1);

		System.out.println("----------------------------------------------");

		List<Integer> list2= list.stream().filter(e->e.equals(5)).collect(Collectors.toList());
		System.out.println(list2);
		
		System.out.println("----------------------------------------------");

		List<Integer>list3= list.stream().map(m->m*2).collect(Collectors.toList());

		System.out.println(list3);
		
		System.out.println("----------------------1. sum value------------------------"); 

		Integer  list4= list.stream().mapToInt(i->i).sum();

		System.out.println("sum of array= "+list4);

		System.out.println("------------------------2.sum value----------------------");   

		Integer list5= list.stream().reduce(0,(a,b)-> a+b);

		System.out.println("sum of array= "+list5);

		System.out.println("--------------------1. max value-------------------------"); 

		Integer max=list.stream().reduce(1, (a,b)-> a>b?a:b);

		System.out.println("maximum value=" +max);

		System.out.println("----------------------2. max value------------------------"); 

		Integer max1= list.stream().reduce(Integer::max).get();
		System.out.println("maximum value ="+max1);


		System.out.println("----------------------------------------------");  

		Integer list6= list.stream().reduce(1,(a,b)-> a*b);

		System.out.println("multiplication of array= "+list6);



	}

}
