package org.kinocat.proxy;

import java.io.File;

public class ProjectFiles implements FilesSources {
    @Override
    public File[] getFiles() {
        return new File("").getAbsoluteFile().listFiles();
    }
}
