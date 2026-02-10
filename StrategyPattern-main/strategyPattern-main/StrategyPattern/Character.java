package StrategyPattern;

public class Character{

    private Strategy type;

    public Character(Strategy type)
    {
        this.type = type;
    }

    public void attack()
    {
        type.performAttack();
    }

    public void defense()
    {
        type.performDefense();
    }
}
