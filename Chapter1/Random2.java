public class Random2{
     public static void main(String[] args){
        int intFlag=0;
        do{
          intFlag=(int)(Math.random()*100);
          String flag=String.valueOf(intFlag);
          if(flag.length()==2 ){
             System.out.println(intFlag);
          }
          else{
                intFlag=intFlag+100;
                /*System.out.println(intFlag);     */      
          }
          }while(intFlag>=100);
     }
}
          