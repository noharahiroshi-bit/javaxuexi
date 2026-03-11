/*
	编译器的小心思
*/
public class IntTest06{
	public static void main(String[] args){
	
	byte b = 10/3;//编译期已经算出结果 编译后的class文件直接就是 byte b = 3;
	System.out.println("b=" + b);

	byte x = 10;
	byte y = 3;
	
	//byte c = x/y;
	//错误: 不兼容的类型: 从int转换到byte可能会有损失
	//编译阶段只知道x/y的结果是int类型，但是不知道具体结果	
	//修改
	int c = x/y;
	System.out.println("c=" + c);
	
	
	//byte short 混合运算时，先各自转换成int再做运算
	//byte + byte --> int
	//byte + short --> int
	//short + short --> int
	short m = 10;
	byte n = 10;
	int result = m + n;//结果是int类型，不能用short类型接收
	System.out.println(result);
	
	byte e = 3;
	//byte f = 10/e;
	//编译报错，除数换成变量也是编译期只知道类型是int
	
	
	//修改1
	//int f = 10/e;
	//修改2 
	//注意byte 10/e 都要小括号括起来
	byte f = (byte)(10/e);
	}
}