package cc3002.tarea1.cards.pokemon.grass;

import cc3002.tarea1.cards.pokemon.IPhaseOnePokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.visitor.Visitor;

import java.util.ArrayList;

public class PhaseOneGrassPokemon extends AbstractGrassPokemon implements IPhaseOnePokemon {
    private int preEvolutionId;

    public PhaseOneGrassPokemon(String name, int id, int hp, ArrayList<Attack> attackList,int preEvolutionId) {
        super(name, id, hp, attackList);
        this.preEvolutionId=preEvolutionId;
    }

    @Override
    public int getPreEvolutionID() {
        return this.preEvolutionId;
    }

    @Override
    public void accept(Visitor v) {
        v.visitPhaseOnePokemon(this);
    }
}
