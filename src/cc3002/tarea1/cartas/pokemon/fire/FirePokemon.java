package cc3002.tarea1.cartas.pokemon.fire;

import cc3002.tarea1.cartas.pokemon.AbstractPokemon;
import cc3002.tarea1.cartas.pokemon.Attack;
import cc3002.tarea1.cartas.pokemon.IPokemon;
import cc3002.tarea1.cartas.pokemon.water.WaterPokemon;

import java.util.List;

public class FirePokemon extends AbstractPokemon {

    public FirePokemon(int id, int hp, List<Attack> attackList) {
        super(id, hp, attackList);
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
