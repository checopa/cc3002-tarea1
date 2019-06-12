package cc3002.tarea1.cards;

import cc3002.tarea1.trainer.Trainer;
import cc3002.tarea1.visitor.Visitor;

public interface ICard {
    /**
     * Getter for card's name
     * @return card's name
     */
    String getName();

    /**
     * Trainer play a card
     * @param trainer Trainer that play a card
     */
    void playACard(Trainer trainer);

    /**
     * Set a card's trainer
     * @param trainer trainer that play the card
     */
    void setTrainer(Trainer trainer);

    /**
     * Get a car's trainer
     */
    Trainer getTrainer();


}
