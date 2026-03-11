/*
条件运算符
1.Java 语言中的条件运算符由 ? 和 : 组成,也被称为三元运算符。
它的语法格式为:

	布尔表达式  ?  表达式1  :  表达式2

2.当布尔表达式的值为true时,条件运算符的结果为表达式1的值,否则为表达式2的值。
这种运算符常用于简化if-else语句的代码量。

3.下面是一个条件运算符的简单示例:
int a = 5, b = 7;
int max = (a > b) ? a : b;
System.out.printIn("最大值为:”+max);

在上述代码中,首先定义了两个变量a和b,然后使用条件运算符比较这两个变量的大小,取其中较大值作为变量max的值,
最后输出结果。当a>b的结果为false时,条件运算符的结果为表达式2,即b的值为变量max的值。当a>b的结果为
true 时,条件运算符的结果为表达式1,即a 的值为变量max的值。

4.总的来说,条件运算符在 Java 中的使用相对简单,能够减少代码重复和代码量,常用于简单的条件处理和表达
式值的判断。
*/
public class OperatorTest13{
	public static void main(String[] args){
	
			// 不是一个java语句。
			//10;

			// 不是一个java语句。
			//'男';

			boolean sex = false;

			// 不是一个java语句。
			//sex?'男':'女';

			System.out.println(sex?'男':'女');

			char c = sex?'男':'女';
			System.out.println(c);

			// 错误:不兼容的类型:条件表达式中的类型错误
			//char cc=sex?'男':“女”;

			System.out.println(sex?'男':"女");//不报错



	}
}