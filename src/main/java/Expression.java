
public class Expression { // E = M/ N where M is integer, N is natural
    private int m;
    private int n;

    public Expression(int a) {
        this.m = a;
        this.n = 1;
    }

    public Expression(int m, int n) {
        if (n < 0) {
            this.n = -n;
            this.m = -m;
        } else if (n == 0) {
            throw new ArithmeticException("Division by zero(n > 0)");
        } else {
            this.n = n;
            this.m = m;
        }
        simplify();
    }

    public Expression add(Expression b) {
        return new Expression(m * b.n + b.m * n, b.n * n);
    }

    private void simplify() {
        int g = gcd(Math.abs(m), n);
        m /= g;
        n /= g;
    }


    int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    @Override
    public String toString() {
        return "" + m + " / " + n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expression that = (Expression) o;
        return m == that.m &&
                n == that.n;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }
}
