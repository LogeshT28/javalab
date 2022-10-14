class calculator
{
	public void arith(int a,int b){
		System.out.println(a+b);
	}
	public void arith(int a,int b,int c){
		System.out.println(a+b+c);
	}
	public void arith(int a,int b,int c,int d){
		System.out.println(a+b+c+d);
	}
	
}
public class overloading1{
	public static void main(String arg[]){
	calculator sum=new calculator();
	sum.arith(2,3);
	sum.arith(5,5,52);
	sum.arith(3,7,10);
		}
}