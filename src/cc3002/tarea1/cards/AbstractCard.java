package cc3002.tarea1.cards;

import cc3002.tarea1.trainer.Trainer;
import cc3002.tarea1.visitor.Visitor;

import java.util.Objects;

public abstract class AbstractCard  implements ICard{
    private String name;
    private Trainer trainer;

    /**
     * Abstract class that represents a generic card.
     * @param name Card's name
     */
    protected AbstractCard(String name){
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }


}
