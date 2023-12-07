import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//step1. 이벤트를 처리해줄 리스너를 구연하는 클래스를 정의하는 것
public class ActionHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { //import
        System.exit(0);

    }
}