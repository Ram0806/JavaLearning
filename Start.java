class calculator {
    public int sum(int a, int b) {
        int result = a+b;
        System.out.println("The result in class is " + result);
        return result;
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
        System.out.println("Calling the calculator class");
        calculator calc = new calculator();
        int result = calc.sum(n1, n2);
        System.out.println("Result is " + result);

        compare comp = new compare();
        boolean check =  comp.check(n1, n2);
        System.out.println(check);
    }
}
