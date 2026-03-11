/*
if语句的第二种写法:

if(布尔表达式){
		分支1;
}else{

		分支2;
}

原理:如果布尔表达式true,则执行分支1。
	 如果为false,则执行分支2。
练一练:
1.编写一个程序,输入一个数字num,判断它是否为7的倍数。如果是,则输出“num是7的倍数”,否则输出”num不是7的倍
数”。
2.编写一个程序,输入一个数字num,判断它是否同时为3的倍数和5的倍数。如果是,则输出“num既是3的倍数又是5的倍
数”,否则输出“num不同时是3的倍数和5的倍数”。
3.编写程序模拟用户登录,用户名和密码正确则登录成功,反之则登录失败。
*/
import java.util.Scanner;
public class IfTest02{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		//练习1
		System.out.println("请输入一个数字");
		int num = s.nextInt();
		if ((num%7) == 0)
		{
			System.out.println(num + "是7的倍数");
		}else{
			System.out.println(num + "不是7的倍数");
		}
		//练习2
		if ((num % 3 == 0) && (num % 5 == 0))
		{
			System.out.println(num + "既是3的倍数又是5的倍数");
		}else{
			System.out.println(num + "不同时是3的倍数和5的倍数");
		}
		//练习3
		//注意:字符串的比较不能使用“ == ”,必须手动调用equals方法来进行比较。(先记住,后面就知道了。)

		System.out.println("请输入用户名");
		String admin = s.next();
		System.out.println("请输入密码");
		String pw = s.next();
		String realadmin = "810230734";
		String realpw = "123456";
		if ((admin.equals(realadmin) ) && (pw.equals(realpw)))
		{
			System.out.println("登入成功");
		}else{
			System.out.println("登入失败");
		}
	}
}