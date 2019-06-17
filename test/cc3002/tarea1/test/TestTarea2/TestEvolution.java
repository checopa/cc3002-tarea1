package cc3002.tarea1.test.TestTarea2;

import cc3002.tarea1.cards.pokemon.IBasicPokemon;
import cc3002.tarea1.cards.pokemon.IPhaseOnePokemon;
import cc3002.tarea1.cards.pokemon.IPhaseTwoPokemon;
import cc3002.tarea1.cards.pokemon.fighting.BasicFightingPokemon;
import cc3002.tarea1.cards.pokemon.fighting.PhaseOneFightingPokemon;
import cc3002.tarea1.cards.pokemon.fighting.PhaseTwoFightingPokemon;
import cc3002.tarea1.cards.pokemon.fire.BasicFirePokemon;
import cc3002.tarea1.cards.pokemon.fire.PhaseOneFirePokemon;
import cc3002.tarea1.cards.pokemon.fire.PhaseTwoFirePokemon;
import cc3002.tarea1.cards.pokemon.grass.BasicGrassPokemon;
import cc3002.tarea1.cards.pokemon.grass.PhaseOneGrassPokemon;
import cc3002.tarea1.cards.pokemon.grass.PhaseTwoGrassPokemon;
import cc3002.tarea1.cards.pokemon.lighting.BasicLightingPokemon;
import cc3002.tarea1.cards.pokemon.lighting.PhaseOneLightingPokemon;
import cc3002.tarea1.cards.pokemon.lighting.PhaseTwoLightingPokemon;
import cc3002.tarea1.cards.pokemon.psychic.BasicPsychicPokemon;
import cc3002.tarea1.cards.pokemon.psychic.PhaseOnePsychicPokemon;
import cc3002.tarea1.cards.pokemon.psychic.PhaseTwoPsychicPokemon;
import cc3002.tarea1.cards.pokemon.water.BasicWaterPokemon;
import cc3002.tarea1.cards.pokemon.water.PhaseOneWaterPokemon;
import cc3002.tarea1.cards.pokemon.water.PhaseTwoWaterPokemon;
import cc3002.tarea1.effects.IEffect;
import cc3002.tarea1.effects.NullEffect;
import cc3002.tarea1.habilities.Ability;
import cc3002.tarea1.habilities.IAbility;
import cc3002.tarea1.trainer.Trainer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

public class TestEvolution {
    IEffect nulleffect;
    IAbility ability;
    IBasicPokemon fightingPokemon,waterPokemon,firePokemon,grassPokemon,lightingPokemon,psychicPokemon;
    IPhaseOnePokemon fightingPhaseOnePokemon,waterPhaseOnePokemon,firePhaseOnePokemon,grassPhaseOnePokemon,lightingPhaseOnePokemon,psychicPhaseOnePokemon;
    IPhaseOnePokemon fpop,wpop,firepop,gpop,lpop,ppop;
    IPhaseTwoPokemon fightingPhaseTwoPokemon,waterPhaseTwoPokemon,firePhaseTwoPokemon,grassPhaseTwoPokemon,lightingPhaseTwoPokemon,psychicPhaseTwoPokemon;
    Trainer firstTrainer,secondTrainer,thirdTrainer,fourthTrainer,fifthTrainer,sixthTrainer;

    @Before
    public void setUp(){
        nulleffect=new NullEffect();
        ability=new Ability("ability","ability",new HashMap<String,Integer>(){{put("Water",0);put("Fire",0);put("Fighting",0);put("Grass",0);put("Psychic",0);put("Lighting",0);}},nulleffect);
        fightingPokemon = new BasicFightingPokemon("Fighting", 1, 300, new ArrayList<>(Arrays.asList(ability)));
        fightingPhaseOnePokemon= new PhaseOneFightingPokemon("Fighting One",2,300,new ArrayList<>(Arrays.asList(ability)),1);
        fightingPhaseTwoPokemon= new PhaseTwoFightingPokemon("Fighting Two",3,300,new ArrayList<>(Arrays.asList(ability)),2);
        waterPokemon = new BasicWaterPokemon("Water", 4, 300, new ArrayList<>(Arrays.asList(ability)));
        waterPhaseOnePokemon= new PhaseOneWaterPokemon("Water One",5,300,new ArrayList<>(Arrays.asList(ability)),4);
        waterPhaseTwoPokemon= new PhaseTwoWaterPokemon("Water Two",6,300,new ArrayList<>(Arrays.asList(ability)),5);
        firePokemon = new BasicFirePokemon("Fire", 7, 300, new ArrayList<>(Arrays.asList(ability)));
        firePhaseOnePokemon= new PhaseOneFirePokemon("Fire One",8,300,new ArrayList<>(Arrays.asList(ability)),7);
        firePhaseTwoPokemon= new PhaseTwoFirePokemon("Fire Two",9,300,new ArrayList<>(Arrays.asList(ability)),8);
        grassPokemon = new BasicGrassPokemon("Grass", 10, 300, new ArrayList<>(Arrays.asList(ability)));
        grassPhaseOnePokemon= new PhaseOneGrassPokemon("Grass One",11,300,new ArrayList<>(Arrays.asList(ability)),10);
        grassPhaseTwoPokemon= new PhaseTwoGrassPokemon("Grass Two",12,300,new ArrayList<>(Arrays.asList(ability)),11);
        lightingPokemon = new BasicLightingPokemon("lighting", 13, 300, new ArrayList<>(Arrays.asList(ability)));
        lightingPhaseOnePokemon= new PhaseOneLightingPokemon("lighting One",14,300,new ArrayList<>(Arrays.asList(ability)),13);
        lightingPhaseTwoPokemon= new PhaseTwoLightingPokemon("lighting Two",15,300,new ArrayList<>(Arrays.asList(ability)),14);
        psychicPokemon = new BasicPsychicPokemon("Psychic", 16, 300, new ArrayList<>(Arrays.asList(ability)));
        psychicPhaseOnePokemon= new PhaseOnePsychicPokemon("Psychic One",17,300,new ArrayList<>(Arrays.asList(ability)),16);
        psychicPhaseTwoPokemon= new PhaseTwoPsychicPokemon("Psychic Two",18,300,new ArrayList<>(Arrays.asList(ability)),17);
        firstTrainer=new Trainer("First",new ArrayList<>(Arrays.asList(fightingPokemon,fightingPhaseOnePokemon,fightingPhaseTwoPokemon)));
        secondTrainer=new Trainer("second",new ArrayList<>(Arrays.asList(waterPokemon,waterPhaseOnePokemon,waterPhaseTwoPokemon)));
        thirdTrainer=new Trainer("third",new ArrayList<>(Arrays.asList(firePokemon,firePhaseOnePokemon,firePhaseTwoPokemon)));
        fourthTrainer=new Trainer("fourth",new ArrayList<>(Arrays.asList(grassPokemon,grassPhaseOnePokemon,grassPhaseTwoPokemon)));
        fifthTrainer=new Trainer("fifth",new ArrayList<>(Arrays.asList(lightingPokemon,lightingPhaseOnePokemon,lightingPhaseTwoPokemon)));
        sixthTrainer=new Trainer("sixth",new ArrayList<>(Arrays.asList(psychicPokemon,psychicPhaseOnePokemon,psychicPhaseTwoPokemon)));

        fpop=new PhaseOneFightingPokemon("Fighting One",2,300,new ArrayList<>(Arrays.asList(ability)),2);
        wpop=new PhaseOneWaterPokemon("Water One",5,300,new ArrayList<>(Arrays.asList(ability)),5);
        firepop=new PhaseOneFirePokemon("Fire One",8,300,new ArrayList<>(Arrays.asList(ability)),8);
        lpop=new PhaseOneLightingPokemon("lighting One",14,300,new ArrayList<>(Arrays.asList(ability)),14);
        ppop=new PhaseOnePsychicPokemon("Psychic One",17,300,new ArrayList<>(Arrays.asList(ability)),17);
        gpop=new PhaseOneGrassPokemon("Grass One",11,300,new ArrayList<>(Arrays.asList(ability)),11);

    }

    @Test
    public void Evolution(){
        firstTrainer.addToHand(3);
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        firstTrainer.playCard();
        assertEquals(fightingPokemon,firstTrainer.getActivePokemon());
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        firstTrainer.setSelectedPokemon(firstTrainer.getActivePokemon());
        firstTrainer.playCard();
        firstTrainer.deselectedPokemon();
        assertEquals(fightingPhaseOnePokemon,firstTrainer.getActivePokemon());
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        firstTrainer.setSelectedPokemon(firstTrainer.getActivePokemon());
        firstTrainer.playCard();
        firstTrainer.deselectedPokemon();
        assertEquals(fightingPhaseTwoPokemon,firstTrainer.getActivePokemon());
        assertNotEquals(fightingPhaseOnePokemon,firstTrainer.getActivePokemon());
        assertNotEquals(fightingPhaseOnePokemon,fpop);

        secondTrainer.addToHand(3);
        secondTrainer.setSelectedCard(secondTrainer.getHand().get(0));
        secondTrainer.playCard();
        assertEquals(waterPokemon,secondTrainer.getActivePokemon());
        secondTrainer.setSelectedCard(secondTrainer.getHand().get(0));
        secondTrainer.setSelectedPokemon(secondTrainer.getActivePokemon());
        secondTrainer.playCard();
        secondTrainer.deselectedPokemon();
        assertEquals(waterPhaseOnePokemon,secondTrainer.getActivePokemon());
        secondTrainer.setSelectedCard(secondTrainer.getHand().get(0));
        secondTrainer.setSelectedPokemon(secondTrainer.getActivePokemon());
        secondTrainer.playCard();
        secondTrainer.deselectedPokemon();
        assertEquals(waterPhaseTwoPokemon,secondTrainer.getActivePokemon());
        assertNotEquals(waterPhaseOnePokemon,secondTrainer.getActivePokemon());
        assertNotEquals(waterPhaseOnePokemon,wpop);

        thirdTrainer.addToHand(3);
        thirdTrainer.setSelectedCard(thirdTrainer.getHand().get(0));
        thirdTrainer.playCard();
        assertEquals(firePokemon,thirdTrainer.getActivePokemon());
        thirdTrainer.setSelectedCard(thirdTrainer.getHand().get(0));
        thirdTrainer.setSelectedPokemon(thirdTrainer.getActivePokemon());
        thirdTrainer.playCard();
        thirdTrainer.deselectedPokemon();
        assertEquals(firePhaseOnePokemon,thirdTrainer.getActivePokemon());
        thirdTrainer.setSelectedCard(thirdTrainer.getHand().get(0));
        thirdTrainer.setSelectedPokemon(thirdTrainer.getActivePokemon());
        thirdTrainer.playCard();
        thirdTrainer.deselectedPokemon();
        assertEquals(firePhaseTwoPokemon,thirdTrainer.getActivePokemon());
        assertNotEquals(firePhaseOnePokemon,thirdTrainer.getActivePokemon());
        assertNotEquals(firePhaseOnePokemon,firepop);

        fourthTrainer.addToHand(3);
        fourthTrainer.setSelectedCard(fourthTrainer.getHand().get(0));
        fourthTrainer.playCard();
        assertEquals(grassPokemon,fourthTrainer.getActivePokemon());
        fourthTrainer.setSelectedCard(fourthTrainer.getHand().get(0));
        fourthTrainer.setSelectedPokemon(fourthTrainer.getActivePokemon());
        fourthTrainer.playCard();
        fourthTrainer.deselectedPokemon();
        assertEquals(grassPhaseOnePokemon,fourthTrainer.getActivePokemon());
        fourthTrainer.setSelectedCard(fourthTrainer.getHand().get(0));
        fourthTrainer.setSelectedPokemon(fourthTrainer.getActivePokemon());
        fourthTrainer.playCard();
        fourthTrainer.deselectedPokemon();
        assertEquals(grassPhaseTwoPokemon,fourthTrainer.getActivePokemon());
        assertNotEquals(grassPhaseOnePokemon,fourthTrainer.getActivePokemon());
        assertNotEquals(grassPhaseOnePokemon,gpop);

        fifthTrainer.addToHand(3);
        fifthTrainer.setSelectedCard(fifthTrainer.getHand().get(0));
        fifthTrainer.playCard();
        assertEquals(lightingPokemon,fifthTrainer.getActivePokemon());
        fifthTrainer.setSelectedCard(fifthTrainer.getHand().get(0));
        fifthTrainer.setSelectedPokemon(fifthTrainer.getActivePokemon());
        fifthTrainer.playCard();
        fifthTrainer.deselectedPokemon();
        assertEquals(lightingPhaseOnePokemon,fifthTrainer.getActivePokemon());
        fifthTrainer.setSelectedCard(fifthTrainer.getHand().get(0));
        fifthTrainer.setSelectedPokemon(fifthTrainer.getActivePokemon());
        fifthTrainer.playCard();
        fifthTrainer.deselectedPokemon();
        assertEquals(lightingPhaseTwoPokemon,fifthTrainer.getActivePokemon());
        assertNotEquals(lightingPhaseOnePokemon,fifthTrainer.getActivePokemon());
        assertNotEquals(lightingPhaseOnePokemon,lpop);

        sixthTrainer.addToHand(3);
        sixthTrainer.setSelectedCard(sixthTrainer.getHand().get(0));
        sixthTrainer.playCard();
        assertEquals(psychicPokemon,sixthTrainer.getActivePokemon());
        sixthTrainer.setSelectedCard(sixthTrainer.getHand().get(0));
        sixthTrainer.setSelectedPokemon(sixthTrainer.getActivePokemon());
        sixthTrainer.playCard();
        sixthTrainer.deselectedPokemon();
        assertEquals(psychicPhaseOnePokemon,sixthTrainer.getActivePokemon());
        sixthTrainer.setSelectedCard(sixthTrainer.getHand().get(0));
        sixthTrainer.setSelectedPokemon(sixthTrainer.getActivePokemon());
        sixthTrainer.playCard();
        sixthTrainer.deselectedPokemon();
        assertEquals(psychicPhaseTwoPokemon,sixthTrainer.getActivePokemon());
        assertNotEquals(psychicPhaseOnePokemon,sixthTrainer.getActivePokemon());
        assertNotEquals(psychicPhaseOnePokemon,ppop);
    }
}
