/*
总结：基本数据类型转换规则
	1.八种基本数据类型中除了boolean类型之外，都可以互相转换
	2.小容量可以自动转换为大容量，即自动类型转换
		byte < short/char < int < long < float < double 
	3.大容量转换成小容量的话不能自动类型，必须添加强制类型转换符，才可以编译，但有可能精度损失
	4.当整数型字面量没有超出byte short char 的范围时，可以直接将其赋值给byte short char 类型的变量
	5.byte short char 混合运算时，各自转换成int再做运算
	6.多种数据类型混合运算时，各自先转换成最大的容量，再做运算
*/
public class HomeWork03{
	public static void main(String[] args){
		//分析编译是否能通过

		//通过：100没超范围
		short s = 100;
		//报错：s-99是int类型
		//s = s - 99;
		//通过
		byte b = 100;
		//报错： b+1是int类型
		//b = b + 1;
		//通过
		char c = 'a';
		//通过
		int i = 20;
		//通过
		float f =.3F;
		//通过
		double d = c + i + f;
		//通过
		byte b1 = 11;
		//通过
		short s1 = 22;
		//报错： b1+s1是int类型
		//short x = b1 + s1;
	} 
}