/*

转义字符：
	\t ：表示制表符，相当于按下tab键
	\n ：表示换行符
	\" ：表示双引号
	\' ：表示单引号
	\\ ：表示反斜线本身
*/
public class CharTest02{
	public static void main(String[] args){
		
		char c1 = 't';//t字符

		char c2 = '\t';//制表符
		System.out.println("abc" + c2 + "def");

		System.out.print("hello\n");
		System.out.print("world\n");

		System.out.println("\"");//输出一个双引号
		
		System.out.println("'");//输出一个单引号
		System.out.println('\'');//输出一个单引号


	}
}