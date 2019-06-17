package cc3002.tarea1.visitor;


import cc3002.tarea1.cards.energy.IEnergy;
import cc3002.tarea1.cards.pokemon.IBasicPokemon;
import cc3002.tarea1.cards.pokemon.IPhaseOnePokemon;
import cc3002.tarea1.cards.pokemon.IPhaseTwoPokemon;
import cc3002.tarea1.cards.trainercard.ObjectTrainer;
import cc3002.tarea1.cards.trainercard.StadiumTrainer;
import cc3002.tarea1.cards.trainercard.SupportTrainer;
import cc3002.tarea1.habilities.Ability;
import cc3002.tarea1.habilities.Attack;

public abstract class Visitor {


    public void visitBasicPokemon(IBasicPokemon pokemon){}

    public void visitPhaseOnePokemon(IPhaseOnePokemon pokemon){}

    public void visitPhaseTwoPokemon(IPhaseTwoPokemon pokemon){}

    public void visitEnergy(IEnergy energy){}

    public void visitObjectCard(ObjectTrainer objecttrainer){}

    public void visitStadiumCard(StadiumTrainer stadiumtrainer){}

    public void visitSupportTrainer(SupportTrainer supporttrainer){}

    public void visitAttack(Attack attack){}

    public void visitAbility(Ability ability){}

}
