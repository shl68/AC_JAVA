public class Lecture extends Score {
    private String title;
    public Lecture(String t, int n) {
        super(n);
        title = t;
    }
    public String getTitle() {
        return title;
    }
    public static void main(String[] args) {
        Lecture lec = new Lecture("국어", 99);
        System.out.println(lec.getTitle());
       


    }

}
