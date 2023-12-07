import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//step.1 처리할 이벤트 리스너 구현하는 클래스 생성
public class MyMouseHandelr implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) { //커서 들어올 때
        System.out.println("커서가 들어왔습니다.");
        for (int i=1; i<99; i++){
            System.out.println("커서가" + i + " 초 동안 들어왔습니다.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
