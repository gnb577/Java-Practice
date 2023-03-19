public class Init1 {
    static int first  = 1;
    int        second = 2;

    // 최초 1회 초기화 영역 ( 객체가 생성되던 안되던 상관없이 )
    static {
        System.out.println("initStatic");
        System.out.println("initNormal static : "+first);
        //System.out.println(third); (error : 선언위치가 하단이여서)
        first = 3;
    }

    // 객체 생성시마다 초기화 영역
    {
        System.out.println("initNormal");
        second = 4;
        System.out.println("initNormal First : "+first);
        System.out.println("initNormal Second : "+second);
        System.out.println("initNormal Third : "+third); // static이 먼저 로드되어 상관 무
    }
    static int third = 3;

    Init1(){
        second = 5;
    }

    public static void main(String[] args){
        System.out.println();
        System.out.println("Main First :"+first);
        System.out.println();
        System.out.println("Main Second :"+new Init1().second);
        System.out.println();
        System.out.println("Main Second :"+new Init1().third);
    }
    /*
        [ 결과 ]
        initStatic
        initNormal static : 1

        Main First :3

        initNormal
        initNormal First : 3
        initNormal Second : 4
        initNormal Third : 3
        Main Second :5

        initNormal
        initNormal First : 3
        initNormal Second : 4
        initNormal Third : 3
        Main Second :3
    */
}
