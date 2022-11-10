package lambdaExpression;

interface LambdaEx1 {

	//void lambdaMethod();
	void sumMethod(int a,int b);	 

}

/*
 * after using the lambda expression not need to required implements the interface. 
 */


public class LambdaEx {

	public static void main(String[] args)
	{

		//LambdaEx1 lambdaEx= ()-> System.out.println("this is interface method");

		//	    lambdaEx.lambdaMethod();

		LambdaEx1 lambdaEx1 =(a,b)->{
			System.out.println("sum of two number:"+(a+b));
		};  

		lambdaEx1.sumMethod(20,50); 
	}


}
