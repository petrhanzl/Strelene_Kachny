package cz.mendelu.pjj.greenfoot;

import cz.mendelu.pjj.strelenekachny.Duck;
import cz.mendelu.pjj.strelenekachny.Pond;
import greenfoot.GreenfootImage;
import greenfoot.World;

public class DucksWorld extends World {

    public void NewGameWorld(){
        ImageActor sign = new ImageActor("Images/strelene_kachny.jpg", 565, 90);
        addObject(sign, 600, 100);

        ImageActor ducksPicture = new ImageActor("Images/ducks.jpg", 255, 335);
        addObject(ducksPicture, 600, 400);

        addObject(new NewGameActor(), 200, 600);
        addObject(new RulesActor(), 1000, 600);
    }

    public void PondWorld(){

    }

    public DucksWorld(){
        super(1200, 700, 1);
        setBackground("Images/background.jpg");
        NewGameWorld();
    }
}
