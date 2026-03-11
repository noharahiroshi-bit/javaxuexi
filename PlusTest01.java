/*
 java中的 “ + ”运算符：
	1.+ 运算符在java中的两个作用？
	  第一个作用：求和(两边都是数字)
	  第二个作用：字符串的拼接(两边只要有一边是字符串，则进行拼接，结果仍是字符串)
	
*/
public class PlusTest01{
	public static void main(String[] args){

		System.out.println(10+20);//求和 30 (整数) 
		System.out.println("10"+20);//拼接 "1020" (字符串)
		//多个+时，如果没有小括号，则从左到右。
		//10+20求和/ 30,"30"拼接
		System.out.println(10+20+"30");//拼接 "3030" (字符串)
		
	}
}