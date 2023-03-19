public class DataType {
    public static void main(String[] args){
        // byte, short, int, long (1,2,4,8 byte의 정수형)
        // int형 지향 :  CPU 처리속도가 빠름
        // 1. why use byte? --> 127보다 작은 숫자로 이루어진 데이터
        /*
            1   경기도
            2   전라도
            3   충청도
        */
        byte    district = 1; //경기도
        int     num      = 20000;

        // float, double (4, 8byte의 실수형)
        // double형 지향 : 높은 byte수가 높은 정밀도를 만든다.
        double  sosu    = 1.23456;
        float   sosuf   = 1.23455F;

        System.out.println(sosuf);
        // char (2byte 문자이며 모든 유니코드 문자, c언어에서는 1byte)
        // String의 경우는 2 x n byte를 차지

        //궁금증
        /*
            1. String의 2 x n byte라는 데, EOF나 \n 같은 값은 안가져도 되는가?
            2. String 클래스의 문자열 길이의 한계
                Ans : 32bit머신 기준 2GB가 한계 ( 사실상 이럴 일이 없음)
            3. float에 F를 명시하는 이유 (Long에 L도)
                Ans : L,F를 붙이지 않으면 int형,double형으로 자동 형변환 (값 손실이 날 수 있음) , byte, short의 경우 int를 허용
        */

    }
}
