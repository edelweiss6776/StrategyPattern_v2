package StrategyPattern;

public class GameApp {

    public static void main(String[] args)
    {
        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());
        Character archer = new Character(new Archer());


        knight.attack();
        knight.defense();

        wizard.attack();
        wizard.defense();

        archer.attack();
        archer.defense();

    }
}
