package com.example.solid_demo.solid.lsp.bad.service;

import com.example.solid_demo.solid.lsp.bad.Rectangle;
import com.example.solid_demo.solid.lsp.bad.Square;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author udayhegde
 */
// Client code that breaks with Square
@Service
@Slf4j
public class AreaCalculatorService {

  public void demonstrateProblem() {
    Rectangle rectangle = new Rectangle();
    rectangle.setWidth(5);
    rectangle.setHeight(10);
    log.info("Area: {}", rectangle.getArea()); // 50

    // This breaks LSP
    Rectangle square = new Square();
    square.setWidth(5);
    square.setHeight(10); // This changes width too!
    log.info("Area: {}", square.getArea()); // 100, not expected!
  }
}