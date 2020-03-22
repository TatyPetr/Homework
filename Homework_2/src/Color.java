import javax.print.attribute.standard.MediaSize;

public class Color {

    private int RED;
    private int ORANGE;
    private int YELLOW;
    private int GREEN;
    private int BLUE;
    private int DARKBLUE;
    private int PURPLE;
    private int OTHERCOLORS;
    private int NUMBER;
    private String NAME;

    public Color (int Number)
    {
        this.NUMBER = Number;
    }
    public int getNUMBER (){ return NUMBER; }

    public String getNAME () {
        switch (NUMBER) {
            case 1:
                RED = NUMBER;
                NAME = "Красный";
                break;

            case 2:
                ORANGE = NUMBER;
                NAME = "Оранжевый";
                break;

            case 3:
                YELLOW = NUMBER;
                NAME = "Желтый";
                break;

            case 4:
                GREEN = NUMBER;
                NAME = "Зеленый";
                break;

            case 5:
                BLUE = NUMBER;
                NAME = "Голубой";
                break;

            case 6:
                DARKBLUE = NUMBER;
                NAME = "Cиний";
                break;

            case 7:
                PURPLE = NUMBER;
                NAME = "Фиолетовый";
                break;
            default:
                OTHERCOLORS = NUMBER;
                NAME = "Неизвестно";
                break;
        }
       return NAME;
    }

}
