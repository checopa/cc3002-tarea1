package cc3002.tarea1.effects.objectcardeffect;

import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.effects.AbstractEffect;
import cc3002.tarea1.trainer.Trainer;
import cc3002.tarea1.visitor.PlayGreatBall;
import cc3002.tarea1.visitor.Visitor;

import java.util.Collections;

public class GreatBallEffect extends AbstractEffect {
    private Visitor v=new PlayGreatBall();

    @Override
    public void doEffect(Trainer trainer) {
        int benchsize=trainer.getBench().size();
        if (benchsize<5) {
            for (int i = 0; i < trainer.getDeck().size(); i++) {
                ICard card=trainer.getDeck().get(i);
                card.setTrainer(trainer);
                card.accept(v);
                if(trainer.getBench().size()>benchsize){
                    trainer.getDeck().remove(i);
                    Collections.shuffle(trainer.getDeck());
                    break;
                }
            }
        }
    }
}
