package org.kinocat.facade;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ActionPrinterFacadeTest {

    private ActionPrinterFacade facade;
    private ByteArrayOutputStream baos;
    private PrintStream oldStream;

    @Before
    public void setup() {
        facade = new ActionPrinterFacade(ActionSingleton1.getInstance(), ActionSingleton2.INSTANCE);
        oldStream = System.out;
        baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
    }


    @Test
    public void testFacade() {
        facade.printActions();
        System.out.flush();
        String separator = System.lineSeparator();
        assertEquals("Action 1" + separator + "Action 2" + separator, baos.toString());
    }

    @After
    public void reset() {
        System.setOut(oldStream);
    }
}