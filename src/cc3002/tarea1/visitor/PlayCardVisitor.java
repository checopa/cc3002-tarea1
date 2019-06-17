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

    @Override
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

    @Override
    public void visitEnergy(IEnergy energy){
        Trainer trainer=energy.getTrainer();
        if(!trainer.getController().getEnergyPlayed()) {
            energy.useEnergyCard(energy.getTrainer().getSelectedPokemon());
            trainer.getHand().remove(energy);
            trainer.getController().energyPlay();
        }
    }

    public void visitPhaseOnePokemon(IPhaseOnePokemon pokemon){
        Trainer trainer=pokemon.getTrainer();
        int idpreevolution=pokemon.getPreEvolutionID();
        this.changePokemon(pokemon,idpreevolution);
        trainer.getHand().remove(pokemon);
    }

    @Override
    public void visitPhaseTwoPokemon(IPhaseTwoPokemon pokemon){
        Trainer trainer=pokemon.getTrainer();
        int idpreevolution=pokemon.getPreEvolutionId();
        this.changePokemon(pokemon,idpreevolution);
        trainer.getHand().remove(pokemon);
    }

    @Override
    public void visitObjectCard(ObjectTrainer objectTrainer){
        Trainer trainer=objectTrainer.getTrainer();
        objectTrainer.getEffect().doEffect(trainer);
        trainer.getHand().remove(objectTrainer);
    }

    @Override
    public void visitStadiumCard(StadiumTrainer stadiumTrainer){
        Trainer trainer=stadiumTrainer.getTrainer();
        Trainer trainerOpponent=stadiumTrainer.getTrainer().getOpponent();
        trainer.setStadiumCard(stadiumTrainer);
        trainerOpponent.setStadiumCard(stadiumTrainer);
        trainer.getHand().remove(stadiumTrainer);
    }

    @Override
    public void visitSupportTrainer(SupportTrainer supportTrainer){
        Trainer trainer=supportTrainer.getTrainer();
        if(!trainer.getController().getSupportPlayed()) {
            supportTrainer.getEffect().doEffect(trainer);
            trainer.getHand().remove(supportTrainer);
            trainer.getController().supportPLay();
        }
    }

    /**
     * add energies to pokemon of the preevolution of pokemon
     * @param pokemon pokemon that receive the energy
     */
    public void addEnergies(IPokemon pokemon){
        Trainer trainer=pokemon.getTrainer();
        Map<String, Integer> energies;
        energies=trainer.getSelectedPokemon().getEnergies();
        pokemon.setEnergies(energies);
    }

    /**
     * change a pokemon for its evolution
     * @param pokemon evolution of the pokemon that is evolving
     * @param idpreevolution id of the preevolution of pokemon
     */
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
