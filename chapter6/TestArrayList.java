import java.util.*;
public class TestArrayList{
	public static void main(String[] args){
          ArrayList<String> myList=new ArrayList<String>();
          String a=new String("whoohonn");
          String b=new String("Jack");
          myList.add(a);
          myList.add(b);
          System.out.println("the size:"+myList.size());
          System.out.println("the myList.get(1) is "+myList.get(1));
          myList.remove(1);
          boolean isIn=myList.contains(b);
          System.out.println("ISIN is "+isIn);
	}
}