public class If{
    public static void main(String[] args){
      int x=2;
      String name="Dirk";
      if(x==10){
        System.out.print("x must be 10");
      }
      else{
          System.out.print("x isn't 10");
      }
      if((x<3)&(name.equals("Dirk"))){
          System.out.println("Gently");
      }
      System.out.print("this line runs no matter what");
   }
}