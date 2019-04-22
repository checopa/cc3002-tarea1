package cc3002.tarea1.cartas.pokemon.water;

import cc3002.tarea1.cartas.pokemon.AbstractAttack;
import cc3002.tarea1.cartas.pokemon.IPokemon;

public class WaterAttack extends AbstractAttack {
    public WaterAttack(String name, int baseDamage, String description) {
        super(name, baseDamage, description);
    }

    @Override
    public void attack(IPokemon pokemon){
        pokemon.receiveWaterAttack(this);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof WaterAttack && super.equals(obj);
    }
}
