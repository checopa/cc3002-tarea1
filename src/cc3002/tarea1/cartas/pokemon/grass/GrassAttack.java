package cc3002.tarea1.cartas.pokemon.grass;

import cc3002.tarea1.cartas.pokemon.AbstractAttack;
import cc3002.tarea1.cartas.pokemon.IPokemon;

public class GrassAttack extends AbstractAttack {

    public GrassAttack(String name, int baseDamage, String description) {
        super(name, baseDamage, description);
    }

    @Override
    public void attack(IPokemon pokemon) {
        pokemon.receiveGrassAttack(this);
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof GrassAttack && super.equals(obj);
    }
}
