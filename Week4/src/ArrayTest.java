public class ArrayTest
    {
        public static void main(String[] args) {
            int [] array ;
            array = new int [10];
            array[0] = 1;

            for(int i = 0; i<array.length; i++)
            {
                array[i] = i;
                System.out.println(array[i]);
            }



        }
}
