package cc3002.tarea1.cards.pokemon.fighting;

import cc3002.tarea1.cards.pokemon.IPhaseTwoPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.habilities.IAbility;
import cc3002.tarea1.visitor.Visitor;

import java.util.ArrayList;

public class PhaseTwoFightingPokemon extends AbstractFightingPokemon implements IPhaseTwoPokemon {
    private int preEvolutionId;


    public PhaseTwoFightingPokemon(String name, int id, int hp, ArrayList<IAbility> abilitiesList, int preEvolutionId) {
        super(name, id, hp, abilitiesList);
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
