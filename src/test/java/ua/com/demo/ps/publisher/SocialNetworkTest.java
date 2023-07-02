package ua.com.demo.ps.publisher;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import ua.com.demo.ps.subscriber.Subscriber;
import ua.com.demo.ps.subscriber.User;

import java.util.ArrayList;
import java.util.List;

public class SocialNetworkTest {
    private static final String CHANNEL_MEMES = "@it_memes";
    private static final String CHANNEL_SCIENCE = "@veritasium";
    private static final String CHANNEL_PROGRAMMING = "@bobocode";
    private final List<Subscriber> subscribers = new ArrayList<>();
    private SocialNetwork socialNetwork;

    @Before
    public void setUp() {
        this.socialNetwork = Mockito.mock(SocialNetwork.class);

        for (int i = 0; i < 2; i++) subscribers.add(Mockito.mock(User.class));
    }


    @Test
    public void testSuccessfulSubscription() {
        this.socialNetwork.subscribe(CHANNEL_MEMES, this.subscribers.toArray(new Subscriber[0]));

        Mockito.verify(this.socialNetwork, Mockito.times(1))
                .subscribe(CHANNEL_MEMES, this.subscribers.toArray(new Subscriber[0]));
    }

    @Test
    public void testFailedSubscription() {
        Mockito.doThrow(RuntimeException.class).when(this.socialNetwork)
                .subscribe(CHANNEL_MEMES, this.subscribers.toArray(new Subscriber[0]));

        Assert.assertThrows(RuntimeException.class,
                () -> this.socialNetwork.subscribe(CHANNEL_MEMES, this.subscribers.toArray(new Subscriber[0])));
    }


}
