/*
if语句的第四种写法:
if(布尔表达式){
	分支1;
}else if(布尔表达式){
	分支2;
Jelse if(布尔表达式){
	分支3;
Jelse{
	分支4;
}

练一练:
1.编写一个程序,输入一个数字num,判断它是否为正数、负数或零,并输出对应的信息。例如,如果num是正数,则输
出“num是正数”,如果num是负数,则输出“num是负数”,如果num等于0,则输出“num等于0”。
2.编写一个程序,输入一个学生的分数score(百分制),根据成绩的不同输出不同的评价。如果学生的分数大于等于90
分,则输出“你的成绩是优秀”;如果分数大于等于80分但小于90分,则输出“你的成绩是良好”;如果分数大于等于70
分但小于80分,则输出“你的成绩是中等”;如果分数大于等于60分但小于70分,则输出“你的成绩是及格”;否则输出”
你的成绩不及格”。
3.编写一个程序,输入一个年份year和一个月份month,判断这个月份有多少天。判断方法如下:
1).如果month为1、3、5、7、8、10、12中的一个,输出“month有31天”;
2).如果month为4、6、9、11中的一个,输出“month有30天”;
3).如果month为2并且year为闰年,输出“month有29天”;(如果一个年份能够被4整除但不能被100整除,或者能够
被400整除,那么它就是闰年)
4). 如果month为2并且year不是闰年,输出"month有28天”。
*/
import java.util.Scanner;
public class IfTest03{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		//练习1
		System.out.println("输入一个数");
		int num = s.nextInt();
		if (num > 0){
			System.out.println(num + "是正数");
		}else if (num == 0){
			System.out.println(num + "是0");
		}else if (num < 0){
			System.out.println(num + "是负数");
		}
		//练习2
		System.out.println("输入你的分数");
		int score = s.nextInt();
		System.out.println(score >= 90 ? "优秀" : score >= 80? "良好" : score >= 70? "中等" : score >= 60 ? "合格" : "不合格");
		//练习3
		System.out.println("输入一个年份");
		int year = s.nextInt();
		System.out.println("输入一个月份");
		int month = s.nextInt();
		if ((month == 1)||(month == 3)||(month == 5)||(month == 7)||(month == 8)||(month ==10)||(month == 12)){
			System.out.println(month + "月有31天");
		}else if ((month == 4)||(month == 6)||(month == 9)||(month == 11)){
			System.out.println(month + "月有30天");
		}else if ((month == 2) && (((year % 4 ==0) && (year % 100 !=0))||(year % 400 == 0))){
			System.out.println(year + "年的" + month + "月有29天");
		}else{
			System.out.println(year + "年的" + month + "月有28天");
		}
	}
}