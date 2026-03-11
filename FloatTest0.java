/*
	一旦有浮点型数据参与运算得出的结果，一定不要使用“==”与其他数字进行“相等比较”
	理由：浮点型数据在计算机底层存储的都是它的近似值
*/
public class FloatTest0{
	public static void main(String[] args){
	
		double a = 6.9;
		double b = 3.0;
		double c = a / b;
		System.out.println("c=" + c);//c=2.3000000000000003

		if(c - 2.3 < 0.000000001){
			System.out.println("相等");
		}
	}
}