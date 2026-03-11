/*
从键盘接收一个三位数。然后分别输出他的个位十位百位
*/
public class OperatorHomework{
	public static void main(String[] args){
	
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("输出一个三位数：");
		int num = scanner.nextInt();
		System.out.println("它的百位是:" + (num/100));
		System.out.println("它的十位是:" + ((num -(num/100)*100)/10));
		System.out.println("它的个位是:" + (num - ((num/100)*100) - (((num -(num/100)*100)/10)*10)));
	}
}