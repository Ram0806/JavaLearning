class calculator {
    public int sum(int a, int b) {
        int result = a+b;
        System.out.println("Adding line back");
        return result;
    }

    public int sum (int a,int b,int c) {
        return a+b+c;
    }
}

class compare {
    public boolean check (int a, int b) {
        boolean result = false;

        if (a > b) {
            result=true;
            System.out.println("The value of " + a + " is greater than " + b);
        }
        return result;
    }
}

public class Start {
    public static void main(String[] args) {
        int n1 = 70;
        int n2 = 20;
        int n3 = 50;
        System.out.println("Calling the calculator class");
        calculator calc = new calculator();
        int r1 = calc.sum(n1, n2);
        System.out.println("Result is " + r1);
        int r2 = calc.sum(n1, n2, n3);
        System.out.println("Result is " + r2);

        compare comp = new compare();
        boolean check =  comp.check(n1, n2);
        System.out.println(check);
    }
}
