package Model;

public class Card {
    private boolean hiden;

    private String word;

    private String localization; //albo klucz i wartość hashmapa

    public Card(){

    }

    public Card(String word) {
        this.hiden = true;
        this.word = word;
        this.localization = "";
    }

    public boolean isHiden() {
        return hiden;
    }

    public String getWord() {
        return word;
    }

    public String getLocalization() {
        return localization;
    }

    public void setHiden(boolean hiden) {
        this.hiden = hiden;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }
}
