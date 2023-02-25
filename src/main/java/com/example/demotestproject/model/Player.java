package com.example.demotestproject.model;

import java.util.List;
import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

  private List<Choice> choices;

  public Choice returnRandomChoice(Random rand) {

    int randomNum = rand.nextInt(((this.choices.size() -1) - 0) + 1) + 0;
    return this.choices.get(randomNum);
  }

}
