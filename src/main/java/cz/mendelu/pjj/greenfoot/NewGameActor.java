package cz.mendelu.pjj.greenfoot;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import java.util.List;

public class NewGameActor extends Actor {
    public NewGameActor(){
        this.update();
    }
    public void update(){
        setImage("Images/new_game_button.png");
        getImage().scale(150, 50);
    }


    @Override
    public void act() {
        super.act();
        if (Greenfoot.mouseClicked(this)){
            List objects = getWorld().getObjects(null);
            getWorld().removeObjects(objects);
        }
    }
}
