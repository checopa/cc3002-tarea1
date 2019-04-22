package cc3002.tarea1.cartas.pokemon;

public abstract class AbstractAttack implements IAttack {
    private int baseDamage;
    private String name;
    private String description;

    protected AbstractAttack(String name,int baseDamage,String description){
        this.name=name;
        this.baseDamage=baseDamage;
        this.description=description;
    }


    @Override
    public abstract void attack(IPokemon pokemon);

    @Override
    public int getBaseDamage() {
        return this.baseDamage;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String getDescription(){
        return this.description;
    }
    /**
     * Checks if this attack is equal to another.
     *
     * @param obj Object to compare this attack.
     * @return <code>true</code> if the objects are equal, <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof IAttack && ((IAttack) obj).getBaseDamage() == baseDamage
                && ((IAttack) obj).getName().equals(name);
    }
}
