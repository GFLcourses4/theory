package org.kinocat.proxy;

import junit.framework.TestCase;

import java.io.File;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProjectFilesProxyTest {
    File[] mExpectedFiles;

    @Before
    public void setup(){
        mExpectedFiles = new File("").getAbsoluteFile().listFiles();
    }

    @Test
    public void testGetFiles() {
        FilesSources files = new ProjectFiles();
        Assert.assertArrayEquals(mExpectedFiles, files.getFiles());
    }

    @Test
    public void testGetFilesViaProxy() {
        ProjectFilesProxy files = new ProjectFilesProxy(new ProjectFiles());
        Assert.assertArrayEquals(mExpectedFiles, files.getFiles());
        Assert.assertArrayEquals(mExpectedFiles, files.getFilesFromCache());
        files.reset();
        Assert.assertNull(files.getFilesFromCache());
    }
}