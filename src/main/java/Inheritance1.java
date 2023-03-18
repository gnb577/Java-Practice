class Calc {
    int first, second;
    static int third = 30;
    public Calc(){
        System.out.println();
        System.out.println("Calc New");
        first  = 3;
        second = 5;
    }

    public void sum(){
        System.out.println();
        System.out.println("Sum Execute");
        System.out.println("first : "+first+", second : "+second+", sum : "+ (first+second));
    }

    public void avg(){
        System.out.println();
        System.out.println("Super Avg Execute");
        System.out.println("first : "+first+", second : "+second+", avg : "+ (first + second) / 2);
    }
}

class SubCalc extends Calc{
    int first = 10;
    int second = 20;
    static int third = 50;

    public SubCalc(){
        System.out.println();
        System.out.println("subCalc New");
    }

    public void substract(){
        System.out.println("Substract Execute");
        System.out.println("[super] first : "+super.first+", second : "+super.second+", sub : "+(super.first - super.second));
        System.out.println("[this] first : "+first+", second : "+second+", sub : "+(this.first - this.second));
    }

    @Override
    public void avg() {
        System.out.println();
        super.avg();
        System.out.println("Avg Execute");
        System.out.println("[super] first : "+super.first+", second : "+super.second+", avg : "+(super.first + super.second)/2);
        System.out.println("[this] first : "+first+", second : "+second+", avg : "+(this.first + this.second)/2);
    }
}

public class Inheritance1{
    public static void main(String[] args){
        SubCalc sCalc = new SubCalc();
        sCalc.sum();
        sCalc.avg();
        //sCalc.super.avg(); --> 호출 불가 ( 반드시 함수 내에서 super.avg()로 호출하는 식으로 정의 )
        sCalc.substract();

        System.out.println();
        Calc   calc  = new SubCalc();
        calc.sum();
        calc.avg();
        //calc.substract(); SubCalc 객체를 생성하니 this와 super는 그대로 유지된다. 하지만 기능은 calc의 기능만 활용이 가능한 형태가 상속이다.

        int a = sCalc.first;
        int b = sCalc.third; // calc의 third를 가져오고 싶다면 내부에서 호출
        int c = SubCalc.third;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
    }
}
