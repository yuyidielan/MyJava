
public class Random{
     public static void main(String[] args){
       String[] name={"yangdong","yan"};
       int Length=name.length;
       int rand1=(int)(Math.random()*Length);
       String phrase=name[rand1];
       System.out.println("What we need is a " +phrase);
     }
}