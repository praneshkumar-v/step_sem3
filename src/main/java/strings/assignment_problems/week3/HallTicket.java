
package strings.assignment_problems.week3;

public class HallTicket {
    private final String studentName;
    private final String registerNumber;
    private final String examName;

    public HallTicket(String studentName, String registerNumber,
                      String examName) {
        this.studentName = studentName;
        this.registerNumber = registerNumber;
        this.examName = examName;
    }

    public void printHallTicket() {
        System.out.println("HALL TICKET");
        System.out.println("Student Name: " + studentName);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Exam: " + examName);
    }

    public static void main(String[] args) {
        HallTicket ticket = new HallTicket(
            "Arun", "12345", "Semester Examination"
        );

        ticket.printHallTicket();
    }
}
