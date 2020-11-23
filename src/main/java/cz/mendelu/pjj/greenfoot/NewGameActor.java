package cz.mendelu.pjj.greenfoot;

import cz.mendelu.pjj.strelenekachny.Game;
import cz.mendelu.pjj.strelenekachny.Pond;
import greenfoot.Actor;
import greenfoot.Greenfoot;
import java.util.List;

/**
 * Trida po kliknuti na image New Game zacne novou hru
 * @author xhanzl1
 * @version etapa 4
 *
 */
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
            Game game = new Game();
            //Pond pond = new Pond();
            //game.fillPond(pond);
            DucksWorld world = new DucksWorld();
            Greenfoot.setWorld(world);
        }
    }
}
