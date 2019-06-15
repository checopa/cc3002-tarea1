package cc3002.tarea1.visitor;

import cc3002.tarea1.habilities.Ability;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.trainer.Trainer;

public class PlayAbilityVisitor extends Visitor {


    public void visitAttack(Attack attack){
        Trainer trainer=attack.getTrainer();
        trainer.attackTrainer(trainer.getOpponent());
        attack.getEffect().doEffect(trainer);

    }

    public void visitAbility(Ability ability){
        Trainer trainer=ability.getTrainer();
        ability.getEffect().doEffect(trainer);
    }

}
