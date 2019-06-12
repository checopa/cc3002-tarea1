package cc3002.tarea1.cards.pokemon.water;

import cc3002.tarea1.cards.pokemon.IPhaseTwoPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.visitor.Visitor;

import java.util.ArrayList;

public class PhaseTwoWaterPokemon extends AbstractWaterPokemon implements IPhaseTwoPokemon {
    private int preEvolutionId;

    public PhaseTwoWaterPokemon(String name, int id, int hp, ArrayList<Attack> attackList,int preEvolutionId) {
        super(name, id, hp, attackList);
        this.preEvolutionId=preEvolutionId;
    }

    @Override
    public int getPreEvolutionId() {
        return this.preEvolutionId;
    }

    @Override
    public void accept(Visitor v) {
        v.visitPhaseTwoPokemon(this);
    }

}
