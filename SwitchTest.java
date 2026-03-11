/*
switch分支语句完整格式:

switch(expression) {
	case value1:
		//当 expression 的值等于 value1时,执行这里的代码
	break;
	case value2:
		//当 expression 的值等于 value2时,执行这里的代码
	break;
	case value3:
		//当 expression 的值等于 value3 时,执行这里的代码
	break;
	// ...
	default:
		//当 expression 的值与所有的case 语句都不匹配时,执行这里的代码
}
注意：
1.expression表达式不能是布尔类型。
	这个表达式执行完后必须是一个值
	且类型必须是int或枚举或字符串(byte,short,char也可以，因为会自动类型转换)
2.value也必须是int，枚举，字符串
3.break;一旦执行，switch语句就会结束
4.case 后面必须是常量,不可以使用变量
*/
import java.util.Scanner;
public class SwitchTest{
	public static void main(String[] args){
		
		//报错，long类型不允许
		//long x = 100L;
		//switch(x){}

		//修改
		//long x = 100L;
		//switch((int)x){}

		//byte等可以自动转换成int类型。
			byte b = 1;
			switch(b){}

			short s = 1;
			switch(s){}

			char c = 'a';
			switch(c){}
	
		//编写一个程序,根据输入的月份,输出该月份所属的季节。
			Scanner x = new Scanner(System.in);
			System.out.println("请输入月份");
			int month = x.nextInt();
			switch(month){
				case 3,4,5:
					System.out.println("春季");
					break;
				case 6,7,8:
					System.out.println("夏季");
					break;
				case 9,10,11:
					System.out.println("秋季");
					break;
				case 12,1,2:
					System.out.println("冬季");
					break;
				default:
					System.out.println("输入正确的月份please");

			}
		/*	
		编写一个程序,根据输入的运算符符号,输出两个数的运算结果。
		例如输入符号为“+”,则输出两个数的和;输入符号为“-”,则输出两个数的差,以此类推。
		*/
		System.out.print("输入第一个数:");
		int num1 = x.nextInt();
		System.out.print("输入运算符");
		String oper = x.next();
		System.out.print("第二个数字是？");
		int num2 = x.nextInt();
		switch(oper){
			case "+":
				System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
				break;
			case "-":
				System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
				break;
			case "*":
				System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
				break;
			case "/":
				System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
				break;
			default:
				System.out.println("不支持这个运算符");
		}

	}
}