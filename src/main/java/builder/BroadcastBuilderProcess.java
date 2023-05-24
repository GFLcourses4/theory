public class BroadcastBuilderProcess {

    public static void main(String[] args) {
        Director director = new Director();

        BroadcastDefaultBuilder broadcastBuilder = new BroadcastDefaultBuilder();
        director.constructDefaultBroadcast(broadcastBuilder);
        BroadcastProduct translation = broadcastBuilder.getResult();

        BroadcastManualBuilder broadcastSongBuilder = new BroadcastManualBuilder();
        director.constructSong(broadcastSongBuilder);
        broadcastSongBuilder.setSongName("hey ya");
        BroadcastProduct song = broadcastSongBuilder.getResult();

        BroadcastManualBuilder broadcastAdvertiseBuilder = new BroadcastManualBuilder();
        director.constructAdvertise(broadcastAdvertiseBuilder);
        broadcastAdvertiseBuilder.setAdvertiseName("tide");
        BroadcastProduct advertise = broadcastAdvertiseBuilder.getResult();

        System.out.println("Default : " + translation.toString());
        System.out.println("Song : " + song.toString());
        System.out.println("Advertise : " + advertise.toString());
    }
}
