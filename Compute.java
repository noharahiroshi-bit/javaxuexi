/*
	接收两个整数，并求和
*/
public class Compute{
	public static void main(String[] args){
		 //创建键盘扫描器对象
		 java.util.Scanner s = new java.util.Scanner(System.in);

		 //输入欢迎提示信息
		 System.out.print("请输入第一个整数：");
		 int num1 = s.nextInt();

		 System.out.print("请输入第二个整数: ");
		 int num2 = s.nextInt();

		 int result = num1 + num2;
		 System.out.println(num1 + "+" + num2 + "="+ result);
	}	
}