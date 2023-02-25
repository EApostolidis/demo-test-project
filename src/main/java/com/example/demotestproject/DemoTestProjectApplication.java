package com.example.demotestproject;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demotestproject.model.Player;

import static com.example.demotestproject.model.Choice.PAPER;
import static com.example.demotestproject.model.Choice.ROCK;
import static com.example.demotestproject.model.Choice.SCISSOR;
import static com.example.demotestproject.utils.Rules.calculateResult;
import static com.example.demotestproject.utils.Rules.constructResultMessage;

@SpringBootApplication
public class DemoTestProjectApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoTestProjectApplication.class, args);

    Player player1 = new Player();
    player1.setChoices(List.of(PAPER));
    Player player2 = new Player();
    player2.setChoices(List.of(PAPER, ROCK, SCISSOR));

    System.out.println(constructResultMessage(calculateResult(player1, player2, 100)));
  }
}
