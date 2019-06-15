package cc3002.tarea1.effects;

import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.trainer.Trainer;

public class ProfesorJuniper extends AbstractEffect {

    @Override
    public void doEffect(Trainer trainer) {
        for(ICard card:trainer.getHand()){
            trainer.discardCard(card);
        }
        trainer.addToHand(7);
    }
}
