import java.util.Random;
import java.lang.Math;

class DnDCharacter {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    public DnDCharacter(){
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();
        hitpoints = 10 + modifier(constitution);
    }

    int ability() {
      Random rand = new Random();
      int stat = 0;
      int[] diceRolls = new int[4];
      
      // Roll four dice and store their values
      for (int diceCount = 0; diceCount < diceRolls.length; diceCount++)
        diceRolls[diceCount] = rand.nextInt(5) + 1;
      
      
      int lowestRoll = diceRolls[0];
      int lowestIndex = -1;
      // Find the index of the lowest dice roll
      for (int diceCount = 0; diceCount < diceRolls.length; diceCount++) {
        if (lowestRoll <= diceRolls[diceCount]) {
          lowestRoll = diceRolls[diceCount];
          lowestIndex = diceCount;
        }
      }

      // Adds all the dice rolls together except the lowest
      for (int diceCount = 0; diceCount < diceRolls.length; diceCount++) {
        if (diceCount == lowestIndex)
          continue;
        else {
          stat += diceRolls[diceCount];
        }
      }

      return stat;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
      return strength;
    }

    int getDexterity() {
      return dexterity;
    }

    int getConstitution() {
      return constitution;
    }

    int getIntelligence() {
      return intelligence;
    }

    int getWisdom() {
      return wisdom;
    }

    int getCharisma() {
      return charisma;
    }

    int getHitpoints() {
      return hitpoints;
    }

}
