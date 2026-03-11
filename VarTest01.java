/*
	变量
	1.变量是内存中的一块空间。是计算机中储存数据的最基本单元。
	2.三要素：数据类型/变量名/变量值
	  (数据类型决定空间大小)
	3.变量的声明/赋值/访问：
	  声明的语法格式：
		 数据类型 变量名；

		 数据类型：
		 int/double/String……

	  赋值的语法格式：
		 变量名 = 变量值；

	  访问怎么做？
	    访问包括读和修改。
		读：System.out.println(变量名);
		修改： 变量名=变量值；

*/
public class VarTest01{
	public static void main(String[] args){
	
	//声明
	int age;
	//赋值
	age = 20;
	//读
	System.out.println("年龄=" + age);
	//修改
	age = 30;
	//读
	System.out.println("年龄=" + age);
	age = 60;
	System.out.println("年龄=" + age);

	//age = "50";
	//不兼容的类型：String无法转换为int

	//定义一个变量，用来储存数学中的π
	double π = 3.14;

	System.out.println("圆周率：" + π);
	
	//声明可以和赋值同时进行。
	String name = "Jack";

	System.out.println("name=" + name);

	}
}