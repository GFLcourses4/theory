package org.kinocat.singleton;


/**
 * Thread-safe singleton implementation
 */

public class SyncSingleton {

    private static SyncSingleton syncSingleton;
    @SuppressWarnings("FieldCanBeLocal")
    private final Object mContext;

    private SyncSingleton(Object context) {
        mContext = context;
    }

    public static SyncSingleton get(Object context) {
        SyncSingleton localInstance = syncSingleton;
        if (localInstance == null) {
            synchronized (SyncSingleton.class) {
                localInstance = syncSingleton;
                if (localInstance == null) {
                    syncSingleton = localInstance = new SyncSingleton(context);
                }
            }
        }
        return localInstance;
    }
}
