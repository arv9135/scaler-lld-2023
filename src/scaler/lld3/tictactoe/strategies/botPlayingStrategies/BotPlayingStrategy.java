package scaler.lld3.tictactoe.strategies.botPlayingStrategies;

import scaler.lld3.tictactoe.models.Board;
import scaler.lld3.tictactoe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
