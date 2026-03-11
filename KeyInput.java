/*

*/
public class KeyInput{
	public static void main(String[] args){
		
		//1.创建一个键盘扫描器对象
		//以下代码中的s是变量名，只要是合法的标识符就可以
		//可以把s叫做键盘扫描器
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		//程序到这里就会停下，等待键盘输入，没有输入就会一直卡住不动
		//知道输入内容回车后，这行代码就执行结束
		//s.nextInt()会专门从键盘上扫描int类型数据的数字，然后将扫描到的数字赋值给num变量
		//这样就完成了数据从控制台到内存
		//针对nextInt()方法来说，只能接收整数数字，输入其他的字符串就会报错
		int num = s.nextInt();

		System.out.println("输入的数字是：" + num);

		//想接收double类型的数据
		//执行到这里会停下等待输入
		double num2 = s.nextDouble();
		System.out.println("输入的浮点数据是：" + num2);

		//想接收字符，但是接收的是第一个空格之前的内容，即有空格的话，不会接受空格后的内容
		String username = s.next();
		System.out.println("你好" + username);

		//同上，但是是接收第一个换行符\n之前的内容，即接受一行的内容
		s.nextLine();//第一次调用这个方法是为了读取缓存中遗留的\r回车符
		String name = s.nextLine();//第二次才会真正的接收输入
		System.out.println("你好" + name);



	}
}