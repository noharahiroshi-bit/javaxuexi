/*
if语句的第一种写法:
if(布尔表达式){
	分支语句;
}

原理:如果布尔表达式true,则执行分支语句。
	 如果为false,则不执行。

练习：
	1.编写一个程序,输入一个人的年龄age,如果他的年龄大于等于18岁,则输出“你已经成年了”,否则不输出任何东西。
	2。编写一个程序,输入一个学生的分数score(百分制),如果学生的分数大于等于60,则输出“你已经及格了”,否则不
	输出任何东西。
	3.编写一个程序,输入一个学生的分数score(百分制),如果学生的分数大于等于60,则输出“你已经及格了”,如果学
	生的分数小于60,则输出“很抱歉,你不及格”。
*/
import java.util.Scanner;
public class IfTest01{
	public static void main(String[] args){
		//练习1
		Scanner s = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = s.nextInt();
		if (age >= 18)
		{
			System.out.println("你已成年");
		}
		//练习2,3
		System.out.println("请输入分数");
		int score = s.nextInt();
		if (score >= 60)
		{
			System.out.println("你及格了");
		}
		if (score < 60)
		{
			System.out.println("不及格");
		}



	}
}