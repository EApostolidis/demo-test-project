package com.example.demotestproject.utils;

import java.text.MessageFormat;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang3.tuple.Pair;

import com.example.demotestproject.model.Choice;
import com.example.demotestproject.model.Player;
import com.example.demotestproject.model.Result;

import lombok.experimental.UtilityClass;
import static com.example.demotestproject.model.Choice.PAPER;
import static com.example.demotestproject.model.Choice.ROCK;
import static com.example.demotestproject.model.Choice.SCISSOR;

/**
 * Rules class is a utility class which holds the rules of the games
 * and has the main methods which calculate the final result and produce
 * the final message.
 */
@UtilityClass
public class Rules {

  /**
   * Rules is a map of pairs and integers which basically holds all the
   * possible pairings and their results which are described with the
   * integers , (1 is for player one win, 2 for player two 2 win and 0 for tie).
   */
  private static final Map<Pair<Choice, Choice>, Integer> RULES = Map.of(
      Pair.of(PAPER, ROCK), 1,
      Pair.of(PAPER, SCISSOR), 2,
      Pair.of(PAPER, PAPER), 0,
      Pair.of(ROCK, PAPER), 2,
      Pair.of(ROCK, SCISSOR), 1,
      Pair.of(ROCK, ROCK), 0,
      Pair.of(SCISSOR, ROCK), 2,
      Pair.of(SCISSOR, PAPER), 1,
      Pair.of(SCISSOR, SCISSOR), 0
  );

  /**
   * This is the method that runs the iterations of the game and calculates the final results
   * @param player1 is of type {@link Player} and describes the first player and its choice
   * @param player2 is of type {@link Player} and describes the second player and its choice
   * @param iterations is the number of iterations that we run the matches and collect the results
   * @return is of type {@link Result} holds the final results
   */
  public static Result calculateResult(Player player1, Player player2, int iterations) {
    Random random = new Random();
    Result finalResult = new Result();
    finalResult.setIterations(iterations);
    for (int i = 0; i < finalResult.getIterations(); i++) {
      int result = Rules.RULES.get(Pair.of(player1.returnRandomChoice(random), player2.returnRandomChoice(random)));
      switch (result) {
        case 1:
          finalResult.setPlayerOneWins(finalResult.getPlayerOneWins() + 1);
          break;
        case 2:
          finalResult.setPlayerTwoWins(finalResult.getPlayerTwoWins() + 1);
          break;
        default:
          finalResult.setTies(finalResult.getTies() + 1);
      }
    }
    return finalResult;
  }

  /**
   * This is the method that constructs the final message that is displayed to the user
   * given as input the final result object.
   * @param result is of type {@link Result}
   * @return a String that holds the final message with the correct format and results
   */
  public static String constructResultMessage(Result result) {
    return MessageFormat.format("Player A wins {0} of {1} games\n\nPlayer B wins {2} of {1} games\n\nTie: {3} of {1} games",
        result.getPlayerOneWins(), result.getIterations() , result.getPlayerTwoWins(), result.getTies());
  }
}
