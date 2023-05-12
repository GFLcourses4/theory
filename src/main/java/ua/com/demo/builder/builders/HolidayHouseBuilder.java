package ua.com.demo.builder.builders;

import ua.com.demo.builder.houses.HolidayHouse;

public class HolidayHouseBuilder implements Builder {

    private final HolidayHouse holidayHouse = new HolidayHouse();


    @Override
    public void setFloorCount(int floorCount) {
        this.holidayHouse.setFloors(floorCount);
    }

    @Override
    public void setRoomCount(int roomCount) {
        this.holidayHouse.setRooms(roomCount);
    }

    @Override
    public void setDoorCount(int doorCount) {
        this.holidayHouse.setDoors(doorCount);
    }

    public void setSwimmingPool(boolean hasSwimmingPool) {
        this.holidayHouse.setHasSwimmingPool(hasSwimmingPool);
    }

    public HolidayHouse buildHolidayHouse() {
        return this.holidayHouse;
    }
}
