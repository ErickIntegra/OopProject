package ProjectClass23;
/*
10. We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
 */
abstract class Task10 {
    abstract double getPercentage();
}

    // Subclass A for student A
    class A extends Task10 {
        private double subject1;
        private double subject2;
        private double subject3;

        public A(double subject1, double subject2, double subject3) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
        }

        @Override
        double getPercentage() {
            return (subject1 + subject2 + subject3) / 3.0;
        }
    }

    // Subclass B for student B
    class B extends Task10 {
        private double subject1;
        private double subject2;
        private double subject3;
        private double subject4;

        public B(double subject1, double subject2, double subject3, double subject4) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
            this.subject4 = subject4;
        }

        @Override
        double getPercentage() {
            return (subject1 + subject2 + subject3 + subject4) / 4.0;
        }
    }

    public class MarksTest {
        public void main(String[] args) {
            // Create student A with marks in three subjects
            A studentA = new A(85, 90, 78);

            // Create student B with marks in four subjects
            B studentB = new B(92, 88, 76, 94);

            // Calculate and display the average percentage for student A
            System.out.println("Average Percentage for Student A: " + studentA.getPercentage() + "%");

            // Calculate and display the average percentage for student B
            System.out.println("Average Percentage for Student B: " + studentB.getPercentage() + "%");
        }
    }