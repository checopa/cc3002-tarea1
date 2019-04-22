package cc3002.tarea1.cartas.pokemon.electric;

import cc3002.tarea1.cartas.pokemon.AbstractPokemon;
import cc3002.tarea1.cartas.pokemon.IAttack;
import cc3002.tarea1.cartas.pokemon.fighting.FightingAttack;

import java.util.List;

public class ElectricPokemon extends AbstractPokemon {
    public ElectricPokemon(String name, int hp, List<IAttack> attackList) {
        super(name, hp, attackList);
    }

    @Override
    public void receiveFightingAttack(FightingAttack attack) {
        this.receiveWeaknessAttack(attack);
    }
}
