package com.example.solid_demo.solid.isp.bad;

/**
 * @author udayhegde
 */
// Human worker also forced to implement all methods
public class HumanWorker implements WorkerOperations {
    // Has to implement all 8 methods even if not all are relevant

  @Override
  public void work() {

  }

  @Override
  public void eat() {

  }

  @Override
  public void sleep() {

  }

  @Override
  public void program() {

  }

  @Override
  public void attendMeetings() {

  }

  @Override
  public void writeDocumentation() {

  }

  @Override
  public void testCode() {

  }

  @Override
    public void deployApplication() {
        throw new UnsupportedOperationException("Junior developer can't deploy!");
    }
}