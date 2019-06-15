package cc3002.tarea1.test.Test;

import cc3002.tarea1.cards.ICard;
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
import cc3002.tarea1.cards.pokemon.water.PhaseOneWaterPokemon;
import cc3002.tarea1.cards.pokemon.water.PhaseTwoWaterPokemon;
import cc3002.tarea1.cards.trainercard.AbstractTrainerCard;
import cc3002.tarea1.cards.trainercard.SupportTrainer;
import cc3002.tarea1.effects.AbstractEffect;
import cc3002.tarea1.effects.IEffect;
import cc3002.tarea1.effects.NullEffect;
import cc3002.tarea1.effects.ProfesorJuniper;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.trainer.Trainer;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class Test1 {
    Attack firstAttack, secondAttack, thirdAttack, fourthAttack,fifthAttack;
    IPokemon fightingPokemon, psychicPokemon, grassPokemon,waterPokemon,water2Pokemon,water3Pokemon;
    Trainer firstTrainer, secondTrainer,thirdTrainer;
    HashMap<String,Integer> firstCost,secondCost,thirdCost,fourthCost;
    IEnergy waterEnergy,grassEnergy,fireEnergy,fightingEnergy,psychicEnergy,lightingEnergy;
    IEffect nulleffect,profesorjuniper;
    AbstractTrainerCard supportTrainer;


    @Before
    public void setUp(){

        nulleffect=new NullEffect();
        profesorjuniper=new ProfesorJuniper();
        firstAttack=new Attack("First",40,"First Attack",firstCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        secondAttack=new Attack("Second",30,"Second Attack",secondCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        thirdAttack=new Attack("Third",50,"Third Attack",thirdCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        fourthAttack=new Attack("Fourth",20,"Fourth Attack",fourthCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        fifthAttack=new Attack("Fifth",20,"Fifth Attack",fourthCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        fightingPokemon=new BasicFightingPokemon("Fighting",001,300,new ArrayList<>(Arrays.asList(fourthAttack,firstAttack,secondAttack,thirdAttack,fifthAttack)));
        psychicPokemon=new BasicPsychicPokemon("Psychic",002,100,new ArrayList<>(Arrays.asList(fourthAttack,thirdAttack,firstAttack)));
        grassPokemon=new BasicGrassPokemon("Grass",003,100,new ArrayList<>(Arrays.asList(fourthAttack,secondAttack,thirdAttack)));
        waterPokemon=new BasicWaterPokemon("Water",004,100,new ArrayList<>(Arrays.asList(fourthAttack,thirdAttack,firstAttack)));
        water2Pokemon=new PhaseOneWaterPokemon("Water2",005,100,new ArrayList<>(Arrays.asList(fourthAttack,thirdAttack,secondAttack,firstAttack)),004);
        water3Pokemon=new PhaseTwoWaterPokemon("Water3",006,100,new ArrayList<>(Arrays.asList(fourthAttack,thirdAttack,secondAttack,firstAttack)),005);
        supportTrainer=new SupportTrainer("support","support",profesorjuniper);
        waterEnergy=new WaterEnergy("Water");
        grassEnergy=new GrassEnergy("Grass");
        fireEnergy=new FireEnergy("Fire");
        fightingEnergy=new FightingEnergy("Fighting");
        psychicEnergy=new PsychicEnergy("Psychic");
        lightingEnergy=new LightingEnergy("Lighting");
        firstTrainer=new Trainer("Ash",new ArrayList<>(Arrays.asList(waterPokemon,water2Pokemon,water3Pokemon,waterEnergy,grassEnergy,fireEnergy,grassEnergy,grassPokemon)));
        secondTrainer=new Trainer("Ashn't",new ArrayList<>(Arrays.asList(waterPokemon,psychicPokemon,grassPokemon,fightingEnergy,psychicEnergy,lightingEnergy)));
        thirdTrainer = new Trainer("Ash", new ArrayList<>(Arrays.asList(supportTrainer, waterPokemon, water2Pokemon, water3Pokemon, waterEnergy, grassEnergy, fireEnergy, grassEnergy, grassPokemon)));
    }

    @Test
    public void BigTest() {
        //Se añaden las tras cartas del mazo a la mano del primer entrenador
        firstTrainer.addToHand(6);
        //Se selecciona la carta de la mano que sera jugada
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        firstTrainer.playCard();
        firstTrainer.deselectedCard();
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        //Se selecciona el pokemon que recibira lo producido al jugar la carta
        firstTrainer.setSelectedPokemon(firstTrainer.getActivePokemon());
        firstTrainer.playCard();
        firstTrainer.deselectedCard();
        assertEquals(firstTrainer.getActivePokemon(),water2Pokemon);
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        firstTrainer.setSelectedPokemon(firstTrainer.getActivePokemon());
        assertEquals(firstTrainer.getSelectedPokemon(),water2Pokemon);
        firstTrainer.playCard();
        firstTrainer.deselectedCard();
        assertEquals(firstTrainer.getActivePokemon(),water3Pokemon);
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        firstTrainer.setSelectedPokemon(firstTrainer.getActivePokemon());
        firstTrainer.playCard();
        firstTrainer.deselectedCard();
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        firstTrainer.playCard();
        firstTrainer.deselectedCard();
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        firstTrainer.playCard();
        firstTrainer.deselectedCard();
        assertEquals(1,firstTrainer.getActivePokemon().getWaterEnergy());
        assertEquals(1,firstTrainer.getActivePokemon().getGrassEnergy());
        assertEquals(1,firstTrainer.getActivePokemon().getFireEnergy());
        secondTrainer.addToHand(3);
        secondTrainer.setSelectedCard(secondTrainer.getHand().get(0));
        secondTrainer.playCard();
        secondTrainer.setSelectedCard(secondTrainer.getHand().get(0));
        secondTrainer.playCard();
        secondTrainer.setSelectedCard(secondTrainer.getHand().get(0));
        secondTrainer.playCard();
        firstTrainer.selectAbilityPokemon(1);
        firstTrainer.setOpponent(secondTrainer);
        firstTrainer.useAbility();
        assertEquals(50,secondTrainer.getActivePokemon().getHP());
        firstTrainer.attackTrainer(secondTrainer);
        assertEquals(1,secondTrainer.getDiscardCards().size());
        assertEquals(1,secondTrainer.getBench().size());
    }

    @Test
    public void TrainerCardTest(){
        thirdTrainer.addToHand(2);
        thirdTrainer.setSelectedCard(thirdTrainer.getHand().get(1));
        thirdTrainer.playCard();
        assertEquals(waterPokemon,thirdTrainer.getActivePokemon());
        assertEquals(0,thirdTrainer.getBench().size());
        thirdTrainer.setSelectedCard(thirdTrainer.getHand().get(0));
        thirdTrainer.playCard();
        assertEquals(1,thirdTrainer.getDiscardCards().size());
        assertEquals(7,thirdTrainer.getHand().size());
        assertEquals(waterPokemon,thirdTrainer.getActivePokemon());
    }
}