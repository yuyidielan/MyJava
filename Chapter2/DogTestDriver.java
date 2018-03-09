class Dog{
      int size;
      String breed;
      String name;
      void bark(){
          System.out.println("Ruff!Ruff!");
     }  
     void show(){
        System.out.println("this dog is :"+name+"\nsize is "+size+";\nbreed is "+breed);
     } 
 }
public class DogTestDriver{
     public static void main(String[] args){
         Dog d=new Dog();
         d.size=40;
         d.name="jack";
         d.breed="nice";
         d.bark();
         d.show();
     }
}