package cc3002.tarea1.cartas.pokemon.electric;

import cc3002.tarea1.cartas.pokemon.AbstractAttack;
import cc3002.tarea1.cartas.pokemon.IPokemon;

public class ElectricAttack extends AbstractAttack {
    public ElectricAttack(String name, int baseDamage, String description) {
        super(name, baseDamage, description);
    }

    @Override
    public void attack(IPokemon pokemon) {
        pokemon.receiveElectricAttack(this);
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof ElectricAttack && super.equals(obj);
    }

}
