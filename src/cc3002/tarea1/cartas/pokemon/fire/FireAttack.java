package cc3002.tarea1.cartas.pokemon.fire;

import cc3002.tarea1.cartas.pokemon.AbstractAttack;
import cc3002.tarea1.cartas.pokemon.IPokemon;

public class FireAttack extends AbstractAttack {
    public FireAttack(String name, int baseDamage, String description) {
        super(name, baseDamage, description);
    }

    @Override
    public void attack(IPokemon pokemon){
        pokemon.receiveFireAttack(this);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof FireAttack && super.equals(obj);
    }
}
