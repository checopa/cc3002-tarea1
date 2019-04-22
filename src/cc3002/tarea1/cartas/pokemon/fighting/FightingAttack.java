package cc3002.tarea1.cartas.pokemon.fighting;

import cc3002.tarea1.cartas.pokemon.AbstractAttack;
import cc3002.tarea1.cartas.pokemon.IPokemon;
import cc3002.tarea1.cartas.pokemon.water.WaterAttack;

public class FightingAttack extends AbstractAttack {
    public FightingAttack(String name, int baseDamage, String description) {
        super(name, baseDamage, description);
    }

    @Override
    public void attack(IPokemon pokemon) {
        pokemon.receiveFightingAttack(this);
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof FightingAttack && super.equals(obj);
    }
}
