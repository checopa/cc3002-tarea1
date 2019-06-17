package cc3002.tarea1.effects.abilityeffect;

import cc3002.tarea1.effects.AbstractEffect;
import cc3002.tarea1.trainer.Trainer;

public class WingBuzz extends AbstractEffect {
    @Override
    public void doEffect(Trainer trainer) {
        trainer.discardCard(trainer.getSelectedCard());
        trainer.getHand().remove(trainer.getSelectedCard());
        trainer.getOpponent().getDeck().remove(0);
    }
}
