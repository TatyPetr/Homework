import java.util.Locale;
public enum Country implements IMethodContry
 {
    BELARUS (207_595, 10_000_000),
    POLAND (425_589, 30_000_000),
    RUSSIA (19_639_639, 500_000_000),
    USA (1_000_259, 90_000_000),
    CANADA (596_569_589, 256_369_639),
    LITHUANIA (125_963, 9_000_000),
    NETHERLANDS (269_963, 8_526_859),
    ITALY (279_596, 78_859_639),
    FRANCE (258_147, 12_258_963),
    ICELAND (369_258, 396_963);

    private int square;
    private int people;

    Country (int square, int people) {
        this.square = square;
        this.people = people;
    }

    public int getPeople(Country Country) {return people; }

    public int getSquare(Country Country) {
        return square;
    }

    public static Country valueOfIgnoreCase (String name) {return valueOf(name.toUpperCase());}
}

