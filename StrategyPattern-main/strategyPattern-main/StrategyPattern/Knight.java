package StrategyPattern;

public class Knight implements Strategy{

    @Override
    public void performAttack()
    {
       SwingSword swingSword = new SwingSword();
       swingSword.attack();
    }

    @Override
    public void performDefense()
    {
        CreateMagic createMagic = new CreateMagic();
        System.out.print("Knight ");
        createMagic.defense();

        Dodge dodge = new Dodge();
        System.out.print("Knight ");
        dodge.defense();

        Shield shield = new Shield();
        System.out.print("Knight ");
        shield.defense();

        System.out.println("");
    }
}
