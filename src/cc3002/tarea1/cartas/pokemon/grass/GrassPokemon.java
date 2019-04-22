package cc3002.tarea1.cartas.pokemon.grass;

import cc3002.tarea1.cartas.pokemon.AbstractPokemon;
import cc3002.tarea1.cartas.pokemon.IAttack;
import cc3002.tarea1.cartas.pokemon.fire.FireAttack;
import cc3002.tarea1.cartas.pokemon.water.WaterAttack;

import java.util.List;

public class GrassPokemon extends AbstractPokemon {

    protected GrassPokemon(String name, int hp, List<IAttack> attackList) {
        super(name, hp, attackList);
    }

    @Override
    public void receiveWaterAttack(WaterAttack attack) {
        this.receiveResistanAttack(attack);
    }

    @Override
    public void receiveFireAttack(FireAttack attack) {
        this.receiveWeaknessAttack(attack);
    }
}
