/*
iload_1:将局部变量表1号槽位的数据复制一份，压入操作数栈
istore_2:将操作数栈顶元素弹出，存储到局部变量表的2号槽位上
*/
public class ReadClass02{
	public static void main(String[] args){
		int i = 10;
		int j = i;
	}
}
/*
Compiled from "ReadClass02.java"
public class ReadClass02 {
  public ReadClass02();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: bipush        10
       2: istore_1
       3: iload_1
       4: istore_2
       5: return
}
*/