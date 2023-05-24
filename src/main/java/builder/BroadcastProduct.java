public class BroadcastProduct {
    private String broadcastType;
    private int duration;
    private String songName;
    private String advertiseName;


    public BroadcastProduct(){
    }

    public BroadcastProduct(int duration){
        this.duration = duration;
    }

    public BroadcastProduct(String broadcastType, int duration, String songName,String advertiseName){
        this.broadcastType = broadcastType;
        this.duration = duration;
        this.songName = songName;
        this.advertiseName = advertiseName;
    }

    public String getBroadcastType(){
        return broadcastType;
    }

    public void setBroadcastType(String broadcastType){
        this.broadcastType = broadcastType;
    }

    public Integer getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public String getSongName(){
        return songName;
    }

    public void setSongName(String songName){
        this.songName = songName;
    }

    public String getAdvertiseName(){
        return advertiseName;
    }

    public void setAdvertiseName(String advertiseName){
        this.advertiseName = advertiseName;
    }

    @Override
    public String toString() {
        return " Broadcast type"  + ":  \t " +  broadcastType+ " \t " +
                " Duration"  + ": " + duration + " \t " +
                " Song Name" + ": " + songName + " \t " +
                " Advertise Name" + ": " + advertiseName;
    }

}
