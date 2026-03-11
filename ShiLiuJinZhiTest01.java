/*
1.十六进制：满16进1
2.十六进制：
	1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c....
3.十进制转换：同其他
	
*/
public class ShiLiuJinZhiTest01{
	public static void main(String[] args){
		
		//0x开始为十六进制
		//十进制：326 --> 十六进制： 146
		System.out.println(0x146);
		
		//十六进制与二进制之间的转换
		//根据 二进制的1111-->十六进制的f 来一一对应
		//例如下的b1e2 b-->1011 ; 1-->0001 ; e-->1110 ; 2-->0010 
		 System.out.println(0b1011000111100010);//45538
		 System.out.println(0xb1e2);//45538
	}

}