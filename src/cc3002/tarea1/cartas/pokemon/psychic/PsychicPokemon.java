package cc3002.tarea1.cartas.pokemon.psychic;

import cc3002.tarea1.cartas.pokemon.AbstractPokemon;
import cc3002.tarea1.cartas.pokemon.IAttack;
import cc3002.tarea1.cartas.pokemon.fighting.FightingAttack;

import java.util.List;

public class PsychicPokemon extends AbstractPokemon {
    public PsychicPokemon(String name, int hp, List<IAttack> attackList) {
        super(name, hp, attackList);
    }

    @Override
    public void receiveFightingAttack(FightingAttack attack) {
        this.receiveResistanAttack(attack);
    }

    @Override
    public void receivePsychicAttack(PsychicAttack attack) {
        this.receiveWeaknessAttack(attack);
    }
}
