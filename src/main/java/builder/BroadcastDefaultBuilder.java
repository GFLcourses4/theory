public class BroadcastDefaultBuilder implements BroadcastBuilder{
    private String broadcastType;
    private int duration;
    private String songName;
    private String advertiseName;

    @Override
    public void setBroadcastType(String broadcastType){
        this.broadcastType = broadcastType;
    }

    @Override
    public void setDuration(Integer duration){
        this.duration = duration;
    }

    @Override
    public void setSongName(String songName){
        this.songName = songName;
    }

    @Override
    public void setAdvertiseName(String advertiseName){
        this.advertiseName = advertiseName;
    }

    public BroadcastProduct getResult(){
        return new BroadcastProduct(broadcastType, duration, songName, advertiseName);

    }
}