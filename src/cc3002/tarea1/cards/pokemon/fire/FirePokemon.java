package cc3002.tarea1.cards.pokemon.fire;

import cc3002.tarea1.cards.pokemon.AbstractPokemon;
import cc3002.tarea1.cards.pokemon.water.WaterPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.cards.pokemon.IPokemon;

import java.util.List;

public class FirePokemon extends AbstractPokemon {

    public FirePokemon(String name, int id, int hp, List<Attack> attackList) {
        super(name, id, hp, attackList);
    }

    @Override
    public void attack(IPokemon pokemon) {
        if(this.cantAttack()) {
            pokemon.receiveFireAttack(this);
        }
    }

    @Override
    public void receiveWaterAttack(WaterPokemon attack){
        this.receiveWeaknessAttack(attack);
    }

}
