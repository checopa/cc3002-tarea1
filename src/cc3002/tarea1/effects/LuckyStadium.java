package cc3002.tarea1.effects;

import cc3002.tarea1.trainer.Trainer;

public class LuckyStadium extends AbstractEffect {
    @Override
    public void doEffect(Trainer trainer) {
        // 0 es cara y 1 es sello
        int coin=(int) Math.random();
        if(coin==0){
            trainer.addToHand(1);
        }
    }
}
