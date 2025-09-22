package com.example.solid_demo.solid.lsp.better;

/**
 * @author udayhegde
 */
public class Square extends Shape {
    private final int side;
    
    public Square(int side) {
        this.side = side;
    }
    
    public int getSide() {
        return side;
    }
    
    @Override
    public int getArea() {
        return side * side;
    }
    
    @Override
    public String getShapeType() {
        return "Square";
    }
}