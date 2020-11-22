package cz.mendelu.pjj.greenfoot;

import cz.mendelu.pjj.strelenekachny.Color;
import greenfoot.Actor;

public class DuckActor extends Actor {
    Color color;
    DuckActor(Color color){
        switch (color){
            case BLUE:
                setImage("Images/blue_duck.png");
                getImage().scale(150, 50);
                break;
            case PINK:
                setImage("Images/pink_duck.png");
                getImage().scale(150, 50);
                break;
            case GREEN:
                setImage("Images/green_duck.png");
                getImage().scale(150, 50);
                break;
            case ORANGE:
                setImage("Images/orange_duck.png");
                getImage().scale(150, 50);
                break;
            case PURPLE:
                setImage("Images/purple_duck.png");
                getImage().scale(150, 50);
                break;
            case YELLOW:
                setImage("Images/yellow_duck.png");
                getImage().scale(150, 50);
                break;
            default:
                setImage("Images/blank_duck.png");
                getImage().scale(150, 50);
                break;
        }



    }

}
