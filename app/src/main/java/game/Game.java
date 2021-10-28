package game;

public class Game {

  private static String word;
  int attempts = 10;

  public Game(WordChooser wordchooser) {
    word = wordchooser.getRandomWordFromDictionary();
  }

  public static void main(String[] args) {
    Game guessingGame = new Game(new WordChooser());
    System.out.println(guessingGame.getWordToGuess());
    System.out.printf("%d attempts remaining...\n", guessingGame.getRemainingAttempts());
    System.out.printf("The random word is: %s \n", word);
  }

  public String getWordToGuess() {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < word.length(); i++) {
      Character currentLetter = word.charAt(0);
      if (i == 0) {
        builder.append(currentLetter);
      } else {
        builder.append("_");
      }
    }
    return builder.toString();
  }

  public Integer getRemainingAttempts() {
    return this.attempts;
  }
}