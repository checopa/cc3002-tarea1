package cc3002.tarea1.cards.pokemon;


import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.cards.pokemon.fighting.FightingPokemon;
import cc3002.tarea1.cards.pokemon.fire.FirePokemon;
import cc3002.tarea1.cards.pokemon.grass.GrassPokemon;
import cc3002.tarea1.cards.pokemon.lighting.LightingPokemon;
import cc3002.tarea1.cards.pokemon.psychic.PsychicPokemon;
import cc3002.tarea1.cards.pokemon.water.WaterPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class AbstractPokemon implements IPokemon, ICard {
    private String name;
    private int id;
    private int hp;
    private List<Attack> attackList;
    private Attack selectedAttack;
    private Map<String, Integer> countEnergies = new HashMap<>();


    /**
     * Creates a new pokemon
     * @param id pokemon's id
     * @param hp pokemon's hp
     * @param attackList pokemon's attack
     */
    protected AbstractPokemon(String name,int id, int hp, List<Attack> attackList) {
        this.name=name;
        this.id = id;
        this.hp = hp;
        this.attackList = attackList;
        countEnergies.put("Water", 0);
        countEnergies.put("Grass", 0);
        countEnergies.put("Fire", 0);
        countEnergies.put("Fighting", 0);
        countEnergies.put("Psychic", 0);
        countEnergies.put("Lighting", 0);
    }
    //region Properties
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public int getHP() {
        return this.hp;
    }

    @Override
    public boolean isAlive() {
        return this.hp>0;
    }
    //endregion

    //region Attacks
    @Override
    public List<Attack> getAttacks() {
        return this.attackList;
    }

    @Override
    public Attack getSelectedAttack() {
        return this.selectedAttack;
    }

    @Override
    public void selectAttack(int index) {
        selectedAttack = attackList.get(index);

    }

    @Override
    public abstract void attack(IPokemon pokemon);

    @Override
    public void receiveWaterAttack(WaterPokemon attack) {
        this.receiveAttack(attack);
    }

    @Override
    public void receiveGrassAttack(GrassPokemon attack) {
        this.receiveAttack(attack);

    }

    @Override
    public void receiveFireAttack(FirePokemon attack) {
        this.receiveAttack(attack);
    }

    @Override
    public void receiveLightingAttack(LightingPokemon attack) {
        this.receiveAttack(attack);
    }

    @Override
    public void receiveFightingAttack(FightingPokemon attack) {
        this.receiveAttack(attack);
    }

    @Override
    public void receivePsychicAttack(PsychicPokemon attack) {
        this.receiveAttack(attack);
    }

    /**
     * Receive an attack
     *
     * @param attack Received attack
     */
    protected void receiveAttack(IPokemon attack) {
        this.hp -= attack.getSelectedAttack().getBaseDamage();
        if(!isAlive()){
            this.hp=0;
        }
    }

    /**
     * Receives an attack to which this Pokémon is weak.
     *
     * @param attack Received attack.
     */
    protected void receiveWeaknessAttack(IPokemon attack) {
        this.hp -= attack.getSelectedAttack().getBaseDamage() * 2;
        if(!isAlive()){
            this.hp=0;
        }
    }

    /**
     * Receives an attack to which this Pokémon is resistant.
     *
     * @param attack Received attack
     */
    protected void receiveResistanAttack(IPokemon attack) {
        this.hp -= attack.getSelectedAttack().getBaseDamage() - 30;
        if(!isAlive()){
            this.hp=0;
        }
    }

    @Override
    public boolean cantAttack() {
        return getSelectedAttack().getFightingCost() <= getFightingEnergy() && getSelectedAttack().getFireCost() <= getFireEnergy()
                && getSelectedAttack().getGrassCost() <= getGrassEnergy() && getSelectedAttack().getPsychicCost() <= getPsychicEnergy()
                && getSelectedAttack().getLightingCost() <= getLightingEnergy() && getSelectedAttack().getWaterCost() <= getWaterEnergy();
    }
//endregion

    //region Energy
    @Override
    public void receiveLightingEnergy() {
        countEnergies.put("Lighting", this.getLightingEnergy() + 1);
    }

    @Override
    public void receiveFightingEnergy() {
        countEnergies.put("Fighting", this.getFightingEnergy() + 1);
    }

    @Override
    public void receiveFireEnergy() {
        countEnergies.put("Fire", this.getFireEnergy() + 1);
    }

    @Override
    public void receiveGrassEnergy() {
        countEnergies.put("Grass", this.getGrassEnergy() + 1);
    }

    @Override
    public void receivePsychicEnergy() {
        countEnergies.put("Psychic", this.getPsychicEnergy() + 1);
    }

    @Override
    public void receiveWaterEnergy() {
        countEnergies.put("Water", this.getWaterEnergy() + 1);
    }

    @Override
    public int getGrassEnergy() {
        return countEnergies.get("Grass");
    }

    @Override
    public int getFightingEnergy() {
        return countEnergies.get("Fighting");
    }

    @Override
    public int getFireEnergy() {
        return countEnergies.get("Fire");
    }

    @Override
    public int getWaterEnergy() {
        return countEnergies.get("Water");
    }

    @Override
    public int getPsychicEnergy() {
        return countEnergies.get("Psychic");
    }

    @Override
    public int getLightingEnergy() {
        return countEnergies.get("Lighting");
    }

//endregion

}
