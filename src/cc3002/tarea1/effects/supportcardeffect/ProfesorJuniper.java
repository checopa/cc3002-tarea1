package cc3002.tarea1.effects.supportcardeffect;

import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.effects.AbstractEffect;
import cc3002.tarea1.trainer.Trainer;

public class ProfesorJuniper extends AbstractEffect {

    @Override
    public void doEffect(Trainer trainer) {
        for(int i=0;i<trainer.getHand().size();i++){
            ICard card=trainer.getHand().get(0);
            trainer.discardCard(card);
            trainer.getHand().remove(0);
        }
        trainer.addToHand(7);
    }
}
