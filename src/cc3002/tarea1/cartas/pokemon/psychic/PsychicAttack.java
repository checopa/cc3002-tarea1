package cc3002.tarea1.cartas.pokemon.psychic;

import cc3002.tarea1.cartas.pokemon.AbstractAttack;
import cc3002.tarea1.cartas.pokemon.IPokemon;
import cc3002.tarea1.cartas.pokemon.water.WaterAttack;

public class PsychicAttack extends AbstractAttack {
    public PsychicAttack(String name, int baseDamage, String description) {
        super(name, baseDamage, description);
    }

    @Override
    public void attack(IPokemon pokemon) {
        pokemon.receivePsychicAttack(this);
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof PsychicAttack && super.equals(obj);
    }
}
