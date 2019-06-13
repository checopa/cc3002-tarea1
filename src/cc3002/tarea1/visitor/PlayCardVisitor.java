package cc3002.tarea1.visitor;

import cc3002.tarea1.cards.energy.IEnergy;
import cc3002.tarea1.cards.pokemon.IBasicPokemon;
import cc3002.tarea1.cards.pokemon.IPhaseOnePokemon;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.trainer.Trainer;

import java.util.Map;

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

    public void visitPhaseOnePokemon(IPhaseOnePokemon pokemon){
        int idpreevolution=pokemon.getPreEvolutionID();
        this.changePokemon(pokemon,idpreevolution);
    }

    public void addEnergies(IPokemon pokemon){
        Trainer trainer=pokemon.getTrainer();
        Map<String, Integer> energies;
        energies=trainer.getActivePokemon().getEnergies();
        pokemon.setEnergies(energies);
    }

    private void changePokemon(IPhaseOnePokemon pokemon, int idpreevolution) {
        Trainer trainer=pokemon.getTrainer();
        if(trainer.getSelectedPokemon().equals(trainer.getActivePokemon()) && idpreevolution==trainer.getSelectedPokemon().getId()){
            addEnergies(pokemon);
            trainer.setActivePokemon(pokemon);
        }
        else{
            for(IPokemon pok:trainer.getBench()){
                if(pok.equals(trainer.getSelectedPokemon()) && idpreevolution==trainer.getSelectedPokemon().getId()){
                    addEnergies(pokemon);
                    pok=pokemon;
                }
            }
        }

    }

}
