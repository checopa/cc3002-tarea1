package cc3002.tarea1.cards.pokemon.grass;

import cc3002.tarea1.cards.pokemon.AbstractPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.fire.FirePokemon;
import cc3002.tarea1.cards.pokemon.water.WaterPokemon;

import java.util.List;

public class GrassPokemon extends AbstractPokemon {

    public GrassPokemon(String name, int id, int hp, List<Attack> attackList) {
        super(name, id, hp, attackList);
    }

    @Override
    public void attack(IPokemon pokemon) {
        if (this.cantAttack()) {
            pokemon.receiveGrassAttack(this);
        }
    }

    @Override
    public void receiveWaterAttack(WaterPokemon attack) {
        this.receiveResistanAttack(attack);
    }

    @Override
    public void receiveFireAttack(FirePokemon attack) {
        this.receiveWeaknessAttack(attack);
    }
}
