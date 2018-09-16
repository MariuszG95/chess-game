import org.junit.Test;
import sda.games.chess.Move;
import sda.games.chess.Pawn;
import sda.games.chess.Player;

import static org.assertj.core.api.Assertions.assertThat;

public class PawnTest {

  @Test
    public void ShouldReturnFalse(){
      Pawn pawn = new Pawn();
      Move move = new Move(0,0,0,1);
      assertThat(pawn.isMoveValid(move)).isFalse();
      System.out.println(move);
  }

}
