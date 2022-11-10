package stream;



import java.util.Arrays;
import java.util.List;

public class SkipLimitDemo {

	
public static void main(String args[])
{
	

List<Integer> list= Arrays.asList(2,3,5,7,9,4,8);


list.stream().
        skip(1).
        limit(5).
        forEach(System.out::print);
          
  
}
	
}
