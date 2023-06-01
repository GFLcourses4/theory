package org.kinocat.builders.common;

import org.junit.Test;

import java.util.Arrays;

public class DirectorTest {
    @Test
    public void testBuildProcess() {
        Director director = new Director();

        LocalUserBuilder builder = new LocalUserBuilder();
        director.createDefaultUser(builder);
        LocalUser localUser = builder.getResult();
        System.out.println(localUser);

        director.createAnonymousUser(builder);
        LocalUser anonymousUser = builder.getResult();
        System.out.println(anonymousUser);

        RemoteUserBuilder ruBuilder = new RemoteUserBuilder();
        director.createDefaultUser(ruBuilder);
        ruBuilder.domain("localDomain");
        RemoteUser remoteUser = ruBuilder.getResult();
        System.out.println(remoteUser);

        org.junit.Assert.assertArrayEquals(
                new String[]{"localDomain", "default", "default"},
                new String[]{remoteUser.getDomain(), remoteUser.getLogin(), remoteUser.getPassword()}
        );
    }

}