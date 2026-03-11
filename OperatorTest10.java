/*
按位异或 ^
将两个整数的二进制表示按位进行异或运算
只有当相应的二进制位不同,结果才为1,否则结果为0
即：
	1 ^ 1: 0
	0 ^ Θ: 0
	1 ^ 0: 1
	0 ^ 1: 1
int a = 100;
int b = 200;
System. out. printIn (a ^ b); // 172

a的二进制:   01100100
b的二进制:   11001000
按位异或之后:10101100

按位异或运算符具有自反性,所谓的自反性是指:数字A连续对数字B进行两次按位异或运算之后,可以得到原始
的数字A。因为按位异或运算符具有这样的特征,所以在密码学方面应用广泛。通常使用它可以完成加密和解密操
作。
即: a^b ^ b ==> a
*/
public class OperatorTest10{
	public static void main(String[] args){
	
		int a = 10;//00001010
		int b = 3;//00000011
		/*
		  00001010
		^ 00000011
		-----------
		  00001001
		*/
		System.out.println(a^b);//9
		
		//具体应用：简易的加密解密
		int data = 2147483647;

		//对以上的原始数据data进行加密
		//密钥
		int key = 483;

		//加密
		int password = data ^ key;

		//解密
		int num = password ^ key ;//data



	}
}