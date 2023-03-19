public class Scope2 {

     int        firstNum = 10;
     int        firstParam = 5;
     int        secondParam = 7;
     void a(){
         int    firstNum = 20;
         System.out.println(firstNum); //지역 변수 : 20
         System.out.println(this.firstNum); //인스턴스의 firstNum : 10
     }

     // 2가지 표현 방식 (this 필수, this 생략)
     void b(int firstParam,int _secondParam){
         this.firstParam = firstParam;
         secondParam     = _secondParam;
     }
    public static void main(String[] args){
        new Scope2().a();
    }
}
