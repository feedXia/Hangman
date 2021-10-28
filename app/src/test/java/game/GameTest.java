package game;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class GameTest {
  @Test
  public void testGetsWordToGuess() {
    WordChooser mockedWordChooser = mock(WordChooser.class);
    when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedWordChooser);
    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test
  public void testGetRemainingAttempts() {
    Game game = new Game(new WordChooser());
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }
}
