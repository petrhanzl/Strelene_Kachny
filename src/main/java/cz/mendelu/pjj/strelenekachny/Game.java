package cz.mendelu.pjj.strelenekachny;

import com.sun.javadoc.SeeTag;

import java.util.*;

public class Game {
    private int numberOfCardsUsed;
    private Pond pond;
    private List<Card> cardsInPackage;
    private Map<Player, Color> players;


    /**
     * Metoda vytvori hru jako takovou a odstartuje ji. Dale take vytvori hrace s prislusnymi
     * barvami a take rybnicek, rozda karty a rozestavi kachny na rybnicku.
     * @author xhanzl1
     * @version etapa 1
     *
     */
    public static Game newGame(){
        Game game = new Game();
        return game;
    }
    public void endGame(){
        throw new UnsupportedOperationException("Not Implemented Yet");
    }



    public List<Card> getCardsInPackage() {
        return Collections.unmodifiableList(cardsInPackage);
    }

    /**
     * Metoda vytvori vsechny hraci karty
     * @author xhanzl1
     * @version etapa 1
     *
     */
    public List<Card> createCards(){
        List<Card> Cards = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {
            Card card = new Card(i);
            Cards.add(card);
        }
        cardsInPackage = Cards;
        return Cards;
    }

    public void createPlayer(){
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void serveCards(){
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void fillPond(){
        throw new UnsupportedOperationException("Not implemented yet");
    }



    /**
     * Metoda je zavolana vzdy na startu nove hry a zamicha vsechny Dale je metoda zavolana
     * ve chvili kdy hrac vezme posledni kartu z baliku. Metoda pak
     * vezme karty z odhazovaciho baliku a zamicha je.
     * @author xhanzl1
     * @version etapa 1
     *
     */
    public void shufflePackage(){
        Collections.shuffle(cardsInPackage);
    }
}
