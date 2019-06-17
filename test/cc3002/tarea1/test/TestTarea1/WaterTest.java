package cc3002.tarea1.test.TestTarea1;

import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.fighting.BasicFightingPokemon;
import cc3002.tarea1.cards.pokemon.fire.BasicFirePokemon;
import cc3002.tarea1.cards.pokemon.grass.BasicGrassPokemon;
import cc3002.tarea1.cards.pokemon.lighting.BasicLightingPokemon;
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

public class WaterTest {
    Attack firstAttack, secondAttack, thirdAttack, fourthAttack;
    IPokemon firePokemon, waterPokemon, grassPokemon, fightingPokemon, lightingPokemon;
    Trainer firstTrainer, secondTrainer;
    HashMap<String, Integer> firstCost;
    IEffect nulleffect;

    @Before
    public void setUp() {
        nulleffect=new NullEffect();
        firstAttack = new Attack("First", 40, "First Attack", firstCost = new HashMap<String, Integer>() {{
            put("Water", 0);
            put("Fire", 0);
            put("Fighting", 0);
            put("Grass", 0);
            put("Psychic", 0);
            put("Lighting", 0);
        }},nulleffect);
        secondAttack = new Attack("Second", 40, "Second Attack", firstCost = new HashMap<String, Integer>() {{
            put("Water", 0);
            put("Fire", 0);
            put("Fighting", 0);
            put("Grass", 0);
            put("Psychic", 0);
            put("Lighting", 0);
        }},nulleffect);
        fightingPokemon = new BasicFightingPokemon("Psychic", 002, 100, new ArrayList<>(Arrays.asList(firstAttack, secondAttack)));
        grassPokemon = new BasicGrassPokemon("Grass", 003, 100, new ArrayList<>(Arrays.asList(firstAttack, secondAttack)));
        waterPokemon = new BasicWaterPokemon("Water", 004, 100, new ArrayList<>(Arrays.asList(firstAttack, secondAttack)));
        lightingPokemon = new BasicLightingPokemon("Water", 005, 100, new ArrayList<>(Arrays.asList(firstAttack, secondAttack)));
        firePokemon = new BasicFirePokemon("Fire", 001, 100, new ArrayList<>(Arrays.asList(firstAttack, secondAttack)));
        firstTrainer = new Trainer("Ash", new ArrayList<>(Arrays.asList(waterPokemon, firePokemon)));
        secondTrainer = new Trainer("Ashn't", new ArrayList<>(Arrays.asList(lightingPokemon, fightingPokemon, grassPokemon)));

    }

    @Test
    public void FireTest() {
        firstTrainer.addToHand(2);
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        firstTrainer.playCard();
        firstTrainer.setSelectedCard(firstTrainer.getHand().get(0));
        firstTrainer.playCard();
        secondTrainer.addToHand(3);
        for(int i=0;i<3;i++) {
            secondTrainer.setSelectedCard(secondTrainer.getHand().get(0));
            secondTrainer.playCard();
        }
        firstTrainer.selectAbilityPokemon(0);
        secondTrainer.selectAbilityPokemon(0);
        firstTrainer.attackTrainer(secondTrainer);
        assertEquals(60, secondTrainer.getActivePokemon().getHP());
        secondTrainer.attackTrainer(firstTrainer);
        assertEquals(20, firstTrainer.getActivePokemon().getHP());

    }
}