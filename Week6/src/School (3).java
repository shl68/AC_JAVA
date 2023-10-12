class Score{
    private int Score;

    public Score(int n){
        this.Score = n;   
    }
    public int getScore(){
        System.out.println("현재 점수는 : "+this.Score);
        return this.Score;
    }
}
class Lecture extends Score{
    String Lecture;
    int Score;

    public Lecture(String n, int a){
        super(a);
        this.Lecture = n;
        System.out.println("b");
    }
    // public void getTitle(){
    //     System.out.println(Lecture);
    // }
}
 // public class LectureManager extends Lecture{
    //     public LectureManager(){

    //     }
    //     public void getLectureManager(){

    //     }
    // }

public class School{
    public static void main(String[] args){
        Lecture ab = new Lecture("asc",12);
        ab.getScore();
    }
}