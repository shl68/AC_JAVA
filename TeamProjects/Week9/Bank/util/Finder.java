package util;

public class Finder<T> {

    public int finder(Compare<T> obj, int len, T v) {
        for (int i = 0; i < len; i++) {
            if (obj.isEqual(i, v)) {
                return i;       //정수 i와 T v가 일치했을 때 인덱스 i를 반환
            }
        }
        return -1;      // 찾지 못했을 때는 -1을 반환
    }
}

