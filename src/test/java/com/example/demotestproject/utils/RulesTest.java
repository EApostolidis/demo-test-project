package com.example.demotestproject.utils;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.demotestproject.model.Player;
import com.example.demotestproject.model.Result;

import static com.example.demotestproject.model.Choice.PAPER;
import static com.example.demotestproject.model.Choice.ROCK;
import static com.example.demotestproject.model.Choice.SCISSOR;
import static com.example.demotestproject.utils.Rules.calculateResult;
import static com.example.demotestproject.utils.Rules.constructResultMessage;

class RulesTest {

  @Test
  void calculateResultTest() {
    Player player1 = new Player();
    player1.setChoices(List.of(PAPER));
    Player player2 = new Player();
    player2.setChoices(List.of(PAPER, ROCK, SCISSOR));
    Result result = calculateResult(player1, player2, 5);
    Assertions.assertEquals(result.getIterations(), result.getPlayerOneWins() + result.getPlayerTwoWins() + result.getTies());
  }

  @Test
  void constructResultMessageTest() {
    Result result = new Result();
    String message = constructResultMessage(result);
    Assertions.assertTrue(message.contains("Player A wins "));
    Assertions.assertTrue(message.contains("Player B wins "));
    Assertions.assertTrue(message.contains("Tie: "));
  }
}