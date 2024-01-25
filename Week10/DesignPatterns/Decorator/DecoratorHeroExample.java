package Week10.DesignPatterns.Decorator;

public class DecoratorHeroExample {
    public static void main(String[] args) {
        Hero basicHero = new BasicHero();

        Hero heroWithSword = new Sword(basicHero);
        Hero heroWithBow = new Bow(heroWithSword);
        Hero powerfulHero = new MagicStaff(heroWithBow);

        powerfulHero.attack();
    }
}

interface Hero {
    void attack();
}

class BasicHero implements Hero {
    @Override
    public void attack() {
        System.out.println("Basic attack with bare hands.");
    }
}

abstract class WeaponDecorator implements Hero {
    protected Hero hero;

    public WeaponDecorator(Hero hero) {
        this.hero = hero;
    }
    @Override
    public void attack() {
        hero.attack();
    }
}

class Sword extends WeaponDecorator {
    
    public Sword(Hero hero) {
        super(hero);
    }

    @Override
    public void attack() {
        hero.attack();
        System.out.println("Hero attacks with Sword");
    }
    
}

class Bow extends WeaponDecorator {
    
    public Bow(Hero hero) {
        super(hero);
    }
    
    @Override
    public void attack() {
        hero.attack();
        System.out.println("Hero attacks with Bow");
    }
    
}

class MagicStaff extends WeaponDecorator {

    public MagicStaff(Hero hero) {
        super(hero);
    }

    @Override
    public void attack() {
        hero.attack();
        System.out.println("Hero attacks with Magic Staff");
    }
}