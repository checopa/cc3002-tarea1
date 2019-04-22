package cc3002.tarea1.cartas.pokemon;


import cc3002.tarea1.cartas.pokemon.electric.ElectricAttack;
import cc3002.tarea1.cartas.pokemon.fighting.FightingAttack;
import cc3002.tarea1.cartas.pokemon.fire.FireAttack;
import cc3002.tarea1.cartas.pokemon.grass.GrassAttack;
import cc3002.tarea1.cartas.pokemon.psychic.PsychicAttack;
import cc3002.tarea1.cartas.pokemon.water.WaterAttack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class AbstractPokemon implements IPokemon{
    private String name;
    private int hp;
    private List<IAttack> attackList;
    private IAttack selectedAttack;
    private Map<String,Integer> countEnergies=new HashMap<>();


    /**
     * Creates a new pokemon
     * @param name Pokemon's name
     * @param hp Pokemon's hit point
     * @param attackList Pokemon's attacks
     */
    protected AbstractPokemon(String name,int hp, List<IAttack> attackList){
        this.name=name;
        this.hp=hp;
        this.attackList=attackList;
        countEnergies.put("Water",0);
        countEnergies.put("Grass",0);
        countEnergies.put("Fire",0);
        countEnergies.put("Fight",0);
        countEnergies.put("Psychic",0);
        countEnergies.put("Electric",0);
    }

    @Override
    public String getName() {
        System.out.println(this.countEnergies.get("Electric"));
        System.out.println(this.countEnergies.get("Fire"));
        return this.name;
    }

    @Override
    public int getHP() {
        return this.hp;
    }

    @Override
    public List<IAttack> getAttacks() {
        return this.attackList;
    }

    @Override
    public IAttack getSelectedAttack() {
        return this.selectedAttack;
    }

    @Override
    public void selectAttack(int index) {
        selectedAttack=attackList.get(index);

    }

    @Override
    public void attack(IPokemon pokemon) {
        selectedAttack.attack(pokemon);

    }

    @Override
    public void receiveWaterAttack(WaterAttack attack) {
        this.receiveAttack(attack);
    }

    @Override
    public void receiveGrassAttack(GrassAttack attack) {
        this.receiveAttack(attack);

    }

    @Override
    public void receiveFireAttack(FireAttack attack) {
        this.receiveAttack(attack);
    }

    @Override
    public void receiveElectricAttack(ElectricAttack attack) {
        this.receiveAttack(attack);
    }

    @Override
    public void receiveFightingAttack(FightingAttack attack) {
        this.receiveAttack(attack);
    }

    @Override
    public void receivePsychicAttack(PsychicAttack attack) {
        this.receiveAttack(attack);
    }

    /**
     * Receive an attack
     * @param attack Received attack
     */
    protected void receiveAttack(IAttack attack){
        this.hp-=attack.getBaseDamage();
    }

    /**
     *Receives an attack to which this Pokémon is weak.
     * @param attack Received attack.
     */
    protected void receiveWeaknessAttack(IAttack attack){
        this.hp-=attack.getBaseDamage()*2;
    }

    /**
     * Receives an attack to which this Pokémon is resistant.
     * @param attack Received attack
     */
    protected void receiveResistanAttack(IAttack attack){
        this.hp-=attack.getBaseDamage()-30;
    }

    @Override
    public void receiveElectricEnergy() {
        countEnergies.put("Electric",countEnergies.get("Electric")+1);
    }

    @Override
    public void receiveFightingEnergy() {
        countEnergies.put("Fight",countEnergies.get("Fight")+1);
    }

    @Override
    public void receiveFireEnergy() {
        countEnergies.put("Fire",countEnergies.get("Fire")+1);
    }

    @Override
    public void receiveGrassEnergy() {
        countEnergies.put("Grass",countEnergies.get("Grass")+1);
    }

    @Override
    public void receivePsychicEnergy() {
        countEnergies.put("Psychic",countEnergies.get("Psychic")+1);
    }

    @Override
    public void receiveWaterEnergy() {
        countEnergies.put("Water",countEnergies.get("Water")+1);
    }

}
