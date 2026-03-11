/*
	当整数型字面量没有超出byte的取值范围(-128--127)时，可以直接赋值，不进行强制类型转换
	short同理 取值范围为-32768--32767
*/
public class IntTest04{
	public static void main(String[] args){
	
	byte b = 1;
	byte a = 127;
	//报错，超出取值范围
	//byte c = 128;

	byte c = (byte)128;
	System.out.println(c);//-128
	}
}