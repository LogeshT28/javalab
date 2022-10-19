interface Myinter{
	public void method1();
	public void method2();
}
class inter implements Myinter
{
	public void method1(){
		
		System.out.println("Implementation of method 1");
	}
	 
	public void method2(){
		
		System.out.println("Implementation of method 2");
	}
	
}
public class interfaces1
{
	public static void main(String[] args){
	inter a = new inter();
	a.method1();
	a.method2();
}
}