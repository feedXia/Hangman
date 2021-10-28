package game;

import java.util.Random;

class WordChooser {

  final String[] DICTIONARY = { "MAKERS", "CANDIES", "DEVELOPER", "LONDON" };

  public String getRandomWordFromDictionary() {
    int rand = new Random().nextInt(DICTIONARY.length);
    return DICTIONARY[rand];
  }

}