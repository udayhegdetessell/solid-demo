package com.example.solid_demo.solid.lsp.better;

/**
 * @author udayhegde
 */
public class Rectangle extends Shape {
    private final int width;
    private final int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    @Override
    public int getArea() {
        return width * height;
    }
    
    @Override
    public String getShapeType() {
        return "Rectangle";
    }
}