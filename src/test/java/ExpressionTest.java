import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {

    @Test
    void add() {
        Expression a = new Expression(5, 3);
        Expression b = new Expression(7, 4);
        Expression c = new Expression(41, 12);
        Expression res = a.add(b);
        assertEquals(res.getM(), c.getM());
        assertEquals(res.getN(), c.getN());
    }
}