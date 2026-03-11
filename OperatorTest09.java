/*
按位或 |
将两个整数的二进制表示按位进行或运算,只有当相应的二进制位都为0时,结果才为0,否则结果为1
即：
	1|0：1
	0|1：1
	1|1：1
	0|0：0

int a = 32;
int b = 25;
System.out.println(a | b) ; // 57
a的二进制: 00100000
b的二进制: 00011001
按位或之后:00111001
*/
public class OperatorTest09{
	public static void main(String[] args){
		// 00100011
		int a = 35;
		// 00011011
		int b = 27;
		/*
		00100011
	|   00011011
	-------------
		00111011
		*/
		System.out.println(a | b);//59

	//按位或的具体应用：将某个2进制位设置为1
	//将0的2进制位低位第四位二进制位设置为1
		int flag = 0;//00000000
		flag = flag | (1 << 3);
		System.out.println(flag);

	}
}