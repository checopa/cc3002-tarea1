package cc3002.tarea1.cartas.pokemon.water;

import cc3002.tarea1.cartas.pokemon.AbstractPokemon;
import cc3002.tarea1.cartas.pokemon.Attack;
import cc3002.tarea1.cartas.pokemon.IPokemon;
import cc3002.tarea1.cartas.pokemon.lighting.LightingPokemon;
import cc3002.tarea1.cartas.pokemon.fighting.FightingPokemon;
import cc3002.tarea1.cartas.pokemon.grass.GrassPokemon;

import java.util.List;

public class WaterPokemon extends AbstractPokemon {
    public WaterPokemon(String name, int hp, List<Attack> attackList) {
        super(name, hp, attackList);
    }

    @Override
    public void attack(IPokemon pokemon) {
        if(this.cantAttack()) {
            pokemon.receiveWaterAttack(this);
        }
    }

    @Override
    public void receiveGrassAttack(GrassPokemon attack){
        this.receiveWeaknessAttack(attack);
    }

    @Override
    public void receiveLightingAttack(LightingPokemon attack){
        this.receiveWeaknessAttack(attack);
    }

    @Override
    public void receiveFightingAttack(FightingPokemon attack){
        this.receiveResistanAttack(attack);
    }
}
