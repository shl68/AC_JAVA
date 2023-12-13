import java.util.Stack;

public class TesterGeneric {
    public static void main(String[] args) {
         Stack<String> s = new Stack<String>();
         Stack<Score> is = new Stack<Score>();
         
        s.push("GOOD");
        s.push("MORNING");

        System.out.println(s.pop());
    }
}
