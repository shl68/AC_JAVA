public class Lecture extends Score{
    //필드
    private String lectureName;
    private int Score;
    //생성자
    public Lecture(String l, int p){
        super(p);
        lectureName = l;
        Score = p;
    }

    //메소드
    public String getLectureName(){
        return lectureName;
    }
    public static void main(String[] args) {
        Lecture l = new Lecture("국어", 100);
        System.out.println(l.getLectureName());
        System.out.println(l.getPoint());
        l.setPoint(99);
        System.out.println(l.getPoint());
        l.setPoint(-1);
        System.out.println(l.lectureName);
    }
}

