package com.example.demotestproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
  private int playerOneWins = 0;
  private int playerTwoWins = 0;
  private int ties = 0;
  private int iterations = 0;
}
