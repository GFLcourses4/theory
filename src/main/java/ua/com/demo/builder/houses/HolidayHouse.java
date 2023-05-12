package ua.com.demo.builder.houses;

public class HolidayHouse {
    private int floors;

    private int doors;

    private int rooms;

    private boolean hasSwimmingPool;

    public HolidayHouse() { }

    public HolidayHouse(int floors, int doors, int rooms, boolean hasSwimmingPool) {
        this.floors = floors;
        this.doors = doors;
        this.rooms = rooms;
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HolidayHouse that = (HolidayHouse) o;

        if (floors != that.floors) return false;
        if (doors != that.doors) return false;
        if (rooms != that.rooms) return false;
        return hasSwimmingPool == that.hasSwimmingPool;
    }

    @Override
    public int hashCode() {
        int result = floors;
        result = 31 * result + doors;
        result = 31 * result + rooms;
        result = 31 * result + (hasSwimmingPool ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HolidayHouse{" +
                "floors=" + floors +
                ", doors=" + doors +
                ", rooms=" + rooms +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }
}
