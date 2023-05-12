package ua.com.demo.builder.director;

import ua.com.demo.builder.builders.Builder;
import ua.com.demo.builder.builders.DefaultHouseBuilder;
import ua.com.demo.builder.builders.HolidayHouseBuilder;
import ua.com.demo.builder.houses.DefaultHouse;
import ua.com.demo.builder.houses.HolidayHouse;

public class Director {

    private static Director director;

    private Director() { }

    public static Director getInstance() {
        if (director == null) director = new Director();

        return director;
    }

    public DefaultHouse buildDefaultHouse(Builder builder) {
        builder.setDoorCount(1);
        builder.setFloorCount(1);
        builder.setRoomCount(4);

        return ((DefaultHouseBuilder) builder).buildDefaultHouse();
    }

    public HolidayHouse buildHolidayHouse(Builder builder) {
        HolidayHouseBuilder holidayHouseBuilder = (HolidayHouseBuilder) builder;

        holidayHouseBuilder.setDoorCount(3);
        holidayHouseBuilder.setFloorCount(2);
        holidayHouseBuilder.setRoomCount(6);
        holidayHouseBuilder.setSwimmingPool(true);

        return holidayHouseBuilder.buildHolidayHouse();
    }

}
