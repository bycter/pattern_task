package org.example.prototype;

public class WarriorUnit implements Unit, Prototype<WarriorUnit> {

    private final int cost;
    private final int moveSpeed;
    private final int healthPoints;
    private final String characterName;

    public WarriorUnit(int cost, int moveSpeed, int healthPoints, String characterName) {
        this.cost = cost;
        this.moveSpeed = moveSpeed;
        this.healthPoints = healthPoints;
        this.characterName = characterName;
    }

    @Override
    public WarriorUnit clone() {
        return new WarriorUnit(
                this.cost,
                this.moveSpeed,
                this.healthPoints,
                this.characterName
        );
    }

    @Override
    public String toString() {
        return "WarriorUnit{" +
                "cost=" + cost +
                ", moveSpeed=" + moveSpeed +
                ", healthPoints=" + healthPoints +
                ", characterName='" + characterName + '\'' +
                '}';
    }
}
