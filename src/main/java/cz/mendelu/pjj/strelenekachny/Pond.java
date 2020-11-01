package cz.mendelu.pjj.strelenekachny;

import java.util.List;

public class Pond {
    private List<Duck> ducksOnPond;


    public void fillPond(){
        throw new UnsupportedOperationException("Not implemened yet");
    }


    /**
     *
     * @author xhanzl1
     * @version etapa 1
     * Metoda zkontroluje jestli je kachna zamerena, pokud je, tak kachnu odstrani z
     * hraciho pole a zavola metodu, ktera kachnu odstrani z hracova pocitadla kachen
     */
    public void killDuck(int location){
        ducksOnPond.remove(location);
    }


    public void Aim(Duck duck){
        throw new UnsupportedOperationException("Not Implemented Yet");
    }

    public Duck returnDuck(int location){
        if (location < 0 || location > 6){
            System.out.println("Error");
        }
        return ducksOnPond.get(location);
    }

    /**
     * Metoda posune vsechny kachny na rybnicku o jedno pole vpravo. Kachnu nejvice vpravo
     * odebere z herniho pole a da ji do baliku s kachnami. Dale pak prida jednu kachnu
     * do leva
     * @author xhanzl1
     * @version etapa 1
     *
     */
    public void moveDucks(){
        throw new UnsupportedOperationException("Not Implemented Yet");
    }


}
