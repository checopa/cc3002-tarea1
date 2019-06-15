package cc3002.tarea1.visitor;

import cc3002.tarea1.habilities.Ability;
import cc3002.tarea1.habilities.Attack;

public class PlayAbilityVisitor extends Visitor {


    public void visitAttack(Attack attack){
        attack.getTrainer().attackTrainer(attack.getTrainer().getOpponent());
    }

    public void visitAbility(Ability ability){

    }

}
