public class Animal extends Object{
    private int n,m; // default 같은 패키지 내 공개
    @Override // equlas 재정의
    public boolean equals(Object obj) // 컨텐츠가 같은지
    {
        Animal target = (Animal) obj; // 형변환하고 같은 클래스 객체 비교

        return  n == target.get(); // 값과 객체가 저장한 값 비교
        //return n == target.get() && m == target.get();


    }

    @Override
    public String toString(){
        return "hello :" + n;
    }

    public static void main(String[] args) {
        Animal a, b, c;
        a= new Animal();
        b= new Animal();
        c= new Animal();
        a.set(99);
        b.set(99);
        c.set(99);
        System.out.println(a.equals(b)); // 값이 동일한지
        System.out.println(a == b && b == c); // 참조값까지 동일한지
        System.out.println(a); // a 에 저장된 값 출력 toString 메서드 자동 출력 (객체 참조를 위한 참조값이 있었기 때문에)

    }
    public void set(int i ){
        n = i;
    }
    public int get(){
        return  n;

    }
}