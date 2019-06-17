package cc3002.tarea1.effects.stadiumcardeffect;

import cc3002.tarea1.effects.AbstractEffect;
import cc3002.tarea1.trainer.Trainer;

public class LuckyStadium extends AbstractEffect {
    @Override
    public void doEffect(Trainer trainer) {
        if(trainer.getCoin()==0){
            trainer.addToHand(1);
        }
    }
}
