import bh.greenfoot.runner.GreenfootRunner;
import cz.mendelu.pjj.greenfoot.DucksWorld;
import greenfoot.Greenfoot;

public class Runner extends GreenfootRunner{

    static{
        bootstrap(Runner.class,
                Configuration.forWorld(DucksWorld.class)
        .projectName("Strelene Kachny")
        .hideControls(true));
    }

    public static void main(String[] args) {
        GreenfootRunner.main(args);
    }
}
