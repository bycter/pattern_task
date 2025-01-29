package org.example.prototype;

public class Main {

    public static void main(String[] args) {

        ArcherUnit archerUnit = new ArcherUnit(
                12,
                15,
                100,
                "archer",
                20
        );
        ArcherUnit clonedArcher = archerUnit.clone();

        System.out.println("Is archerUnit the same object as clonedArcher: " + (archerUnit == clonedArcher));
        System.out.println("archerUnit = " + archerUnit);
        System.out.println("clonedArcher = " + clonedArcher);

        WarriorUnit warriorUnit = new WarriorUnit(
                15,
                10,
                500,
                "warrior"
        );
        WarriorUnit clonedWarrior = warriorUnit.clone();

        System.out.println("Is warriorUnit the same object as clonedWarrior: " + (warriorUnit == clonedWarrior));
        System.out.println("warriorUnit = " + warriorUnit);
        System.out.println("clonedWarrior = " + clonedWarrior);
    }
}
