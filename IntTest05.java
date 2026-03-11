/*
	1.当两个int类型的数据进行运算时，结果还是int类型
	2.多种数据类型混和运算时，先各自转换成其中容量最大的，在做运算

*/
public class IntTest05{
	public static void main(String[] args){
	
	int a = 10;
	int b = 3;
	System.out.println(a / b);//3
	
	byte x = 10;
	int y = 3;
	long z = 100L;
	//报错
	//int result = x + y + z;
	
	//修改
	long result = x + y + z;
	System.out.println(result);//113
	
	}
}