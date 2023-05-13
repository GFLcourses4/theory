package theory.tarasov.model.immutable;

import java.util.HashSet;
import java.util.Set;

public class TVSeries {
    private final String name;
    private final Set<Episode> episodes;

    public TVSeries(String name, Set<Episode> episodes) {
        this.name = name;
        this.episodes = episodes;

    }

    @Override
    public String toString() {
        return "TVSeries [ name = " + name + ", episodes = " + episodes + " ]";
    }

    public String getName() {
        return name;
    }

    public Set<Episode> getEpisodes() {
        return new HashSet<>(episodes);
    }

}
