package StrategyPattern;

public class Archer implements Strategy{
    @Override
    public void performAttack()
    {
        ShootArrow shootArrow = new ShootArrow();
        shootArrow.attack();
    }

    @Override
    public void performDefense()
    {
        Shield shield = new Shield();
        System.out.print("Archer ");
        shield.defense();

        System.out.println("");
    }
}
