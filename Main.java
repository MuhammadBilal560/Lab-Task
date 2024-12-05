public class Main {
    public static void main(String[] args) {
        // Create the student model
        Student student = new Student("Muhammad Bilal", 101, "A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        System.out.println("\nUpdating student details...");
        controller.setStudentName("Hussain Mustafa");
        controller.setStudentRollNumber(102);
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}
