/*
	布尔型：
		1.boolean值在java中只有true false 没有1和0
		2.boolean类型的数据的作用：逻辑判断，条件判断等等
*/
public class BooleanTest01{
	public static void main(String[] args){
	
		//boolean flag = 1;
		//不兼容的类型：int无法转换为boolean
	
		boolean flag = true;

		boolean gender = true;

		if(gender){
			System.out.println("male");
		}else{
			System.out.println("female");
		}
		
		int a = 1000;
		int b = 200;

		if (a>b){
			System.out.println(a + ">" + b);
		}else{
			System.out.println(a + "<" + b);
		}
	
	}
}