package cc3002.tarea1.visitor;

import cc3002.tarea1.cards.energy.IEnergy;
import cc3002.tarea1.cards.pokemon.IBasicPokemon;
import cc3002.tarea1.trainer.Trainer;

public class PlayCardVisitor extends Visitor {

    public void visitBasicPokemon(IBasicPokemon pokemon){
        Trainer trainer=pokemon.getTrainer();
        if(trainer.getActivePokemon()==null){
            trainer.setActivePokemon(pokemon);
        }
        else if(trainer.getBench().size()<5){
            trainer.getBench().add(pokemon);
        }

    }

    public void visitEnergy(IEnergy energy){
        energy.useEnergyCard(energy.getTrainer().getSelectedPokemon());
    }




}
