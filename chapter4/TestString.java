import java.util.Scanner;
public class TestString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ���:");
        String str1=sc.next();
        System.out.println("��������һ���ַ���:");
		String str2=sc.next();
		if(str1.equals(str2)){
			System.out.println("str1��str2���");
		}else{
			System.out.println("str1��str2�����");
		}

	}
}