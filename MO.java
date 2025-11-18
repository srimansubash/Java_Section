class MathUtils {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class MO {
    public static void main(String a[]){
        MathUtils o=new MathUtils();
        
        System.out.println("the value of double add() is:"+o.add(52.0,42.4));

        MathUtils o1=new MathUtils();
          
        System.out.println("the value of int add() is:"+o1.add(5,4));

    }

}
