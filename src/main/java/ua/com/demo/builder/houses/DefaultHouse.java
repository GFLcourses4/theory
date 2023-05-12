package ua.com.demo.builder.houses;

public class DefaultHouse {

    private int floors;

    private int doors;

    private int rooms;


    public DefaultHouse() { }

    public DefaultHouse(int floors, int doors, int rooms) {
        this.floors = floors;
        this.doors = doors;
        this.rooms = rooms;
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

        DefaultHouse that = (DefaultHouse) o;

        if (floors != that.floors) return false;
        if (doors != that.doors) return false;
        return rooms == that.rooms;
    }

    @Override
    public int hashCode() {
        int result = floors;
        result = 31 * result + doors;
        result = 31 * result + rooms;
        return result;
    }

    @Override
    public String toString() {
        return "DefaultHouse{" +
                "floors=" + floors +
                ", doors=" + doors +
                ", rooms=" + rooms +
                '}';
    }
}
