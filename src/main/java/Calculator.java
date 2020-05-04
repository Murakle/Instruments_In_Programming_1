
public class Calculator { //Array of the expressions and operations with them
    Expression[] expressions;

    public Calculator() {
        expressions = new Expression[26];
    }

    /*
        run operations:
            exit
            set c = m/n
            add a + b = c
            sub a - b = c
            div a / b = c
            mult a * b = c
            out c
            outall
     */
    public void run() {
        IO rw = new IO();
        String operation = "";
        while (true) {
            operation = rw.nextToken();
            if (operation.equals("exit")) return;
            if (operation.equals("add")) {
                rw.printF("Enter what to add(two letters):\n");
                char a = rw.nextToken().charAt(0);
                char b = rw.nextToken().charAt(0);
                rw.printF("Enter where to store(one letter):\n");
                char where = rw.nextToken().charAt(0);
                sum(where, a, b);
            } else if (operation.equals("sub")) {
                rw.printF("Enter what to subtract(two letters):\n");
                char a = rw.nextToken().charAt(0);
                char b = rw.nextToken().charAt(0);
                rw.printF("Enter where to store(one letter):\n");
                char where = rw.nextToken().charAt(0);
                subtract(where, a, b);
            } else if (operation.equals("div")) {
                rw.printF("Enter what to divide(two letters):\n");
                char a = rw.nextToken().charAt(0);
                char b = rw.nextToken().charAt(0);
                rw.printF("Enter where to store(one letter):\n");
                char where = rw.nextToken().charAt(0);
                divide(where, a, b);
            } else if (operation.equals("mult")) {
                rw.printF("Enter what to multiply(two letters):\n");
                char a = rw.nextToken().charAt(0);
                char b = rw.nextToken().charAt(0);
                rw.printF("Enter where to store(one letter):\n");
                char where = rw.nextToken().charAt(0);
                multiply(where, a, b);
            } else if (operation.equals("set")) {
                rw.printF("Enter number(two numbers m/n):\n");
                int m = rw.nextInt();
                int n = rw.nextInt();
                rw.printF("Enter where to store(one letter):\n");
                char where = rw.nextToken().charAt(0);
                setExpression(where, new Expression(m, n));
            } else if (operation.equals("out")) {
                rw.printF("Enter what to print(one letter):\n");
                char c = rw.nextToken().charAt(0);
                rw.printF(getExpression(c));
            } else {
                rw.printF(getExpressions());
            }
        }
    }

    public void setExpression(char c, Expression val) {
        if (c < 'a' || c > 'z') throw new IndexOutOfBoundsException("c from 'a' to 'z'");
        expressions[c - 'a'] = val;
    }

    public void sum(char whereToSet, char first, char second) {
        expressions[whereToSet - 'a'] = expressions[first - 'a'].add(expressions[second - 'a']);
    }

    public void divide(char whereToSet, char first, char second) {
        expressions[whereToSet - 'a'] = expressions[first - 'a'].divide(expressions[second - 'a']);
    }

    public void multiply(char whereToSet, char first, char second) {
        expressions[whereToSet - 'a'] = expressions[first - 'a'].multiply(expressions[second - 'a']);
    }

    public void subtract(char whereToSet, char first, char second) {
        expressions[whereToSet - 'a'] = expressions[first - 'a'].subtract(expressions[second - 'a']);
    }


    public String getExpressions() {
        StringBuilder ans = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            if (expressions[i - 'a'] != null) {
                ans.append(i).append(" = ").append(expressions[i - 'a']).append('\n');
            }
        }
        return ans.toString();
    }

    public String getExpression(char c) {
        return "" + c + " = " + expressions[c - 'a'] + "\n";
    }

}