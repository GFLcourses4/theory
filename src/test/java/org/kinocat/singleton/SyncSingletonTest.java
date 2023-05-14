package org.kinocat.singleton;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class SyncSingletonTest {

    private SyncSingleton syncSingleton;
    private Object context;

    @Before
    public void setUp() {
        context = new Object();
        syncSingleton = SyncSingleton.get(context);
    }

    @Test
    public void testEquality() {
        Assert.assertSame(syncSingleton, SyncSingleton.get(context));
    }
}