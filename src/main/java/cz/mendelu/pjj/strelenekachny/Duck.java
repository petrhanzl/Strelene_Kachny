package cz.mendelu.pjj.strelenekachny;

import jdk.jshell.spi.ExecutionControl;

import java.util.Objects;

public class Duck {
    private final Player owner;
    private final Color color;
    private boolean aimedAt;
    public Duck (Color color, Player owner){
        this.owner = owner;
        this.color = color;
        this.aimedAt = false;
    }


    public boolean isAimedAt() {
        return aimedAt;
    }

    public void setAimedAt(boolean aimedAt){
        this.aimedAt = aimedAt;
    }
    public Player getOwner() {
        return owner;
    }

    /**
     * @author xhanzl1
     * @version etapa 3
     *
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return aimedAt == duck.aimedAt &&
                Objects.equals(owner, duck.owner) &&
                color == duck.color;
    }

    /**
     * @author xhanzl1
     * @version etapa 3
     *
     */
    @Override
    public int hashCode() {
        return Objects.hash(owner, color, aimedAt);
    }
}
