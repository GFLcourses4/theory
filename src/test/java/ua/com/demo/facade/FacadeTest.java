package ua.com.demo.facade;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FacadeTest {

    private Field field;

    private FieldHandler fieldHandler;

    @Before
    public void setUp() {
        this.field = new Field();
        this.fieldHandler = new FieldHandler();
    }


    @Test
    public void testFieldPrepared() {
        this.fieldHandler.prepareFieldForNewSeason(this.field);

        Assert.assertTrue(this.fieldHandler.isFiedlPrepared(this.field));
    }

    @Test
    public void testFieldNotPrepared() {
        Assert.assertFalse(this.fieldHandler.isFiedlPrepared(this.field));
    }
}
