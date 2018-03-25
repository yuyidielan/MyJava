import java.util.Scanner;
public class TestString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串:");
        String str1=sc.next();
        System.out.println("请输入另一个字符串:");
		String str2=sc.next();
		if(str1.equals(str2)){
			System.out.println("str1和str2相等");
		}else{
			System.out.println("str1和str2不相等");
		}

	}
}