package cz.mendelu.pjj.greenfoot;

import greenfoot.Actor;
import greenfoot.Greenfoot;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class RulesActor extends Actor {
    RulesActor(){
        update();
    }
    public void update(){
        setImage("Images/rules.png");
        getImage().scale(150, 50);
    }

    /**
     * Metoda po kliknuti na image Rules otevre pravidla ze slozky file
     * @author xhanzl1
     * @version etapa 4
     *
     */
    @Override
    public void act() {
        super.act();
        if (Greenfoot.mouseClicked(this)){
            File file = new File("/Users/Petr/Projects/Java/PJJ/Strelene_Kachny/src/main/resources/Files/rules.pdf");
            try {
                Desktop.getDesktop().open(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
