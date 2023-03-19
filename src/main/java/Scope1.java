public class Scope1 {

    static int firstNum = 5;
    int        thirdNum = 8;
    public static void a(){
        //static int fourthNum = 0; (static함수 내에서는 static 변수 선언 ( x )
        int firstNum = 10;
        int secondNum = 7;
        //thirdNum (error) ( static함수는 global 일반 변수 참조 불가 --> static이 먼저 생성되니까 )
        System.out.println(firstNum); //10출력된다.
        b();
    }

    static void b(){
        System.out.println(firstNum); // scope상 가능해보이지만 static변수가 아니여서 global 영역의 5가 출력 ( 10은 무시된다. )
        //System.out.println(secondNum); // firstNum과 동일한 이유로 error
    }
    public static void main(String[] args){
        a();
    }
}
