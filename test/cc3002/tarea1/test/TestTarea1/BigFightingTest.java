package cc3002.tarea1.test.TestTarea1;

import cc3002.tarea1.cards.energy.IEnergy;
import cc3002.tarea1.cards.energy.fighting.FightingEnergy;
import cc3002.tarea1.cards.energy.fire.FireEnergy;
import cc3002.tarea1.cards.energy.grass.GrassEnergy;
import cc3002.tarea1.cards.energy.lighting.LightingEnergy;
import cc3002.tarea1.cards.energy.psychic.PsychicEnergy;
import cc3002.tarea1.cards.energy.water.WaterEnergy;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.fighting.BasicFightingPokemon;
import cc3002.tarea1.cards.pokemon.grass.BasicGrassPokemon;
import cc3002.tarea1.cards.pokemon.psychic.BasicPsychicPokemon;
import cc3002.tarea1.cards.pokemon.water.BasicWaterPokemon;
import cc3002.tarea1.effects.IEffect;
import cc3002.tarea1.effects.NullEffect;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.trainer.Trainer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BigFightingTest {
    Attack firstAttack, secondAttack, thirdAttack, fourthAttack,fifthAttack;
    IPokemon fightingPokemon, psychicPokemon, grassPokemon,waterPokemon,water2Pokemon;
    Trainer firstTrainer, secondTrainer;
    HashMap<String,Integer> firstCost,secondCost,thirdCost,fourthCost;
    IEnergy waterEnergy,grassEnergy,fireEnergy,fightingEnergy,psychicEnergy,lightingEnergy;
    IEffect nulleffect;

    @Before
    public void setUp(){
        nulleffect=new NullEffect();
        firstAttack=new Attack("First",40,"First Attack",firstCost=new HashMap<String,Integer>(){{put("Water",1);put("Fire",0);put("Fighting",1);put("Grass",0);put("Psychic",1);put("Lighting",0);}},nulleffect);
        secondAttack=new Attack("Second",30,"Second Attack",secondCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",1);put("Fighting",0);put("Grass",1);put("Psychic",0);put("Lighting",1);}},nulleffect);
        thirdAttack=new Attack("Third",50,"Third Attack",thirdCost=new HashMap<String,Integer>(){{put("Water",1);put("Fire",1);put("Fighting",1);put("Grass",1);put("Psychic",1);put("Lighting",1);}},nulleffect);
        fourthAttack=new Attack("Fourth",20,"Fourth Attack",fourthCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        fifthAttack=new Attack("Fifth",20,"Fifth Attack",fourthCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        fightingPokemon=new BasicFightingPokemon("Fighting",001,300,new ArrayList<>(Arrays.asList(fourthAttack,firstAttack,secondAttack,thirdAttack,fifthAttack)));
        psychicPokemon=new BasicPsychicPokemon("Psychic",002,100,new ArrayList<>(Arrays.asList(fourthAttack,thirdAttack,firstAttack)));
        grassPokemon=new BasicGrassPokemon("Grass",003,100,new ArrayList<>(Arrays.asList(fourthAttack,secondAttack,thirdAttack)));
        waterPokemon=new BasicWaterPokemon("Water",004,100,new ArrayList<>(Arrays.asList(fourthAttack,thirdAttack,firstAttack)));
        water2Pokemon=new BasicWaterPokemon("Water2",005,100,new ArrayList<>(Arrays.asList(fourthAttack,thirdAttack,secondAttack,firstAttack)));
        waterEnergy=new WaterEnergy("Water");
        grassEnergy=new GrassEnergy("Grass");
        fireEnergy=new FireEnergy("Fire");
        fightingEnergy=new FightingEnergy("Fighting");
        psychicEnergy=new PsychicEnergy("Psychic");
        lightingEnergy=new LightingEnergy("Lighting");
        firstTrainer=new Trainer("Ash",new ArrayList<>(Arrays.asList(fightingPokemon,water2Pokemon,waterEnergy,grassEnergy,fireEnergy,fightingEnergy,lightingEnergy,psychicEnergy)));
        secondTrainer=new Trainer("Ashn't",new ArrayList<>(Arrays.asList(waterPokemon,psychicPokemon,grassPokemon,waterEnergy,grassEnergy,fireEnergy,fightingEnergy,psychicEnergy,lightingEnergy)));
    }

    @Test
    public void BigTest(){
        assertEquals("Ash",firstTrainer.getName());
        assertEquals("Ashn't",secondTrainer.getName());
        firstTrainer.addToHand(2);
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        firstTrainer.playCard();
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        firstTrainer.playCard();
        secondTrainer.addToHand(3);
        secondTrainer.setSelectedCard(secondTrainer.getHand().get(0));
        secondTrainer.playCard();
        assertNotEquals(firstTrainer.getActivePokemon(),secondTrainer.getActivePokemon());
        secondTrainer.setSelectedCard(secondTrainer.getHand().get(0));
        secondTrainer.playCard();
        secondTrainer.setSelectedCard(secondTrainer.getHand().get(0));
        secondTrainer.playCard();
        assertNotEquals(new ArrayList<>(),firstTrainer.getBench());
        assertEquals(new ArrayList<>(Arrays.asList(fourthAttack,firstAttack,secondAttack,thirdAttack)),firstTrainer.getActivePokemon().getAbilities());
        assertEquals(fightingPokemon,firstTrainer.getActivePokemon());
        assertEquals("Fighting",firstTrainer.getActivePokemon().getName());
        assertEquals(001,firstTrainer.getActivePokemon().getId());
        assertEquals(300,firstTrainer.getActivePokemon().getHP());
        assertEquals(true,firstTrainer.getActivePokemon().isAlive());
        firstTrainer.selectAbilityPokemon(0);
        secondTrainer.selectAbilityPokemon(0);
        assertEquals("Fourth Attack",firstTrainer.getActivePokemon().getSelectedAbility().getDescription());
        assertEquals(fourthAttack,firstTrainer.getSelectedAbilityPokemon());
        assertNotEquals(firstAttack,secondTrainer.getSelectedAbilityPokemon());
        assertNotEquals(false,secondTrainer.getActivePokemon().cantAttack());
        secondTrainer.attackTrainer(firstTrainer);
        assertEquals(280,firstTrainer.getActivePokemon().getHP());
        firstTrainer.addToHand(6);
        firstTrainer.setSelectedPokemon(firstTrainer.getActivePokemon());
        for(int i=0;i<6;i++) {
            firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
            firstTrainer.playCard();
        }
        firstTrainer.selectAbilityPokemon(1);
        for (int i=0;i<10;i++) {
            firstTrainer.attackTrainer(secondTrainer);
        }
        secondTrainer.selectAbilityPokemon(1);
        assertEquals(false,secondTrainer.getActivePokemon().cantAttack());
        secondTrainer.addToHand(6);
        secondTrainer.setSelectedPokemon(secondTrainer.getActivePokemon());
        for(int i=0;i<6;i++) {
            secondTrainer.setSelectedCard(secondTrainer.getHand().get(0));
            secondTrainer.playCard();
        }

        assertEquals(true,secondTrainer.getActivePokemon().cantAttack());
        secondTrainer.attackTrainer(firstTrainer);
        assertEquals(180,firstTrainer.getActivePokemon().getHP());
        for (int i=0;i<10;i++) {
            firstTrainer.attackTrainer(secondTrainer);
        }
        secondTrainer.selectAbilityPokemon(0);
        secondTrainer.attackTrainer(firstTrainer);
        assertEquals(140,firstTrainer.getActivePokemon().getHP());


    }
}