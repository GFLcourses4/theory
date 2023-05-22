package ua.com.demo.facade;

public class FieldHandler {

    public boolean isFiedlPrepared(Field field) {
        return field.isWeedPulledOut() && field.isPlowed() && field.isCropSown();
    }

    public void prepareFieldForNewSeason(Field field) {
        field.setWeedPulledOut(true);
        field.setPlowed(true);
        field.setCropSown(true);
    }

}
