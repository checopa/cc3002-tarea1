package cc3002.tarea1.test.fireTest;

import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.fire.AbstractFirePokemon;
import cc3002.tarea1.cards.pokemon.grass.AbstractGrassPokemon;
import cc3002.tarea1.cards.pokemon.psychic.AbstractPsychicPokemon;
import cc3002.tarea1.cards.pokemon.water.AbstractWaterPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.trainer.Trainer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;

public class FireTest {
    Attack firstAttack, secondAttack, thirdAttack, fourthAttack;
    IPokemon firePokemon, waterPokemon, grassPokemon, psychicPokemon, water2Pokemon;
    Trainer firstTrainer, secondTrainer;
    HashMap<String,Integer> firstCost;

    @Before
    public void setUp(){
        firstAttack=new Attack("First",40,"First Attack",firstCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}});
        secondAttack=new Attack("Second",40,"Second Attack",firstCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}});
        psychicPokemon=new AbstractPsychicPokemon("Psychic",002,100,new ArrayList<>(Arrays.asList(firstAttack,secondAttack)));
        grassPokemon=new AbstractGrassPokemon("Grass",003,100,new ArrayList<>(Arrays.asList(firstAttack,secondAttack)));
        waterPokemon=new AbstractWaterPokemon("Water",004,100,new ArrayList<>(Arrays.asList(firstAttack,secondAttack)));
        water2Pokemon=new AbstractWaterPokemon("Water",005,100,new ArrayList<>(Arrays.asList(firstAttack,secondAttack)));
        firePokemon=new AbstractFirePokemon("Fire",001,100,new ArrayList<>(Arrays.asList(firstAttack,secondAttack)));
        firstTrainer=new Trainer("Ash",new ArrayList<>(Arrays.asList(firePokemon,water2Pokemon)),new ArrayList<>());
        secondTrainer=new Trainer("Ashn't",new ArrayList<>(Arrays.asList(waterPokemon,psychicPokemon,grassPokemon)),new ArrayList<>());

    }

    @Test
    public void FireTest(){
        firstTrainer.selectActivePokemon(0);
        firstTrainer.addToBanch(0);
        secondTrainer.selectActivePokemon(0);
        secondTrainer.addToBanch(0);secondTrainer.addToBanch(0);
        firstTrainer.selectAttackPokemon(0);
        secondTrainer.selectAttackPokemon(0);
        firstTrainer.attackTrainer(secondTrainer);
        assertEquals(60,secondTrainer.getActivePokemon().getHP());
        secondTrainer.attackTrainer(firstTrainer);
        assertEquals(20,firstTrainer.getActivePokemon().getHP());
        for (int i=0;i<2;i++){
            firstTrainer.attackTrainer(secondTrainer);
        }
        secondTrainer.selectAttackPokemon(0);
        secondTrainer.attackTrainer(firstTrainer);
        assertEquals(100,firstTrainer.getActivePokemon().getHP());
    }

}
