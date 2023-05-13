package theory.tarasov.model.immutable;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EpisodeTest {
    @Test
    public void testConstructorWithTwoParameters() {
        var episode = new Episode("Episode 1", 60);
        assertThat(episode).isNotNull();
        assertThat(episode.getName()).isEqualTo("Episode 1");
        assertThat(episode.getRunningTime()).isEqualTo(60);
    }

    @Test
    public void testEqualsAndHashCode_shouldReturnTrue() {
        var episode1 = new Episode("Episode 1", 60);
        var episode2 = new Episode("Episode 1", 60);
        assertThat(episode1).isEqualTo(episode2);
        assertThat(episode1.hashCode()).isEqualTo(episode2.hashCode());
    }

    @Test
    public void testEquals_shouldReturnFalseForNull() {
        var episode = new Episode("Episode 1", 60);
        assertThat(episode.equals(null)).isFalse();
    }

    @Test
    public void testEquals_shouldReturnFalseForDifferentObjectType() {
        var episode = new Episode("Episode 1", 60);
        var differentObject = "not an Episode object";
        assertThat(episode.equals(differentObject)).isFalse();
    }
}