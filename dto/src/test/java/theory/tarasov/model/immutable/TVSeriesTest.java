package theory.tarasov.model.immutable;


import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class TVSeriesTest {

    @Test
    public void testConstructorWithTwoParameters() {
        Set<Episode> episodes = getEpisodes();
        var tvSeries = new TVSeries("TV Series", episodes);
        assertThat(tvSeries).isNotNull();
        assertThat(tvSeries.getName()).isEqualTo("TV Series");
        assertThat(tvSeries.getEpisodes()).isEqualTo(episodes);
    }

    @Test
    public void testGetName() {
        Set<Episode> episodes = getEpisodes();
        var tvSeries = new TVSeries("TV Series", episodes);
        assertThat(tvSeries.getName()).isEqualTo("TV Series");
    }

    @Test
    public void testGetEpisodes_shouldReturnEqualSetOfEpisodesWithDifferentReference() {
        Set<Episode> episodes = getEpisodes();
        var tvSeries = new TVSeries("TV Series", episodes);
        assertThat(tvSeries.getEpisodes()).isEqualTo(episodes);
        assertThat(tvSeries.getEpisodes()).isNotSameAs(episodes);
    }

    private Set<Episode> getEpisodes() {
        return Set.of(
                new Episode("Episode 1", 60),
                new Episode("Episode 2", 45));
    }
}