package cc3002.tarea1.test.fightingTest;

import cc3002.tarea1.cards.energy.IEnergy;
import cc3002.tarea1.cards.energy.fighting.FightingEnergy;
import cc3002.tarea1.cards.energy.fire.FireEnergy;
import cc3002.tarea1.cards.energy.grass.GrassEnergy;
import cc3002.tarea1.cards.energy.lighting.LightingEnergy;
import cc3002.tarea1.cards.energy.psychic.PsychicEnergy;
import cc3002.tarea1.cards.energy.water.WaterEnergy;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.fighting.FightingPokemon;
import cc3002.tarea1.cards.pokemon.grass.GrassPokemon;
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
import static org.junit.Assert.assertNotEquals;

public class FightingBigTest {
    Attack firstAttack, secondAttack, thirdAttack, fourthAttack,fifthAttack;
    IPokemon fightingPokemon, psychicPokemon, grassPokemon,waterPokemon,water2Pokemon;
    Trainer firstTrainer, secondTrainer;
    HashMap<String,Integer> firstCost,secondCost,thirdCost,fourthCost;
    IEnergy waterEnergy,grassEnergy,fireEnergy,fightingEnergy,psychicEnergy,lightingEnergy;

    @Before
    public void setUp(){
        firstAttack=new Attack("First",40,"First Attack",firstCost=new HashMap<String,Integer>(){{put("Water",1);put("Fire",0);put("Fighting",1);put("Grass",0);put("Psychic",1);put("Lighting",0);}});
        secondAttack=new Attack("Second",30,"Second Attack",secondCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",1);put("Fighting",0);put("Grass",1);put("Psychic",0);put("Lighting",1);}});
        thirdAttack=new Attack("Third",50,"Third Attack",thirdCost=new HashMap<String,Integer>(){{put("Water",1);put("Fire",1);put("Fighting",1);put("Grass",1);put("Psychic",1);put("Lighting",1);}});
        fourthAttack=new Attack("Fourth",20,"Fourth Attack",fourthCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}});
        fifthAttack=new Attack("Fifth",20,"Fifth Attack",fourthCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}});
        fightingPokemon=new FightingPokemon("Fighting",001,300,new ArrayList<>(Arrays.asList(fourthAttack,firstAttack,secondAttack,thirdAttack,fifthAttack)));
        psychicPokemon=new PsychicPokemon("Psychic",002,100,new ArrayList<>(Arrays.asList(fourthAttack,thirdAttack,firstAttack)));
        grassPokemon=new GrassPokemon("Grass",003,100,new ArrayList<>(Arrays.asList(fourthAttack,secondAttack,thirdAttack)));
        waterPokemon=new WaterPokemon("Water",004,100,new ArrayList<>(Arrays.asList(fourthAttack,thirdAttack,firstAttack)));
        water2Pokemon=new WaterPokemon("Water2",005,100,new ArrayList<>(Arrays.asList(fourthAttack,thirdAttack,secondAttack,firstAttack)));
        waterEnergy=new WaterEnergy("Water");
        grassEnergy=new GrassEnergy("Grass");
        fireEnergy=new FireEnergy("Fire");
        fightingEnergy=new FightingEnergy("Fighting");
        psychicEnergy=new PsychicEnergy("Psychic");
        lightingEnergy=new LightingEnergy("Lighting");
        firstTrainer=new Trainer("Ash",new ArrayList<>(Arrays.asList(fightingPokemon,water2Pokemon)),new ArrayList<>(Arrays.asList(waterEnergy,grassEnergy,fireEnergy,fightingEnergy,lightingEnergy,psychicEnergy)));
        secondTrainer=new Trainer("Ashn't",new ArrayList<>(Arrays.asList(waterPokemon,psychicPokemon,grassPokemon)),new ArrayList<>(Arrays.asList(waterEnergy,grassEnergy,fireEnergy,fightingEnergy,psychicEnergy,lightingEnergy)));
    }

    @Test
    public void BigTest(){
        assertEquals(new ArrayList<>(Arrays.asList(fightingPokemon,water2Pokemon)),firstTrainer.getPokemons());
        assertEquals(new ArrayList<>(Arrays.asList(waterPokemon,psychicPokemon,grassPokemon)),secondTrainer.getPokemons());
        assertEquals(new ArrayList<>(Arrays.asList(waterEnergy,grassEnergy,fireEnergy,fightingEnergy,lightingEnergy,psychicEnergy)),firstTrainer.getEnergies());
        assertEquals(new ArrayList<>(Arrays.asList(waterEnergy,grassEnergy,fireEnergy,fightingEnergy,psychicEnergy,lightingEnergy)),secondTrainer.getEnergies());
        assertEquals("Water",firstTrainer.getEnergies().get(0).getName());
        assertEquals("Ash",firstTrainer.getName());
        assertEquals("Ashn't",secondTrainer.getName());
        firstTrainer.selectActivePokemon(0);
        firstTrainer.addToBanch(0);
        secondTrainer.selectActivePokemon(0);
        assertNotEquals(firstTrainer.getActivePokemon(),secondTrainer.getActivePokemon());
        secondTrainer.addToBanch(0);secondTrainer.addToBanch(0);
        assertNotEquals(new ArrayList<>(),firstTrainer.getBanch());
        assertEquals(new ArrayList<>(Arrays.asList(fourthAttack,firstAttack,secondAttack,thirdAttack)),firstTrainer.getAttacksPokemon());
        assertEquals(fightingPokemon,firstTrainer.getActivePokemon());
        assertEquals("Fighting",firstTrainer.getActivePokemon().getName());
        assertEquals(001,firstTrainer.getActivePokemon().getId());
        assertEquals(300,firstTrainer.getActivePokemon().getHP());
        assertEquals(true,firstTrainer.getActivePokemon().isAlive());
        firstTrainer.selectAttackPokemon(0);
        secondTrainer.selectAttackPokemon(0);
        assertEquals("Fourth Attack",firstTrainer.getActivePokemon().getSelectedAttack().getDescription());
        assertEquals(fourthAttack,firstTrainer.getSelectedAttackPokemon());
        assertNotEquals(firstAttack,secondTrainer.getSelectedAttackPokemon());
        assertNotEquals(false,secondTrainer.getActivePokemon().cantAttack());
        secondTrainer.attackTrainer(firstTrainer);
        assertEquals(280,firstTrainer.getActivePokemon().getHP());
        for (int i=0;i<6;i++){
            firstTrainer.implementEnergy(0);
        }
        firstTrainer.selectAttackPokemon(1);
        for (int i=0;i<10;i++) {
            firstTrainer.attackTrainer(secondTrainer);
        }
        secondTrainer.selectAttackPokemon(1);
        assertEquals(false,secondTrainer.getActivePokemon().cantAttack());
        for (int i=0;i<6;i++){
            secondTrainer.implementEnergy(0);
        }
        assertEquals(true,secondTrainer.getActivePokemon().cantAttack());
        secondTrainer.attackTrainer(firstTrainer);
        assertEquals(180,firstTrainer.getActivePokemon().getHP());
        for (int i=0;i<10;i++) {
            firstTrainer.attackTrainer(secondTrainer);
        }
        secondTrainer.selectAttackPokemon(0);
        secondTrainer.attackTrainer(firstTrainer);
        assertEquals(140,firstTrainer.getActivePokemon().getHP());


    }
}
