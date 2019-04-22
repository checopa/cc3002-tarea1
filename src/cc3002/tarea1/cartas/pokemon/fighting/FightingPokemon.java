package cc3002.tarea1.cartas.pokemon.fighting;

import cc3002.tarea1.cartas.pokemon.AbstractPokemon;
import cc3002.tarea1.cartas.pokemon.IAttack;
import cc3002.tarea1.cartas.pokemon.grass.GrassAttack;
import cc3002.tarea1.cartas.pokemon.psychic.PsychicAttack;

import java.util.List;

public class FightingPokemon extends AbstractPokemon {
    public FightingPokemon(String name, int hp, List<IAttack> attackList) {
        super(name, hp, attackList);
    }

    @Override
    public void receiveGrassAttack(GrassAttack attack) {
        this.receiveWeaknessAttack(attack);
    }

    @Override
    public void receivePsychicAttack(PsychicAttack attack) {
        this.receiveWeaknessAttack(attack);
    }
}
