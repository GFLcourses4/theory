package org.kinocat.proxy;

import org.jetbrains.annotations.TestOnly;

import java.io.File;


public class ProjectFilesProxy implements FilesSources {

    File[] mFilesCache = null;

    private final FilesSources mFilesSources;

    public ProjectFilesProxy(FilesSources sources) {
        mFilesSources = sources;
    }

    @Override
    public File[] getFiles() {
        if (mFilesCache == null) {
            mFilesCache = mFilesSources.getFiles();
        } else {
            System.out.println("Retrieved files from cache.");
        }
        return mFilesCache;
    }

    public void reset() {
        mFilesCache = null;
    }

    @TestOnly
    public File[] getFilesFromCache() {
        return mFilesCache;
    }
}
