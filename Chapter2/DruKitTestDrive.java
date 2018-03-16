class DruKit{
	boolean topHat=true;
	boolean snare=true;
	void playTopHat(){
		System.out.println("ding ding da-ding");
	}
	void playSnare(){
		System.out.println("bang bang ba-bang");
	}
}
class DruKitTestDrive{
	public static void main(String[] args){
		DruKit d=new DruKit();
		d.playSnare();
		d.snare=false;
		d.playTopHat();
		if(d.snare==true){
			d.playSnare();
		}
	}
	
}