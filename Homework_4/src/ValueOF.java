public class ValueOF {
    public static void main(String[] args) {
        Country country1 = Country.ICELAND;
        Country country2 = Country.valueOf("ICELAND");
        System.out.println( country1 == country2);

        Country country3 = Country.valueOfIgnoreCase("MONTENEGRO");
        System.out.println(country3);
    }
}
