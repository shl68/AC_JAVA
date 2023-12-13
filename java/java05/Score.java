public class Score <T> {
    // Fields
    private T point;

    // Constructors
    public Score(T p) {
        point = p;
    }

    // Methods
    public void setPoint(T p) {
        point = p;
    }
    public T getPoint() {
        return point;
    }
    public static void main(String[] args) {
        Score<String> mine = new Score<String>("A");
        mine.setPoint("A+");
        System.out.println(mine.getPoint());
    }
}
