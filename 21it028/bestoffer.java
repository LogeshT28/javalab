class amazon{
	public void discount(){
	System.out.println("Amazon 10% instant discount");
	}
}
class flipkart extends amazon{
	public void discount(){
	System.out.println("Flipkart8% instant discount");
}
}

class meesho extends flipkart{
	public void discount(){
	System.out.println("Meesho21% flat discount");
}
}
public class bestoffer{
	public static void main(String arg[]){
	
	amazon a = new amazon();
	flipkart f = new flipkart();
	meesho m = new meesho();

	a.discount();
	f.discount();
	m.discount();

}
}
