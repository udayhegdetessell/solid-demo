package com.example.solid_demo.solid.lsp.better.service.impl;

import com.example.solid_demo.solid.lsp.better.Shape;
import com.example.solid_demo.solid.lsp.better.service.ShapeCalculatorService;
import java.util.List;
import org.springframework.stereotype.Service;


/**
 * @author udayhegde
 */
// Service that works correctly with LSP
@Service
public class ShapeCalculatorServiceImpl implements ShapeCalculatorService {

    @Override
    public int calculateArea(Shape shape) {
        return shape.getArea(); // Works correctly for all Shape subtypes
    }

    @Override
    public void processShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.getShapeType() + " area: " + shape.getArea());
            // This works correctly for all Shape implementations
        }
    }
}