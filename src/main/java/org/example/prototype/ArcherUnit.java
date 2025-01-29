package org.example.prototype;

public class ArcherUnit implements Unit, Prototype<ArcherUnit> {
    private final int cost;
    private final int moveSpeed;
    private final int healthPoints;
    private final String characterName;

    private final int countOfArrows;

    public ArcherUnit(int cost, int moveSpeed, int healthPoints, String characterName, int countOfArrows) {
        this.cost = cost;
        this.moveSpeed = moveSpeed;
        this.healthPoints = healthPoints;
        this.characterName = characterName;
        this.countOfArrows = countOfArrows;
    }

    @Override
    public ArcherUnit clone() {
        return new ArcherUnit(
                this.cost,
                this.moveSpeed,
                this.healthPoints,
                this.characterName,
                this.countOfArrows
        );
    }

    @Override
    public String toString() {
        return "ArcherUnit{" +
                "cost=" + cost +
                ", moveSpeed=" + moveSpeed +
                ", healthPoints=" + healthPoints +
                ", characterName='" + characterName + '\'' +
                ", countOfArrows=" + countOfArrows +
                '}';
    }
}
