class Movie{
    String title; 
    String genre;
    int rating;
    void playIt(){
       System.out.println("Playing the movie");
       System.out.println("welcome to our group");
    }
    void showMovie(){
        System.out.println("title: "+title+"genre: "+genre+"rating: "+rating);
    }
}
public class MovieTestDrive{
     public static void main(String[] args){
          Movie one=new Movie();
          one.title="Gone with Stock";
          one.genre="Tragic";
          one.rating=-2;
          one.playIt();
          Movie two=new Movie();
          two.title="Lost in Cubicle Space";
          two.genre="Comedy";
          two.rating=5;
          two.playIt();
          Movie three=new Movie();
          three.title="Byte Club";
          three.genre="Tragic but ultimately uplifting";
          three.rating=127;
          three.playIt();
          three.showMovie();
    }
}