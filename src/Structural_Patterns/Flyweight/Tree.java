package Structural_Patterns.Flyweight;

import java.awt.*;

public class Tree {
    // Объект, содержащий уникальное состояние дерева

    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}