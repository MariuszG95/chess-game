package sda.games.chess;

public class Move {

    private int fromX;
    private int fromY;
    private int toX;
    private int toY;

    public int getFromX() {return fromX;}
    public void setFromX(int fromX) {this.fromX = fromX;}
    public int getFromY() {return fromY;}
    public void setFromY(int fromY) {this.fromY = fromY;}
    public int getToX() {return toX;}
    public void setToX(int toX) {this.toX = toX;}
    public int getToY() {return toY;}
    public void setToY(int toY) {this.toY = toY;}

    public Move(String userCordinatesInput) {
        this.fromX = Integer.parseInt(charToInt(userCordinatesInput.toUpperCase().charAt(0)));
        this.fromY = Integer.parseInt(userCordinatesInput.substring(1, 2));
        this.toX  = Integer.parseInt(charToInt(userCordinatesInput.toUpperCase().charAt(3)));
        this.toY = Integer.parseInt(userCordinatesInput.substring(4));
    }

    private String charToInt(char c) {
        String number = "0";
        switch (c) {
            case 'A':
                number = "1";
                break;
            case 'B':
                number = "2";
                break;
            case 'C':
                number = "3";
                break;
            case 'D':
                number = "4";
                break;
            case 'E':
                number = "5";
                break;
            case 'F':
                number = "6";
                break;
            case 'G':
                number = "7";
                break;
            case 'H':
                number = "8";
                break;
            default:
                break;
        }
        return number;
    }

    @Override
    public String toString() {
        return "fromX = " + fromX + ", fromY = " + fromY + ", toX = " + toX + ", toY = " + toY;
    }

}
