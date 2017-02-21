package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Vaio on 22.02.2017.
 */
public class SquareTest {

    @Test
    public void testArea(){
        double t = 25.0;
        Square e = new Square(5);
        Assert.assertEquals(e.area(),t);
    }
}
