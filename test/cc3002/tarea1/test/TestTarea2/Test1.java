package cc3002.tarea1.test.TestTarea2;

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
import cc3002.tarea1.cards.trainercard.ObjectTrainer;
import cc3002.tarea1.cards.trainercard.StadiumTrainer;
import cc3002.tarea1.cards.trainercard.SupportTrainer;
import cc3002.tarea1.controller.Controller;
import cc3002.tarea1.effects.*;
import cc3002.tarea1.effects.abilityeffect.WingBuzz;
import cc3002.tarea1.effects.attackeffect.ElectricShock;
import cc3002.tarea1.effects.objectcardeffect.GreatBallEffect;
import cc3002.tarea1.effects.stadiumcardeffect.LuckyStadium;
import cc3002.tarea1.effects.supportcardeffect.ProfesorJuniper;
import cc3002.tarea1.habilities.Ability;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.habilities.IAbility;
import cc3002.tarea1.trainer.Trainer;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class Test1 {
    private Attack firstAttack, secondAttack, thirdAttack, fourthAttack,fifthAttack,sixthAttack;
    private IPokemon fightingPokemon, psychicPokemon, grassPokemon,waterPokemon,water2Pokemon,water3Pokemon,grass2Pokemon;
    private Trainer firstTrainer, secondTrainer,thirdTrainer,fourthTrainer,fifthTrainer,sixthTrainer;
    private HashMap<String,Integer> firstCost,secondCost,thirdCost,fourthCost;
    private IEnergy waterEnergy,grassEnergy,fireEnergy,fightingEnergy,psychicEnergy,lightingEnergy;
    private IEffect nulleffect,profesorjuniper,greatballeffect,luckystadium,electricshock,wingbuzz;
    private AbstractTrainerCard supportTrainer ,objectTrainer,stadiumTrainer;
    private Ability firstability;
    private Controller controller;


    @Before
    public void setUp(){

        nulleffect=new NullEffect();
        profesorjuniper=new ProfesorJuniper();
        greatballeffect=new GreatBallEffect();
        luckystadium=new LuckyStadium();
        electricshock=new ElectricShock(50);
        wingbuzz=new WingBuzz();
        firstability=new Ability("ability","ability",new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},wingbuzz);
        firstAttack=new Attack("First",40,"First Attack",firstCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        secondAttack=new Attack("Second",30,"Second Attack",secondCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        thirdAttack=new Attack("Third",50,"Third Attack",thirdCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        fourthAttack=new Attack("Fourth",20,"Fourth Attack",fourthCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        fifthAttack=new Attack("Fifth",20,"Fifth Attack",fourthCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        sixthAttack=new Attack("Fifth",20,"Fifth Attack",fourthCost=new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},electricshock);
        fightingPokemon=new BasicFightingPokemon("Fighting",1,300,new ArrayList<>(Arrays.asList(fourthAttack,firstAttack,secondAttack,thirdAttack,fifthAttack)));
        psychicPokemon=new BasicPsychicPokemon("Psychic",2,100,new ArrayList<>(Arrays.asList(fourthAttack,thirdAttack,firstAttack)));
        grassPokemon=new BasicGrassPokemon("Grass",003,100,new ArrayList<>(Arrays.asList(fourthAttack,secondAttack,thirdAttack)));
        waterPokemon=new BasicWaterPokemon("Water",004,100,new ArrayList<>(Arrays.asList(fourthAttack,thirdAttack,firstAttack)));
        water2Pokemon=new PhaseOneWaterPokemon("Water2",5,100,new ArrayList<>(Arrays.asList(fourthAttack,thirdAttack,secondAttack,firstAttack)),4);
        water3Pokemon=new PhaseTwoWaterPokemon("Water3",6,100,new ArrayList<>(Arrays.asList(fourthAttack,thirdAttack,secondAttack,firstAttack)),5);
        grass2Pokemon=new BasicGrassPokemon("Grass",8,100,new ArrayList<>(Arrays.asList(sixthAttack,firstability)));
        supportTrainer=new SupportTrainer("support","support",profesorjuniper);
        objectTrainer=new ObjectTrainer("object","object",greatballeffect);
        stadiumTrainer=new StadiumTrainer("stadium","stadium",luckystadium);
        waterEnergy=new WaterEnergy("Water");
        grassEnergy=new GrassEnergy("Grass");
        fireEnergy=new FireEnergy("Fire");
        fightingEnergy=new FightingEnergy("Fighting");
        psychicEnergy=new PsychicEnergy("Psychic");
        lightingEnergy=new LightingEnergy("Lighting");
        firstTrainer=new Trainer("Ash",new ArrayList<>(Arrays.asList(waterPokemon,water2Pokemon,water3Pokemon,waterEnergy,grassEnergy,fireEnergy,grassEnergy,grassPokemon)));
        secondTrainer=new Trainer("Ashn't",new ArrayList<>(Arrays.asList(waterPokemon,psychicPokemon,grassPokemon,fightingEnergy,psychicEnergy,lightingEnergy)));
        thirdTrainer = new Trainer("AshTwo", new ArrayList<>(Arrays.asList(supportTrainer, waterPokemon, water2Pokemon, water3Pokemon, waterEnergy, grassEnergy, fireEnergy, grassEnergy, grassPokemon,psychicPokemon,fightingPokemon)));
        fourthTrainer=new Trainer("Ashn'tTwo",new ArrayList<>(Arrays.asList(objectTrainer, waterPokemon, water2Pokemon, water3Pokemon, waterEnergy, grassEnergy, fireEnergy, grassEnergy, grassPokemon)));
        fifthTrainer = new Trainer("AshTwo", new ArrayList<>(Arrays.asList(stadiumTrainer, waterPokemon, water2Pokemon, water3Pokemon, waterEnergy, grassEnergy, fireEnergy, grassEnergy, grassPokemon)));
        sixthTrainer = new Trainer("AshTwo", new ArrayList<>(Arrays.asList(grass2Pokemon,waterPokemon, water2Pokemon, water3Pokemon, waterEnergy, grassEnergy, fireEnergy, grassEnergy, grassPokemon)));
        controller=new Controller(firstTrainer,secondTrainer);
    }

    @Test
    public void Logic() {
        firstTrainer.setController(controller);
        assertEquals(stadiumTrainer.getDescription(),"stadium");
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
        controller.changeTurn();
        controller.changeTurn();
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        firstTrainer.playCard();
        firstTrainer.deselectedCard();
        controller.changeTurn();
        controller.changeTurn();
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        firstTrainer.playCard();
        firstTrainer.deselectedCard();
        controller.changeTurn();
        controller.changeTurn();
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

        sixthTrainer.addToHand(4);
        sixthTrainer.setSelectedCard(sixthTrainer.getHand().get(0));
        sixthTrainer.playCard();
        sixthTrainer.setSelectedCard(sixthTrainer.getHand().get(0));
        sixthTrainer.playCard();
        sixthTrainer.setSelectedCard(sixthTrainer.getHand().get(0));
        sixthTrainer.setSelectedPokemon(sixthTrainer.getBench().get(0));
        sixthTrainer.playCard();
        assertEquals(water2Pokemon,sixthTrainer.getBench().get(0));

    }

    @Test
    public void TrainerCardTest(){
        controller=new Controller(thirdTrainer,sixthTrainer);
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




        fourthTrainer.addToHand(1);
        fourthTrainer.setSelectedCard(fourthTrainer.getHand().get(0));
        fourthTrainer.playCard();
        assertEquals(1,fourthTrainer.getBench().size());
        assertEquals(7,fourthTrainer.getDeck().size());
        fourthTrainer.setOpponent(fifthTrainer);
        fifthTrainer.addToHand(1);
        fifthTrainer.setSelectedCard(fifthTrainer.getHand().get(0));
        fifthTrainer.throwCoin();
        fifthTrainer.playCard();
        fifthTrainer.doStadiumEffect();
        if(fifthTrainer.getCoin()==0){
            assertEquals(1,fifthTrainer.getHand().size());
            assertEquals(7,fifthTrainer.getDeck().size());
        }
        else{
            assertEquals(0,fifthTrainer.getHand().size());
            assertEquals(8,fifthTrainer.getDeck().size());
        }

        sixthTrainer.addToHand(4);
        sixthTrainer.setOpponent(thirdTrainer);
        sixthTrainer.setSelectedCard(sixthTrainer.getHand().get(0));
        sixthTrainer.playCard();
        sixthTrainer.selectAbilityPokemon(1);
        sixthTrainer.setSelectedCard(sixthTrainer.getHand().get(2));
        sixthTrainer.useAbility();
        assertEquals(2,sixthTrainer.getHand().size());
        assertEquals(1,thirdTrainer.getDeck().size());



        sixthTrainer.selectAbilityPokemon(0);
        sixthTrainer.throwCoin();
        sixthTrainer.useAbility();
        assertEquals(60,thirdTrainer.getActivePokemon().getHP());
        if(sixthTrainer.getCoin()==1) {
            assertEquals(50, sixthTrainer.getActivePokemon().getHP());
        }
        else{
            assertEquals(100,sixthTrainer.getActivePokemon().getHP());
        }


    }

    @Test
    public void Trainer(){
        IAbility ability=new Ability("ability","ability",new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        fightingPokemon = new BasicFightingPokemon("Fighting", 1, 300, new ArrayList<>(Arrays.asList(ability)));
        ArrayList<ICard> deck=new ArrayList<>();
        for(int i=0;i<70;i++){
            deck.add(fightingPokemon);
        }
        Trainer trainer=new Trainer("trainer",deck);
        assertEquals(60,trainer.getDeck().size());
        trainer.addToPrize(10);
        assertEquals(6,trainer.getPrizecard().size());
        trainer.addToHand(6);
        trainer.setSelectedCard(trainer.getHand().get(0));
        trainer.playCard();
        assertEquals(new ArrayList<>(Arrays.asList(ability)),trainer.getAbilitiesPokemon());
    }
}