public class StudentController {
    private Student model;
    private StudentView view;

    // Constructor
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Methods to update the model
    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNumber(int rollNumber) {
        model.setRollNumber(rollNumber);
    }

    public int getStudentRollNumber() {
        return model.getRollNumber();
    }

    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    public String getStudentGrade() {
        return model.getGrade();
    }

    // Method to update the view
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNumber(), model.getGrade());
    }
}

