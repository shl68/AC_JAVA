
public class Score {
    //필드
    private int point;

    //생성자
    public Score(int p) {
        point = p;//받은 점수 필드에 저장
    }

    //메서드
    //성적 설정 메소드
    public void setPoint(int p) {//int p는 성적을 바받음
        if( p>=0 && p<=100){
        point = p;}
    }

    public int getPoint()

    {
        //현재 포인트값을 리턴
        return point;
    }

    //lecture 클래스 과목명과 점수를 관리하는 기능을 수행 점수 관리는 score 클래스를 상속하여 수행함. 실질적으로 관리하는 것은 과목명


    public static void main(String[] args) {
        Score mine = new Score(900000);
        mine.setPoint(200);
        System.out.println(mine.getPoint());
    }
}
