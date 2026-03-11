public class HomeWork02{
	public static void main(String[] args){
		
		int a,b;
		a = 100;
		b = 200;

		int c;
		c = b;
		b = a;
		a = c;
		int result = a + b;
		System.out.println(a + "+" + b + "=" + result);
		
	}
}