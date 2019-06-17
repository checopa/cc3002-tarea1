package cc3002.tarea1.visitor;

import cc3002.tarea1.cards.pokemon.IBasicPokemon;
import cc3002.tarea1.trainer.Trainer;

public class PlayGreatBall extends Visitor {

    @Override
    public void visitBasicPokemon(IBasicPokemon basicPokemon){
        Trainer trainer=basicPokemon.getTrainer();
        trainer.addToBench(basicPokemon);
    }


}
