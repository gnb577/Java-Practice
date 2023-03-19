public class DataType2 {
    public static void main(String[] args){
        /*
        //같은 데이터도 형의 따라 bit값이 상이하다.
           예시) 200
            1. int
            00000000    00000000    00000000    11001000

            2. float
            01000011    01001000    00000000    00000000

        //형 변환
            byte --> short
            int --> long --> float --> double

        // 타입 변경시 데이터 손실이 없을 경우 자동 형 변환이 일어난다.
        */
        double  sosu = 3.0F; // double > float이기에 double로 치환

        /*
            double = int + float
            1. int --> float
            2. float + float --> double 의 과정을 거친다.
        */
        int     a = 3;
        float   b = 10.0F;
        double  c = a + b;
        System.out.println(b/a); // 연산시 높은 데이터 형을 따른다.

        // 명시적 형 변환 ( 자동 형 변환이 실패해 오류가 나는 CASE )
        float fNum = (float)100.0; // 우측 값이 double 이므로 오류
        int iNum = (int)100F; // 우측이 float이여서 오류

    }
}
