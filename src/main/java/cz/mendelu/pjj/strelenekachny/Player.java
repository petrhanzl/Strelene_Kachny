package cz.mendelu.pjj.strelenekachny;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Player {
    private Color color;
    private List<Card> cardsInHand;
    private int numberOfDucksLeft;


    public Player(Color color, Card ... cards){
        this.color = color;
        this.numberOfDucksLeft = 6;
        this.cardsInHand = new ArrayList<>();
        cardsInHand.addAll(Arrays.asList(cards));

    }

    public void drawNewCards(Card ... cards) {
        cardsInHand.addAll(Arrays.asList(cards));
    }

    /**
     * Metoda pouzije kartu dle pozice v ruce (1-3), zavola prislusnou funkci ktera
     * provode to co ma karta v "description". Dal pak metoda kartu "zahodi" do
     * odhazovaciho baliku a prida hracovi novou kartu do ruky.
     * @author xhanzl1
     * @version etapa 1
     *
     */
    public void useCard(int cardPosition){
        cardsInHand.remove(cardPosition);
    }



    public void setCardsInHand(List<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    public List<Card> getCards(){
        return Collections.unmodifiableList(cardsInHand);
    }

    public int getNumberOfDucksLeft(){
        return this.numberOfDucksLeft;
    }

    public void removeDuck(Duck duck){
        throw new UnsupportedOperationException("Not Implemented Yet");
    }


}
