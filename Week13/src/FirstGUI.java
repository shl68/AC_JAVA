import javax.swing.JFrame;
//방법
//– JFrame 클래스의 객체 생성
public class FirstGUI {
    public FirstGUI(){
        JFrame frame = new JFrame(); //탑 레벨 컨테이너 생성 . Jframe 객체에 접근할 수 있는 참조값 저장, 객체 생성하고 참조값을 frame 변수에 저장
        frame.setSize(400, 300); //폭과 높이 설정
        frame.setTitle("2023-11-30  윈도우 GUI 실습");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// X 버튼 눌러도 프로세스 상에서 종료되지 않기 때문에 종료하기 위해 생성
        frame.setVisible(true); // println과 같이 화면에 출력


    }
    public static void main(String[] args) {
        new FirstGUI(); // 객체만 생성하고 참조값 저장 x



    }
}