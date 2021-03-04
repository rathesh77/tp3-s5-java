package preferences;

public class Preferences {
    private String pseudo;


    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    @Override
    public String toString() {
        return "Preferences{" +
                "pseudo='" + pseudo + '\'' +
                '}';
    }
}
