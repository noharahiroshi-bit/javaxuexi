/*
 整数型字面量的四种表示形式
 十进制 二进制 八进制 十六进制
*/
public class IntTest01{
	public static void main(String[] args){
		int a = 10;
		int b = 0b10;
		int c = 010;
		int d = 0x10;
		System.out.println(a + b + c + d);//36
	}
}