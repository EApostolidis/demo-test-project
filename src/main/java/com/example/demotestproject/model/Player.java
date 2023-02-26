package com.example.demotestproject.model;

import java.util.List;
import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Player is the class that describes the player of the game and holds
 * the choices and the method to return the random choice.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

  private List<Choice> choices;

  /**
   * This method returns a random choice between the given choices of the player.
   * @param rand is of type {@link Random} and is used to make the random calculations
   * @return the choice of the player which was selected randomly from the given choices
   * of the player.
   */
  public Choice returnRandomChoice(Random rand) {
    int randomNum = rand.nextInt(((this.choices.size() -1) - 0) + 1) + 0;
    return this.choices.get(randomNum);
  }

}
