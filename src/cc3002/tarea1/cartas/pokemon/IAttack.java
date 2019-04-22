package cc3002.tarea1.cartas.pokemon;

public interface IAttack {
    /**
     * An attack damages a Pokémon based on the attack's base damage, it's type and the type of the
     * Pokémon that receives the attack.
     * @param pokemon Pokemon that receives the attack
     */
    void attack(IPokemon pokemon);

    /**
     * Getter for the base damage.
     * @return Base damage of the attack
     */
    int getBaseDamage();

    /**
     * Getter for the attack's description
     * @return Description of the attack.
     */
    String getDescription();

    /**
     * Getter for the attack's name.
     * @return Name of the attack
     */
    String getName();
}
