package cc3002.tarea1.test.TestTarea2;

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
import cc3002.tarea1.cards.trainercard.ObjectTrainer;
import cc3002.tarea1.cards.trainercard.StadiumTrainer;
import cc3002.tarea1.cards.trainercard.SupportTrainer;
import cc3002.tarea1.controller.Controller;
import cc3002.tarea1.effects.IEffect;
import cc3002.tarea1.effects.NullEffect;
import cc3002.tarea1.effects.stadiumcardeffect.LuckyStadium;
import cc3002.tarea1.habilities.Ability;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.trainer.Trainer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestController {

    private Attack firstAttack,secondAttack;
    private IPokemon fightingPokemon, psychicPokemon, grassPokemon,waterPokemon,water2Pokemon,water3Pokemon,grass2Pokemon;
    private Trainer firstTrainer, secondTrainer;
    private IEnergy waterEnergy,grassEnergy,fireEnergy,fightingEnergy,psychicEnergy,lightingEnergy;
    private IEffect nulleffect,luckystadium;
    private AbstractTrainerCard stadiumTrainer;
    private Ability firstability;
    private Controller controller;

    @Before
    public void setUp(){
        nulleffect=new NullEffect();
        luckystadium=new LuckyStadium();

        firstability=new Ability("ability","ability",new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        firstAttack=new Attack("First",40,"First Attack",new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        secondAttack=new Attack("Second",30,"Second Attack",new HashMap<String,Integer>(){{put("Water",1);put("Fire",1);put("Fighting",1);put("Grass",1);put("Psychic",1);put("Lighting",1);}},nulleffect);
        fightingPokemon=new BasicFightingPokemon("Fighting",1,300,new ArrayList<>(Arrays.asList(firstAttack,firstability,secondAttack)));
        psychicPokemon=new BasicPsychicPokemon("Psychic",2,100,new ArrayList<>(Arrays.asList(firstAttack,secondAttack)));
        grassPokemon=new BasicGrassPokemon("Grass",003,100,new ArrayList<>(Arrays.asList(firstAttack,secondAttack)));
        waterPokemon=new BasicWaterPokemon("Water",004,100,new ArrayList<>(Arrays.asList(firstAttack,secondAttack)));
        water2Pokemon= new BasicWaterPokemon("Water2",5,100,new ArrayList<>(Arrays.asList(firstAttack,secondAttack)));
        stadiumTrainer=new StadiumTrainer("stadium","stadium",luckystadium);
        waterEnergy=new WaterEnergy("Water");
        grassEnergy=new GrassEnergy("Grass");
        fireEnergy=new FireEnergy("Fire");
        fightingEnergy=new FightingEnergy("Fighting");
        psychicEnergy=new PsychicEnergy("Psychic");
        lightingEnergy=new LightingEnergy("Lighting");
        firstTrainer=new Trainer("Ash",new ArrayList<>(Arrays.asList(grassPokemon,waterPokemon,fightingPokemon,psychicPokemon,grassEnergy,fireEnergy,fightingEnergy,psychicEnergy,lightingEnergy)));
        secondTrainer=new Trainer("Ashn't,",new ArrayList<>(Arrays.asList(grassPokemon,waterPokemon,stadiumTrainer,water2Pokemon,fightingPokemon,grassEnergy,fireEnergy,fightingEnergy,psychicEnergy,lightingEnergy)));

        controller=new Controller(firstTrainer,secondTrainer);
    }

    @Test
    public void controller(){
        assertEquals(firstTrainer,controller.getTrainerPlaying());
        assertNotEquals(firstTrainer,controller.getTrainerNotPlaying());
        controller.addtoPrize(2);
        controller.addToHand();
        controller.setSelectedCard(controller.getHand().get(0));
        assertEquals(fightingPokemon,controller.getSelectedCard());
        controller.playCard();
        controller.deselectCard();
        assertEquals(fightingPokemon,controller.getActivePokemon());
        assertEquals(new ArrayList<>(Arrays.asList(firstAttack,firstability,secondAttack)),controller.getAbilitiesPokemon());
        controller.selectAbility(2);
        assertEquals(secondAttack,controller.getSelectAbility());
        assertEquals(false,controller.canUseAbility());
        controller.finishTurn();
        assertEquals(secondTrainer,controller.getTrainerPlaying());
        controller.addToHand();
        controller.setSelectedCard(controller.getHand().get(0));
        controller.playCard();
        controller.deselectCard();
        assertEquals(fightingPokemon,controller.getOpponentActivePokemon());

        controller.selectAbility(0);
        controller.useAbility();
        assertEquals(100,controller.getOpponentActivePokemon().getHP());

        controller.finishTurn();
        controller.addToHand();
        controller.setSelectedCard(controller.getHand().get(0));
        controller.playCard();

        controller.finishTurn();
        controller.addToHand();
        controller.setSelectedCard(controller.getHand().get(0));
        controller.playCard();

        assertEquals(new ArrayList<>(Arrays.asList(psychicPokemon)),controller.getBench());
        assertEquals(new ArrayList<>(Arrays.asList(waterPokemon)),controller.getOpponentBench());

        controller.finishTurn();
        controller.addToHand();
        controller.setSelectedCard(controller.getHand().get(0));
        controller.playCard();
        controller.throwCoin();
        controller.doStadiumEffect();
        if(controller.getCoin()==0){
            assertEquals(1,controller.getHand().size());
        }
        else{
            assertEquals(0,controller.getHand().size());
        }
        controller.finishTurn();
        controller.addToHand();
        controller.setSelectedCard(controller.getHand().get(0));
        controller.setSelectedPokemon(controller.getBench().get(0));
        assertEquals(psychicPokemon,controller.getSelectedPokemon());
        controller.playCard();
        controller.deselectCard();
        assertEquals(1,controller.getSelectedPokemon().getGrassEnergy());
        controller.deselectPokemon();


    }
}
