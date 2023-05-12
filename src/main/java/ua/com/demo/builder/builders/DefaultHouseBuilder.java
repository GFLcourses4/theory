package ua.com.demo.builder.builders;

import ua.com.demo.builder.houses.DefaultHouse;

public class DefaultHouseBuilder implements Builder {

    private final DefaultHouse defaultHouse = new DefaultHouse();


    @Override
    public void setFloorCount(int floorCount) {
        this.defaultHouse.setFloors(floorCount);
    }

    @Override
    public void setRoomCount(int roomCount) {
        this.defaultHouse.setRooms(roomCount);
    }

    @Override
    public void setDoorCount(int doorCount) {
        this.defaultHouse.setDoors(doorCount);
    }

    public DefaultHouse buildDefaultHouse() {
        return this.defaultHouse;
    }
}
