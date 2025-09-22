package com.example.solid_demo.solid.lsp.bad;

/**
 * @author udayhegde
 */
public class Square extends Rectangle {
    
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Violates LSP!
    }
    
    @Override
    public void setHeight(int height) {
        this.width = height; // Violates LSP!
        this.height = height;
    }
}