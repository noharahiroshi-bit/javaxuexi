/*
逻辑运算符
  1.有哪些
	& 逻辑与(并且) ：两边都true 结果就是true 只要一边false，结果就false
	| 逻辑或(或者) ：两边只要有一边是true，结果就是true。
	^ 逻辑异或     ：两边不一样，结果就为true
	! 逻辑非       ：取反 --> !false结果就是true

	&& 短路与      	   
	|| 短路或
		短路运算结果与逻辑完全相同，但会有短路现象。
		&& 左侧是false发生短路(右侧不运行)
		|| 左侧是true发生短路(右侧不运行)

  2.逻辑运算符的特点
		两边的操作数要求是布尔类型
		并且最终运算结果也是布尔类型
*/
public class OperatorTest04{
	public static void main(String[] args){
	
		int a = 100;
		int b = 90;

		System.out.println(a > b & a > ++b);//true
		b = 99;
		System.out.println(a > b && a > ++b);//false

		System.out.println( true | true);//true
		System.out.println( true | false);//true
		System.out.println( false | true);//true
		System.out.println( false | false);//false
		
		/*
		int x = 99;
		int y = 100;
		//逻辑与
		System.out.println(x > y & x > ++y);
		System.out.println("y = "+ y);//101
		*/
		int x = 99;
		int y = 100;
		//短路与
		System.out.println(x > y && x > ++y);
		System.out.println("y = " + y);//100
	}
}
