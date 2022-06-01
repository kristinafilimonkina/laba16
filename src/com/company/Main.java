package com.company;

class Expression{
    int a;
    int b;
    int c;

    Expression(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void displayExpression() {
        double r = a * Math.pow(b, c);
        System.out.println(r);
    }
}
class Expression2 {
    int f;
    int d;
    int n;

    Expression2(int f, int d, int n) {
        this.f = f;
        this.d = d;
        this.n = n;
    }

    public void displayExpression() {
        double r = f * Math.pow(d, n);
        System.out.println(r);
    }
}
@FunctionalInterface
interface Converter <Expression,Expression2> {
    Expression2 convert(Expression n);

}
public class Main {

    public static void main(String[] args) {
        Expression one = new Expression(2,3,6);
        Converter pp = x -> new Expression2(one.a, one.b, one.c);
        Expression2 two = (Expression2) pp.convert(one);
        two.displayExpression();

    }
}
