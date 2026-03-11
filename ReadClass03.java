/*
5: iinc          2, 1 : 将局部变量表2号槽位加1
*/
public class ReadClass03{
	public static void main(String[] args){
		int i = 10;
		int j = i;
		j++;
	}
}
/*
Compiled from "ReadClass03.java"
public class ReadClass03 {
  public ReadClass03();
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
       5: iinc          2, 1
       8: return
}
*/