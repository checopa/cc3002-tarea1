package cc3002.tarea1.cards.pokemon.lighting;


import cc3002.tarea1.cards.pokemon.IPhaseOnePokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.visitor.Visitor;

import java.util.ArrayList;
import java.util.Objects;

public class PhaseOneLightingPokemon extends AbstractLightingPokemon implements IPhaseOnePokemon {
    private int preEvolutionId;

    public PhaseOneLightingPokemon(String name, int id, int hp, ArrayList<Attack> attackList,int preEvolutionId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhaseOneLightingPokemon)) return false;
        if (!super.equals(o)) return false;
        PhaseOneLightingPokemon that = (PhaseOneLightingPokemon) o;
        return preEvolutionId == that.preEvolutionId;
    }

}
