/*
	++ 自加1
	-- 自减1
	
	1.++可以在变量前，也可以在变量后
		像： i++，++i

		++这种运算符，只有一边有操作数，所以称作一元运算符

		+这种的 a+b两边都有操作数的叫做二元运算符
	2.无论在变量前还是变量后，执行结束后都会让变量中的值自加1
	
	3.++在变量后
		先做赋值运算，后自加1
	4.++在变量前
		先自加1，后赋值

*/
public class OperatorTest02{
	public static void main(String[] args){
		
		int i = 10;
		i++;
		System.out.println(i);

		int a = 10;
		++a;
		System.out.println(a);
		
		int k = 10;
		int f = k++;//原理：先将k的值赋给f，然后k自加1
		System.out.println("k=" + k);//11
		System.out.println("f=" + f);//10

		int e = 100;
		int x = ++e;
		System.out.println("e=" + e);//101
		System.out.println("x=" + x);//101

		int y = 100;
		System.out.println(y++);//100
		System.out.println(y);//101

		int z = 100;
		System.out.println(++z);//101
		System.out.println(z);//101
	}	
}