package com.example.demotestproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Result is the class that holds the final results of the game,
 * and it is mostly used to hold the results and help create the final
 * message. The properties have default values.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
  private int playerOneWins = 0;
  private int playerTwoWins = 0;
  private int ties = 0;
  private int iterations = 0;
}
