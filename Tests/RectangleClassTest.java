import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleClassTest {

        RectangleClass rectangleClass;
    @BeforeEach
    void setUp() {

        rectangleClass = new RectangleClass();
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void testThatLengthAndWidthCnBeSetAndGotten(){
        rectangleClass.setLength(13);
        assertEquals(13, rectangleClass.getLength());

        rectangleClass.setWidth(11);
        assertEquals(11,rectangleClass.getWidth());
    }

    @Test
    void testThatAreaCanBeCalculated(){
        double result = rectangleClass.calculateArea(10,10);
        System.out.println(rectangleClass.calculateArea(10,10));
        assertEquals(100, result);
    }

    @Test
    void testThatPerimeterCanBeCalculated(){
        double result = rectangleClass.calculatePerimeter(10,10);
        System.out.println(rectangleClass.calculatePerimeter(10,10));
        assertEquals(40,result);
    }
}