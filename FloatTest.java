/*
	浮点型数据：
		1.包括两个类型:
			float(四个字节):单精度，精确到七位小数
			double(八个字节)：双精度，精确到15位小数
		2.double是常用的
		3.浮点型的字面量默认都会被当成double类型来处理，如果想让其当成float类型的话，需要在字面量后面加F或是f			
		4.浮点型数据有两种表示方式：
			1.十进制
			2.科学计数法
*/
public class FloatTest{
	public static void main(String[] args){
		
		//不存在类型转换
		double d = 3.14;
		
		//float f = 3.14;
		//报错。
		//3.14默认为double类型 8个字节
		//f变量为4个字节，大容量不能直接转换为小容量
		
		//修改
		//第一种方案:不存在类型转换
		//float f = 3.14F;
		//第二种方案:强制类型转换
		//float f = (float)3.14;
		

		//如下证明double精度高于float
		double x = 1.5656856849;
		System.out.println(x);
		float y = 1.5656856849F;
		System.out.println(y);//精度损失
		
		//科学计数法
		double a = 0.123E2;
		System.out.println(a);//12.3(0.123*十的平方)

		double b = 123.34E-2;
		System.out.println(b);//1.2334(123.34除以十的平方)
	}
}