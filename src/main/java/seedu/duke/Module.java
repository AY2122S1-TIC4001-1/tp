package seedu.duke;

// Create Test Pull Request
public class Module {

  String moduleCode;
  String title;
  Integer[] semesters;

  public Module() {}

  public Module(String moduleCode, String title, Integer[] semesters) {
    this.moduleCode = moduleCode;
    this.title = title;
    this.semesters = semesters;
  }
}
