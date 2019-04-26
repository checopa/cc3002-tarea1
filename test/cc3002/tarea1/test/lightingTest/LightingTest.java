package cc3002.tarea1.test.lightingTest;

import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.fighting.FightingPokemon;
import cc3002.tarea1.cards.pokemon.grass.GrassPokemon;
import cc3002.tarea1.cards.pokemon.lighting.LightingPokemon;
import cc3002.tarea1.cards.pokemon.psychic.PsychicPokemon;
import cc3002.tarea1.cards.pokemon.water.WaterPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.trainer.Trainer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;

public class LightingTest {
    Attack firstAttack, secondAttack, thirdAttack, fourthAttack;
    IPokemon fightingPokemon, waterPokemon, grassPokemon, psychicPokemon, lightingPokemon;
    Trainer firstTrainer, secondTrainer;
    HashMap<String,Integer> firstCost;

    @Before
    public void setUp(){
        firstAttack=new Attack("First",40,"First Attack",firstCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}});
        secondAttack=new Attack("Second",40,"Second Attack",firstCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}});
        psychicPokemon=new PsychicPokemon("Psychic",002,100,new ArrayList<>(Arrays.asList(firstAttack,secondAttack)));
        grassPokemon=new GrassPokemon("Grass",003,100,new ArrayList<>(Arrays.asList(firstAttack,secondAttack)));
        waterPokemon=new WaterPokemon("Water",004,100,new ArrayList<>(Arrays.asList(firstAttack,secondAttack)));
        lightingPokemon=new LightingPokemon("Lighting",005,100,new ArrayList<>(Arrays.asList(firstAttack,secondAttack)));
        fightingPokemon=new FightingPokemon("Fire",001,100,new ArrayList<>(Arrays.asList(firstAttack,secondAttack)));
        firstTrainer=new Trainer("Ash",new ArrayList<>(Arrays.asList(lightingPokemon,waterPokemon)),new ArrayList<>());
        secondTrainer=new Trainer("Ashn't",new ArrayList<>(Arrays.asList(fightingPokemon,psychicPokemon,grassPokemon)),new ArrayList<>());

    }

    @Test
    public void LightingTest(){
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
