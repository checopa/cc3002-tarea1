package cc3002.tarea1.visitor;

import cc3002.tarea1.habilities.Ability;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.trainer.Trainer;

public class PlayAbilityVisitor extends Visitor {

    @Override
    public void visitAttack(Attack attack){
        Trainer trainer=attack.getTrainer();
        attack.getEffect().doEffect(trainer);
        trainer.attackTrainer(trainer.getOpponent());
        trainer.getController().changeTurn();

    }

    @Override
    public void visitAbility(Ability ability){
        Trainer trainer=ability.getTrainer();
        ability.getEffect().doEffect(trainer);
    }

}
