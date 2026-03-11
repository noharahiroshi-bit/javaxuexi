/*
变量使用的细节；
	1.必须先声明，再赋值，才能访问。
	2.方法体中的代码遵循自上而下的顺序一次执行，变量先访问，再声明肯定不行。
	3.一行代码可以同时声明多个变量。
	4.在同一个作用域中，变量不能重名，可以重新赋值。
*/
public class VarTest03{
	public static void main(String[] args){
	
	int a,b,c = 300;//只有c被赋值，a和b还未被赋值
	a = 50;
	System.out.println(a);
	b = 30;
	System.out.println(b);
	System.out.println(c);


	//作用域就是有效范围，java中为一个{}
	int i = 100;
	//错误：已在main(String[])中定义了变量i
	//int i = 200;

	i = 200;//重新赋值ok

	System.out.println(i);
	}
}
