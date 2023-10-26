public class Sorter {   // 버블정렬
    public static int bubbleSort(SortInfce o, int b, int e)
    {
        int maxIdx = b;
        int i;
        for(i=b+1; i<=e; i++){
            if(o.isGreater(i, maxIdx))
                maxIdx = i;
        }
        return  maxIdx;

    }

}
