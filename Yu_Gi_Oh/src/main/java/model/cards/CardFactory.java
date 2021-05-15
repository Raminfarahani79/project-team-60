package model.cards;

import model.cards.monstercards.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class CardFactory {
    private static ArrayList<Card> allCards;

    public  static void  readCVSOfCards() throws FileNotFoundException {
        allCards = new ArrayList<>();
        String[] cardDate;
        File file = new File("Yu_Gi_Oh/src/main/java/model/cards/Monster.csv");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            cardDate = scanner.nextLine().split("(?=\\S),(?=\\S)");
            switch (cardDate[0]) {
                case "Battle OX":
                    allCards.add(new BattleOX(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Axe Raider":
                    allCards.add(new AxeRaide(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Yomi Ship":
                    allCards.add(new YomiShip(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Horn Imp":
                    allCards.add(new HornImp(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Silver Fang":
                    allCards.add(new SilverFang(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Suijin":
                    allCards.add(new Suijin(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Fireyarou":
                    allCards.add(new FireYarou(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Curtain of the dark ones":
                    allCards.add(new CurtainOfTheDarkOnes(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Feral Imp":
                    allCards.add(new FeralImp(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Dark magician":
                    allCards.add(new DarkMagician(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Wattkid":
                    allCards.add(new Wattkid(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Baby dragon":
                    allCards.add(new BabyDragon(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Hero of the east":
                    allCards.add(new HeroOfTheEast(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Battle warrior":
                    allCards.add(new BattleWarrior(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Crawling dragon":
                    allCards.add(new CrawlingDragon(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Flame manipulator":
                    allCards.add(new FlameManipulator(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Blue-Eyes white dragon":
                    allCards.add(new BlueEyes(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Crab Turtle":
                    allCards.add(new CrabTurtle(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Skull Guardian":
                    allCards.add(new SkullGuardian(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Slot Machine":
                    allCards.add(new SlotMachine(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Haniwa":
                    allCards.add(new Haniwa(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Man-Eater Bug":
                    allCards.add(new ManEaterBug(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Gate Guardiane":
                    allCards.add(new GateGuardian(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Scanner":
                    allCards.add(new model.cards.monstercards.Scanner(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Bitron":
                    allCards.add(new Bitron(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Marshmallon":
                    allCards.add(new Marshmallon(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Beast King Barbaros":
                    allCards.add(new BeastKingBarbaros(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Texchanger":
                    allCards.add(new Texchanger(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Leotron":
                    allCards.add(new Leotron(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "The Calculator":
                    allCards.add(new TheCalculator(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Alexandrite Dragon":
                    allCards.add(new AlexandriteDragon(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Mirage Dragon":
                    allCards.add(new MirageDragon(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Herald of Creation":
                    allCards.add(new HeroOfTheEast(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Exploder Dragon":
                    allCards.add(new ExploderDragon(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Warrior Dai Grepher":
                    allCards.add(new WarriorDaiGrepher(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Dark Blade":
                    allCards.add(new DarkBlade(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Wattaildragon":
                    allCards.add(new WattailDragon(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Terratiger, the Empowered Warrior":
                    allCards.add(new Terratiger(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "The Tricky":
                    allCards.add(new TheTricky(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Command Knight":
                    allCards.add(new CommandKnight(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
                case "Spiral Serpent":
                    allCards.add(new SpiralSerpent(cardDate[0], cardDate[1], Integer.parseInt(cardDate[2]),
                            Integer.parseInt(cardDate[3]), Integer.parseInt(cardDate[4]), Integer.parseInt(cardDate[5])));
            }
        }

    }

    public static  Card getCardByCardName(String cardName) {
        for (Card card : allCards) {
            if (card.name.equalsIgnoreCase(cardName)) return card;
            //todo better to add clone method to cards
        }
        return null;
    }
}
