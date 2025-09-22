package com.example.solid_demo.solid.lsp.better.service;

import com.example.solid_demo.solid.lsp.better.Shape;
import java.util.List;

/**
 * @author udayhegde
 */
public interface ShapeCalculatorService {

  int calculateArea(Shape shape);

  void processShapes(List<Shape> shapes);
}
