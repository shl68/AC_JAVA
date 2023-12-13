public class Lecture extends Score {
    // Fields
    private String lectureName;

    // Constructors
    public Lecture(String name, int point) {
        super(point);
        lectureName = name;
    }

    // Methods
    public String getLectureName() {
        return lectureName;
    }

    public static void main(String[] args) {
        Lecture l = new Lecture("국어", 100);
    
        System.out.println(l.getLectureName());
        System.out.println(l.getPoint());
        l.setPoint(99);
        System.out.println(l.getPoint());
        l.setPoint(-1);
        System.out.println(l.getPoint());
    }
    
}
