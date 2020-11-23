package cz.mendelu.pjj.greenfoot;

import greenfoot.Actor;
import greenfoot.Greenfoot;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Trida po kliknuti na image Rules otevre pravidla ze slozky file
 * @author xhanzl1
 * @version etapa 4
 *
 */
public class RulesActor extends Actor {

    RulesActor(){
        update();
    }
    public void update(){
        setImage("Images/rules.png");
        getImage().scale(150, 50);
    }


    @Override
    public void act() {
        super.act();
        if (Greenfoot.mouseClicked(this)){
            File file = new File( "Files" + File.separator + "rules.pdf");
            try {
                Desktop.getDesktop().open(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
