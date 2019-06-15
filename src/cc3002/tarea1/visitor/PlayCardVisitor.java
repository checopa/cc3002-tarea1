package cc3002.tarea1.visitor;

import cc3002.tarea1.cards.energy.IEnergy;
import cc3002.tarea1.cards.pokemon.IBasicPokemon;
import cc3002.tarea1.cards.pokemon.IPhaseOnePokemon;
import cc3002.tarea1.cards.pokemon.IPhaseTwoPokemon;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.trainercard.ObjectTrainer;
import cc3002.tarea1.cards.trainercard.StadiumTrainer;
import cc3002.tarea1.cards.trainercard.SupportTrainer;
import cc3002.tarea1.trainer.Trainer;

import java.util.Map;

public class PlayCardVisitor extends Visitor {

    public void visitBasicPokemon(IBasicPokemon pokemon){
        Trainer trainer=pokemon.getTrainer();

        if(trainer.getActivePokemon()==null){
            trainer.setActivePokemon(pokemon);
        }
        else if(trainer.getBench().size()<5){
            trainer.addToBench(pokemon);
        }
        trainer.getHand().remove(pokemon);

    }

    public void visitEnergy(IEnergy energy){
        Trainer trainer=energy.getTrainer();
        energy.useEnergyCard(energy.getTrainer().getSelectedPokemon());
        trainer.getHand().remove(energy);
    }

    public void visitPhaseOnePokemon(IPhaseOnePokemon pokemon){
        Trainer trainer=pokemon.getTrainer();
        int idpreevolution=pokemon.getPreEvolutionID();
        this.changePokemon(pokemon,idpreevolution);
        trainer.getHand().remove(pokemon);
    }

    public void visitPhaseTwoPokemon(IPhaseTwoPokemon pokemon){
        Trainer trainer=pokemon.getTrainer();
        int idpreevolution=pokemon.getPreEvolutionId();
        this.changePokemon(pokemon,idpreevolution);
        trainer.getHand().remove(pokemon);
    }

    public void visitObjectCard(ObjectTrainer objectTrainer){
        Trainer trainer=objectTrainer.getTrainer();
        //codigo
        trainer.getHand().remove(objectTrainer);
    }

    public void visitStadiumCard(StadiumTrainer stadiumTrainer){
        Trainer trainer=stadiumTrainer.getTrainer();
        //codigo
        trainer.getHand().remove(stadiumTrainer);

    }

    public void visitSupportTrainer(SupportTrainer supportTrainer){
        Trainer trainer=supportTrainer.getTrainer();
        //codigo
        trainer.getHand().remove(supportTrainer);
    }



    public void addEnergies(IPokemon pokemon){
        Trainer trainer=pokemon.getTrainer();
        Map<String, Integer> energies;
        energies=trainer.getSelectedPokemon().getEnergies();
        pokemon.setEnergies(energies);
    }

    private void changePokemon(IPokemon pokemon, int idpreevolution) {
        Trainer trainer=pokemon.getTrainer();
        if(trainer.getSelectedPokemon().equals(trainer.getActivePokemon()) && idpreevolution==trainer.getSelectedPokemon().getId()){
            addEnergies(pokemon);
            trainer.discardCard(trainer.getActivePokemon());
            trainer.setActivePokemon(pokemon);
        }
        else{
            for(int i=0;i<trainer.getBench().size();i++){
                IPokemon pok=trainer.getBench().get(i);
                if(pok.equals(trainer.getSelectedPokemon()) && idpreevolution==trainer.getSelectedPokemon().getId()){
                    addEnergies(pokemon);
                    IPokemon pok2=pok;
                    trainer.discardCard(pok2);
                    trainer.getBench().set(i,pokemon);
                }
            }
        }

    }

}
