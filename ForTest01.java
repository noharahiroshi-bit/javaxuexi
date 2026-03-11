/*
	循环语句：
		1.for，while，do while三种
		2.代码需要多次执行时，可以采用循环语句
	for循环：
		1.语法结构：
			for(初始化表达式;条件表达式;更新表达式){
				循环体；
			}
		2.初始化表达式最先执行，且只执行1次；
		  条件表达式的执行结果必须是布尔类型的值；
		  更新表达式负责更新某个变量值，以防止死循环。
		3.执行原理:
		   先执行一次初始化表达式-->
		   执行条件表达式-->true-->执行循环体-->执行更新表达式
		   执行条件表达式-->false-->结束
*/
import java.util.Scanner;
public class ForTest01{
	public static void main(String[] args){
		
		//for后面小括号的三个表达式都不是必须的
		//for(;;){System.out.println("死循环");}
		//ctrl+c结束死循环
		
		//普遍写法 输出0到9 
		/*
			for(int i = 0; i < 10; i++){
			System.out.println("i = " + i);
		}
		*/

		//for循环内定义的变量，外部访问不了
		/*
			for(int index = 0; index < 10; index++){
			System.out.println("index = " + index);
		}
		错误:找不到符号
		System.out.println("index = " + index);
		*/

		//练习 输出1~100的偶数
		for(int i = 2; i<101;i += 2){
			System.out.println(i);
		}

		//练习 输出1~100所有偶数的和
		int sum = 0;
		for(int a = 2;a <= 100;a += 2){
			if (a<100){
				System.out.print(a + "+");
			}else{
				System.out.print(a);
			}
			sum += a;
		}
		System.out.println("=" + sum);

		//计算n的阶乘
		Scanner s = new Scanner(System.in);
		System.out.print("计算n的阶乘，请输入数字:");
		int n = s.nextInt();
		long result = 1;
		if (n < 0) {
			System.out.println("负数没有阶乘");
			return;
		}
		for(int x = n;x > 0 ; x--){
			result *= x;
		}
		System.out.println(n + "!=" + result);

		//for循环嵌套

		for (; ; )
		{
		}
	}
}