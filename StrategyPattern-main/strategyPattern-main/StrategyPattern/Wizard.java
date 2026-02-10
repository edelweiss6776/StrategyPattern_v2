package StrategyPattern;

public class Wizard implements Strategy{

    @Override
    public void performAttack()
    {
        CastSpell castSpell = new CastSpell();
        castSpell.attack();
    }

    @Override
    public void performDefense()
    {
        CreateMagic createMagic = new CreateMagic();
        System.out.print("Wizard ");
        createMagic.defense();

        System.out.println("");
    }
}
