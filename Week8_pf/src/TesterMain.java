public class TesterMain {
    public static void main(String[] args) {
        //데이터를 저장할 객체
        IntData data = new IntData();
        //알고리즘을 위한 객체
        Sorter algorithm = new Sorter();
        //데이터와 알고리즘 분리

        //알고리즘을 이용해 정렬
        algorithm.bubbleSort(data, 0,9);

    }
}
