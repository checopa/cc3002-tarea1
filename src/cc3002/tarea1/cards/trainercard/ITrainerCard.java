package cc3002.tarea1.cards.trainercard;

import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.effects.IEffect;

public interface ITrainerCard extends ICard {

    /**
     * Getter for the card's description
     * @return Card's description
     */
    String getDescription();

    /**
     * Getter for the card's effect
     * @return Card's effect
     */
    IEffect getEffect();

}
