package cc3002.tarea1.cartas.pokemon.grass;

import cc3002.tarea1.cartas.pokemon.AbstractPokemon;
import cc3002.tarea1.cartas.pokemon.Attack;
import cc3002.tarea1.cartas.pokemon.IPokemon;
import cc3002.tarea1.cartas.pokemon.fire.FirePokemon;
import cc3002.tarea1.cartas.pokemon.water.WaterPokemon;

import java.util.List;

public class GrassPokemon extends AbstractPokemon {

    public GrassPokemon(int id, int hp, List<Attack> attackList) {
        super(id, hp, attackList);
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
