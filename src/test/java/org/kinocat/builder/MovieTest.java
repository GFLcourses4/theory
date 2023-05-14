package org.kinocat.builder;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void testDefault() {
        Movie movie = new Movie.Builder("Matrix", 1999).build();
        Assert.assertEquals(movie, new Movie(1999, "Matrix", null, null, null, 0));
    }

    @Test
    public void testOptional() {
        Movie.Builder builder = new Movie.Builder("Matrix", 1999);
        builder.setGenre("Action").setCountry("United States").setDirector("Wachowski").setBudget(6300000);
        Movie movie = builder.build();

        Movie optMovie = new Movie(1999, "Matrix", "Action", "United States", "Wachowski", 6300000);

        Assert.assertEquals(movie, optMovie);
    }

}
