package cz.mendelu.pjj.strelenekachny;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PondTest {

    /**
     * @author xhanzl1
     * @version etapa 1
     *
     */
    @Test
    void killDuck() {
        /*
        * setup - saving the duck at location 1 in order to compare it later,
        * whether the duck doesnt exist anymore
        */
        Pond pond = new Pond();
        Duck tmp = pond.returnDuck(1);
        //when
        pond.killDuck(1);
        //then
        Assertions.assertNotEquals(tmp, pond.returnDuck(1));
    }

    /**
    * @author xhanzl1
    * @version etapa 1
    *
    */
    @Test
    void moveDucks() {
        //setup - saving duck at location 1 in order to compare it later, whether it moved
        Pond pond = new Pond();
        Duck tmp = pond.returnDuck(1);
        //when
        pond.moveDucks();
        //then
        Assertions.assertNotEquals(tmp, pond.returnDuck(1));
    }
}