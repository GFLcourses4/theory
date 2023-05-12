package ua.com.demo.builder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.com.demo.builder.builders.Builder;
import ua.com.demo.builder.builders.DefaultHouseBuilder;
import ua.com.demo.builder.builders.HolidayHouseBuilder;
import ua.com.demo.builder.director.Director;
import ua.com.demo.builder.houses.DefaultHouse;
import ua.com.demo.builder.houses.HolidayHouse;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = Director.getInstance();
    }

    @Test
    public void testSingletonEquality() {
        Director theDirector = Director.getInstance();

        Assert.assertSame(director, theDirector);
    }

    @Test
    public void testDefaultHouseBuilding() {
        Builder builder = new DefaultHouseBuilder();
        DefaultHouse house = director.buildDefaultHouse(builder);

        Assert.assertEquals(new DefaultHouse(1, 1, 4), house);
    }

    @Test
    public void testHolidayHouseBuilding() {
        Builder builder = new HolidayHouseBuilder();
        HolidayHouse house = director.buildHolidayHouse(builder);

        Assert.assertEquals(new HolidayHouse(2, 3, 6, true), house);
    }

}
