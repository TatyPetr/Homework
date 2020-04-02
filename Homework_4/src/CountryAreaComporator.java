import java.util.Comparator;

public class CountryAreaComporator implements Comparator<Country> {
    public int compare(Country c1, Country c2) {
        if (c1.square(Country.BELARUS) == c2.square(Country.ITALY)) {
            return 0;
        }
        if (c1.square(Country.BELARUS) > c2.square(Country.ITALY)) {
            return 1;
        } else {
            return -1;
        }

    }
}
