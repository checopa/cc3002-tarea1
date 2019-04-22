package cc3002.tarea1.cartas.pokemon.water;

import cc3002.tarea1.cartas.pokemon.AbstractPokemon;
import cc3002.tarea1.cartas.pokemon.IAttack;
import cc3002.tarea1.cartas.pokemon.electric.ElectricAttack;
import cc3002.tarea1.cartas.pokemon.fighting.FightingAttack;
import cc3002.tarea1.cartas.pokemon.grass.GrassAttack;

import java.util.List;

public class WaterPokemon extends AbstractPokemon {
    public WaterPokemon(String name, int hp, List<IAttack> attackList) {
        super(name, hp, attackList);
    }

    @Override
    public void receiveGrassAttack(GrassAttack attack){
        this.receiveWeaknessAttack(attack);
    }

    @Override
    public void receiveElectricAttack(ElectricAttack attack){
        this.receiveWeaknessAttack(attack);
    }

    @Override
    public void receiveFightingAttack(FightingAttack attack){
        this.receiveResistanAttack(attack);
    }
}
