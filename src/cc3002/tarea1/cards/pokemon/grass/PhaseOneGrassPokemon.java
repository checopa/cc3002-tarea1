package cc3002.tarea1.cards.pokemon.grass;

import cc3002.tarea1.cards.pokemon.IPhaseOnePokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.habilities.IAbility;
import cc3002.tarea1.visitor.Visitor;

import java.util.ArrayList;
import java.util.Objects;

public class PhaseOneGrassPokemon extends AbstractGrassPokemon implements IPhaseOnePokemon {
    private int preEvolutionId;

    public PhaseOneGrassPokemon(String name, int id, int hp, ArrayList<IAbility> abilitiesList, int preEvolutionId) {
        super(name, id, hp, abilitiesList);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhaseOneGrassPokemon)) return false;
        if (!super.equals(o)) return false;
        PhaseOneGrassPokemon that = (PhaseOneGrassPokemon) o;
        return preEvolutionId == that.preEvolutionId;
    }

}
