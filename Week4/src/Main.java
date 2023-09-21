public class Main {
    public static void main(String[] argv) //argv - 스트링객체의 배열에 참조하기 위한 참조값
    {
        int[] data; // 배열에 대한 참조값
        int[] data2;
        data = new int[10]; // 정수값 10개를 저장하는 배열 객체, 거기에 접근하는 참조값 -> data

        data2 = data; // data의 값을 data2에 저장 배열 객체 2개가 아닌 같은 배열 객체에 접근하는 참조값이 2개
        data[0] = 99; // 참조값을 가지고 접근
        System.out.println(data2[0]);
    }
}