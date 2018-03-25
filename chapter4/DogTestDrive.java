import java.util.*;
class Dog{
	double size;
	String name;
	void bark(){
	if(size>60){
	    System.out.println("This is a old Dog!!!!\nWooof!Wooof!");
	}else if(size>14){
        System.out.println("This is a young Dog!!!!\nRuff! Rufff!");
	}else{
	System.out.println("This is a small Dog!!!!\nYip!Yip!");
	}
	}
}
class DogTestDrive{
	public static void main(String[] args){
		Dog one =new Dog();
		Scanner reader=new Scanner(System.in);
		while(reader.hasNextDouble()){
		double x1=reader.nextDouble();任4￥
		one.size=x1;
		Dog two=new Dog();
        double x2=reader.nextDouble();
		two.size=x2;
		Dog three=new Dog();
		double x3=reader.nextDouble();
		three.size=x3;
		one.bark();
		two.bark();
		three.bark();
		}
		
	}
}