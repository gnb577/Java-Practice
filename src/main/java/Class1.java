public class Class1 {
    public static void main(String[] args){
        /*
            Class vs Object vs Instance
                1. class : 설계도와 틀
                2. object : 설계도가 생성하는 실체
                3. instance : 실제로 구현된 실체

            Q : 2,3번의 경계가 애매하다....
            A : 붕어빵을 찍는 틀이 클래스(class), 붕어빵이 객체(object), 틀로 찍어낸 팥 붕어빵1, 팥 붕어빵2 , 슈크림 붕어빵1이 각각 인스턴스 (instance)

            class 변수 vs instance 변수
                1. class 변수 : static변수 (모든 클래스가 같은 값을 공유하는 변수)
                2. instance 변수 : 일반 변수 (모든 클래스가 같은 값을 공유하지 않는 변수)

            ※ static 장점
                1. 생성 시 마다 할당이 필요없어 상황에 따라 메모리 효율 증가
                2. 속도가 빠르다 (객체 생성이 없고 이미 만들어져있는걸 호출해서 쓰니까)

            ※ static 변수의 단점
                1. 프로그램의 시작과 끝까지 메모리에 남아 공간 낭비
                2. 생성과 소멸에 관여할 수 없음
                3. 쓰레드 사용시 동시성 문제 ( 이건 진짜 중요한 문제 )
                4. static 멤버는 serialization 불가 ( 객체 직렬화는 instance만 적용)
                5. 어려운 디버깅 (이건 해봐야 알듯)

           ※ JVM 관점
               1. Method Area : JVM 실행 시 생성, class와 static변수 영역, class파일의 바이트 코드 로드
               2. Stack  Area : 로컬변수와 파라미터 저장, 임시 할당하고 소멸되는 것들 저장
               3. Heap   Area : new 명령어로 만드는 메모리, 메소드 호출이 끝나도 유지되는 값들 (가비지 컬렉터에서 지울때까지, 아니면 jvm이 유지시킴)
               * 원시타입 변수를 제외하고는 모두 heap 영역에 실제 변수 값, stack 영역에 주소 값을 가짐

          	• 인스턴스 메소드는 클래스 멤버 (변수, 메소드)에 접근 ( o )
            • 클래스 메소드는 인스턴스 멤버에 접근 (x)
        */

    }
}
