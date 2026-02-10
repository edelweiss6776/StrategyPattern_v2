package StrategyPattern;

public class CreateMagic implements DefenseStrategy{

    @Override
    public void defense() {
        System.out.println("creating a magic barrier for defense!");
    }
}
