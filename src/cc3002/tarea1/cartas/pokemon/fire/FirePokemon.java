package cc3002.tarea1.cartas.pokemon.fire;

import cc3002.tarea1.cartas.pokemon.AbstractPokemon;
import cc3002.tarea1.cartas.pokemon.IAttack;
import cc3002.tarea1.cartas.pokemon.water.WaterAttack;

import java.util.List;

public class FirePokemon extends AbstractPokemon {

    public FirePokemon(String name, int hp, List<IAttack> attackList) {
        super(name, hp, attackList);
    }

    @Override
    public void receiveWaterAttack(WaterAttack attack){
        this.receiveWeaknessAttack(attack);
    }

}
