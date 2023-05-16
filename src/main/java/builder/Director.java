package builder;

public class Director {
    public void buildSimpleUser(Builder builder){
        builder.login("ksemeikina");
        builder.password("psRt23_@");
        builder.timestamp(1499070300000L);
    }
    public void buildWithoutPasswordUser(Builder builder){
        builder.login("ksemeikina");
        builder.timestamp(1499070300000L);
    }
    public void buildAnonymousUser(Builder builder){
        builder.timestamp(1499070300000L);
    }
}
