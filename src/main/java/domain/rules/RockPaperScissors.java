package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {
    @Override
    public Result decide(Move mine, Move theirs) {
        return switch (mine + "-" + theirs) {
            case "ROCK-ROCK" -> Result.DRAW;
            case "ROCK-PAPER" -> Result.LOSE;
            case "ROCK-SCISSORS" -> Result.WIN;
            case "PAPER-ROCK" -> Result.WIN;
            case "PAPER-PAPER" -> Result.DRAW;
            case "PAPER-SCISSORS" -> Result.LOSE;
            case "SCISSORS-ROCK" -> Result.LOSE;
            case "SCISSORS-PAPER" -> Result.WIN;
            case "SCISSORS-SCISSORS" -> Result.DRAW;
            default -> throw new IllegalStateException("Unexpected value: " + mine + "-" + theirs);
        };
    }
}
