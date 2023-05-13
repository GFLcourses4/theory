package theory.tarasov.model.immutable;

import java.util.Objects;

public class Episode {
    private final String name;
    private final long runningTime;

    public Episode(String name, long runningTime) {
        this.name = name;
        this.runningTime = runningTime;
    }

    @Override
    public String toString() {
        return "Episode [ name = " + name + ", running time = " + runningTime + " ]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Episode episode)) return false;
        return Objects.equals(name, episode.name) && Objects.equals(runningTime, episode.runningTime);
    }

    @Override
    public int hashCode() {
        var hash = 7;
        hash = 31 * hash + (name != null ? name.hashCode() : 0);
        hash = 31 * hash + Long.hashCode(runningTime);
        return hash;
    }

    public String getName() {
        return name;
    }

    public long getRunningTime() {
        return runningTime;
    }
}
