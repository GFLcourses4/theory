package ua.com.demo.facade;

public class Field {

    private boolean isWeedPulledOut;
    private boolean isPlowed;
    private boolean isCropSown;


    public boolean isWeedPulledOut() {
        return isWeedPulledOut;
    }

    public void setWeedPulledOut(boolean weedPulledOut) {
        if(weedPulledOut) System.out.println("Weed has been pulled out");

        isWeedPulledOut = weedPulledOut;
    }

    public boolean isPlowed() {
        return isPlowed;
    }

    public void setPlowed(boolean plowed) {
        if(plowed) System.out.println("Field has been plowed");

        isPlowed = plowed;
    }

    public boolean isCropSown() {
        return isCropSown;
    }

    public void setCropSown(boolean cropSown) {
        if(cropSown) System.out.println("Crop have been sown");

        isCropSown = cropSown;
    }
}
