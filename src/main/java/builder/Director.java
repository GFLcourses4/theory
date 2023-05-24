public class Director {
    public void constructDefaultBroadcast(BroadcastBuilder broadcastBuilder) {
        broadcastBuilder.setDuration(4);
    }

    public void constructSong(BroadcastBuilder broadcastBuilder) {
        broadcastBuilder.setBroadcastType("Song");
        broadcastBuilder.setDuration(5);
    }
    public void constructAdvertise(BroadcastBuilder broadcastBuilder) {
        broadcastBuilder.setBroadcastType("Advertise");
        broadcastBuilder.setDuration(2);
    }
}


