package cc3002.tarea1.effects.attackeffect;

import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.fighting.BasicFightingPokemon;
import cc3002.tarea1.effects.AbstractEffect;
import cc3002.tarea1.effects.IEffect;
import cc3002.tarea1.effects.NullEffect;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.trainer.Trainer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ElectricShock extends AbstractEffect {
    private int baseDamage;

    public ElectricShock(int baseDamage){
        this.baseDamage=baseDamage;
    }

    @Override
    public void doEffect(Trainer trainer) {
        if(trainer.getCoin()==1) {
            IEffect effect = new NullEffect();
            Attack attack = new Attack("test", getBaseDamage(), "test", new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}}, effect);
            IPokemon pokemon = new BasicFightingPokemon("test", 001, 1000, new ArrayList<>(Arrays.asList(attack)));
            pokemon.selectAbility(0);
            trainer.getActivePokemon().receiveAttack(pokemon);
        }
    }

    public int getBaseDamage() {
        return baseDamage;
    }

}
