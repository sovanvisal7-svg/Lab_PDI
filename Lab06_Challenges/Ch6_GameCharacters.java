package Lab06_Challenges;
class Weapon {
    private String name;
    private int damage;

    Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    String getName() {
        return name;
    }

    int getDamage() {
        return damage;
    }
}

class Spell {
    private String name;
    private int manaCost;

    Spell(String name, int manaCost) {
        this.name = name;
        this.manaCost = manaCost;
    }

    String getName() {
        return name;
    }

    int getManaCost() {
        return manaCost;
    }
}


class Character {
    protected String name;
    protected int health;

    Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    void move() {
        System.out.println(name + " moves forward.");
    }

    void showStatus() {
        System.out.println(name + " HP: " + health);
    }
}

class Wizard extends Character {
    private Spell spell;       

    Wizard(String name, int health, Spell spell) {
        super(name, health);
        this.spell = spell;
    }

    void castSpell() {
        System.out.println(name + " casts " + spell.getName() + " (mana cost " + spell.getManaCost() + ").");
    }
}

class Warrior extends Character {
    private Weapon weapon;     

    Warrior(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    void attack() {
        System.out.println(name + " attacks with " + weapon.getName() + " for " + weapon.getDamage() + " damage.");
    }
}

public class Ch6_GameCharacters {
    public static void main(String[] args) {
        Wizard wizard = new Wizard("Merlin", 80, new Spell("Fireball", 30));
        Warrior warrior = new Warrior("Conan", 150, new Weapon("Battle Axe", 45));

        wizard.move();        
        wizard.showStatus();
        wizard.castSpell();   

        warrior.move();       
        warrior.showStatus();
        warrior.attack();     
    }
}
