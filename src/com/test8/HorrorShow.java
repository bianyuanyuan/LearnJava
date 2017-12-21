package com.test8;

//Extending an interface with inheritance
interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {

    @Override
    public void menace() {
        System.out.println("DragonZilla menace");
    }

    @Override
    public void destroy() {
        System.out.println("DragonZilla destroy");
    }
}


interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {

    @Override
    public void menace() {
        System.out.println("VeryBadVampire menace");
    }

    @Override
    public void destroy() {
        System.out.println("VeryBadVampire destroy");
    }

    @Override
    public void kill() {
        System.out.println("kill");
    }

    @Override
    public void drinkBlood() {
    }
}

public class HorrorShow {
    static void u(Monster monster) {
        monster.menace();
    }

    static void v(DangerousMonster dangerousMonster) {
        dangerousMonster.destroy();
        dangerousMonster.menace();
    }

    static void w(Lethal lethal) {
        lethal.kill();
    }

    public static void main(String[] args) {
        DangerousMonster danger= new DragonZilla();
        u(danger);
        v(danger);
        Vampire vam=new VeryBadVampire();
        u(vam);
        v(vam);
        w(vam);
    }
}

