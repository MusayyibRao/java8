package optional;

import java.util.Optional;

public class Optional1 {

	
	public static void main(String args[])
	{
	
	 Student st=new Student(1,"rao","rao123@gmail.com","1234567912","M.Tech");
	
	System.out.println("---------------------------------------");
	
   Optional<Object> emptyOptional= Optional.empty();
   
  
   System.out.println(emptyOptional);
   
  System.out.println("---------------------------------------");
   
  /*
   *  if name is null then we will get NullPointerException 
   */
  
  
   Optional<Object> ofOptional= Optional.of(st.getName());
   if(ofOptional.isPresent())
   {
   System.out.println(ofOptional.get());
   }
   System.out.println("---------------------------------------");
   
   /*
    *  if course is null then then print else condition
    */
   
   Optional<Object> ofNullableOptional= Optional.ofNullable(st.getCourse());
   
   if(ofNullableOptional.isPresent())
   {
   System.out.println(ofNullableOptional.get());
   }
   
   else {
	   
	   System.out.println("course is null");
	   
   }
System.out.println("---------------------------------------");
   
   /*
    *  if course is null then we will get BA 
    */
   
   Optional<Object> orElseOptional= Optional.ofNullable(st.getCourse());
   
   System.out.println(orElseOptional.orElse("BA")); 
   
System.out.println("---------------------------------------");
   
   /*
    *  if course is null then we will get throw exception 
    */
   
   Optional<Object> orElseThrowOptional= Optional.ofNullable(st.getCourse());
   
      System.out.println(orElseThrowOptional.orElseThrow(()-> new IllegalArgumentException("course data is not present")));
	}
	 
}
