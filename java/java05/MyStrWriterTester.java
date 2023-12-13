public class MyStrWriterTester {
    public static void main(String[] args) {
        // char -> byte -> file
        FileOutputStream fos = new FileOutputStream(new File("abc.dat"));
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        osw.writer("GOOD");
        osw.close();
        // char <- byte <- file
        FileInputStream fis = new FileInputStream(new File("abc.dat"));
        InputStreamReader isr = new InputStreamReader(fis);
        // data <- char <- keyboard
        Scanner kin = new Scanner(System.in);
        
    }
}
