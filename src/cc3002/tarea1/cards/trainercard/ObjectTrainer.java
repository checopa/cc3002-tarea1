package cc3002.tarea1.cards.trainercard;

import cc3002.tarea1.visitor.Visitor;

public class ObjectTrainer extends AbstractTrainerCard {
    protected ObjectTrainer(String name, String description) {
        super(name, description);
    }

    @Override
    public void accept(Visitor v) {

    }
}
