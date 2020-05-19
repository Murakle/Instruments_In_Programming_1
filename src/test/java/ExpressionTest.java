import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {

    @Test
    void addTest() {
        Expression a = new Expression(5, 3);
        Expression b = new Expression(7, 4);
        Expression c = new Expression(41, 12);
        Expression res = a.add(b);
        assertEquals(res, c);
    }

    @Test
    void subtractTest() {
        Expression a = new Expression(5, 3);
        Expression b = new Expression(7, 4);
        Expression c = new Expression(-1, 12);
        Expression res = a.subtract(b);
        assertEquals(res, c);
    }

    @Test
    void multiplyTest() {
        Expression a = new Expression(5, 3);
        Expression b = new Expression(7, 4);
        Expression c = new Expression(35, 12);
        Expression res = a.subtract(b);
        assertEquals(res, c);
    }

    void divideTest() {
        Expression a = new Expression(5, 3);
        Expression b = new Expression(7, 4);
        Expression c = new Expression(20, 21);
        Expression res = a.subtract(b);
        assertEquals(res, c);
    }


    @Test
    void creatingTest() {
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            new Expression(5, 0);
        });
        assertNotNull(thrown.getMessage());
    }

    @Test
    void simplyfyTest() {
        Expression a = new Expression(18, 12);
        assertEquals(a, new Expression(3, 2));
    }
}