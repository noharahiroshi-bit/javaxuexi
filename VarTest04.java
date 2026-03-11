/*
	变量的作用域：
		1.什么是作用域？
		  变量的有效范围。java中为一个{}
		2.记住一句话：出了大括号就不认识了。
*/
public class VarTest04{
	public static void main(String[] args){
	
	int age = 20;
	System.out.println("age =" + age);

	int num = 100;

	if(num > 50){
		int i = 666;
		System.out.println("i=" + i);
	}
		//错误：找不到符号
		//System.out.println("i=" + i);
	}
	//另一个方法(非main方法)。
	public static void doSome(){
		//错误：找不到符号
		//System.out.println("age =" + age);
	}
}