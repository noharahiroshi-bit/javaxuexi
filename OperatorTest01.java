/*
	算术运算符：
		1.算术运算符包括：
			+ ：求和，字符串拼接，正数
			- : 相减，负数
			* ：乘积
			/ ：商
			% ：取模(求余数)
				取模公式：x - x / y * y
			++ :让变量自身加一
			-- 让变量自身减一
*/
public class OperatorTest01{
	public static void main(String[] args){
		
		int a = 10;
		int b = +3;
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	
		int x = -1;
		int y = 3;
		//通过取模公式，分别带入x,y
		System.out.println(x % y);
		
		int i = 10;
		i++;//一元运算符(单侧有数)
		System.out.println(i);//11
	}
}