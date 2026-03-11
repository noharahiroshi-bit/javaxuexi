/*
	强制类型转换
	大容量转换到小容量的时候，想让其编译通过的话，必须手动添加强制类型转换符
	强转后编译通过，运行时可能损失精度，却决于数据的大小。

*/
public class IntTest03{
	public static void main(String[] args){
		
		long x = 1000L;
		
		//错误： 不兼容的类型：long转换到int可能会有损失
		//int y = x;

		//强制类型转换
		int y = (int)x;

		long a = 55L;

		int b = (int)a;
		//强转，但不会精度损失
		//因为55L 分配八个字节时 前七个字节都是00000000
		//转换到4个字节只是砍掉4组00000000
		System.out.println("b=" + b);//55

		//k 对应四个字节 三组00000000 一组10000000
		//变成一个字节的byte去掉前三组00000000后 只剩10000000
		//但是此时的10000000是补码，对应的原码也是10000000 
		//而只有-128的原码补码是10000000
		//所以结果会精度损失变为-128
		int k = 128;

		byte e = (byte)k;

		System.out.println("e=" + e);//-128

		//练习
		int m = 129;
		byte n = (byte)m;
		System.out.println("n=" + n);//-127
		
		double d = 1;
		System.out.println(d);//1.0
	
	}
}