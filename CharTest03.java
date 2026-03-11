/*
	char参与的运算 
*/
public class CharTest03{
	public static void main(String[] args){
		//byte short char混合运算时，各自转换成int再做运算
		System.out.println('a' + 1);//98

		char x = 'a' + 1;//98
		System.out.println(x);//b ：因为98对应字符b
	
		//多种数据类型混合运算时，各自转换成最大的在做运算

		byte b = 1;
		short s = 1;
		char c = 1;
		//short num = b + c + s;
		//修改
		//int num = b + c + s;
		//或是强转
		short num = (short)(b + c + s);
	}
}