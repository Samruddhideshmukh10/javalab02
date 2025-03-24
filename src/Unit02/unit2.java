public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Program Started");
        Learner learner1 = new Learner();
        learner1.id = 257;
        learner1.gender = 'F';
        learner1.fullName = "Samruddhi";
        learner1.bodyWeight = 30f;
        learner1.contact = "123456789";
        learner1.birthDate = "06-10-2005";
        System.out.println("Student Name: " + learner1.fullName);
        learner1.enroll();
        learner1.courseEnroll();

        Learner learner2 = new Learner("purva", 'f', "3-06-2005", "8793000270", 247, 88F);
        learner2.enroll(learner2.fullName);
        learner2.courseEnroll(learner2.id);
    }
}

class Learner {
    String fullName;
    char gender;
    String birthDate;
    String contact;
    int id;
    float bodyWeight;

    public Learner(String fullName, char gender, String birthDate, String contact, int id, float bodyWeight) {
        this.fullName = fullName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.contact = contact;
        this.id = id;
        this.bodyWeight = bodyWeight;

        System.out.println("Name: " + fullName + ", Gender: " + gender + ", DOB: " + birthDate + ", Contact: " + contact + ", ID: " + id + ", Weight: " + bodyWeight);
    }

    public Learner() {
        System.out.println("Default Constructor Executed");
    }

    void enroll() {
        System.out.println("Enrollment Successful");
    }

    void enroll(String fullName) {
        System.out.println(fullName + " has been enrolled successfully.");
    }

    void courseEnroll() {
        System.out.println("Course Enrollment Successful");
    }

    void courseEnroll(int id) {
        System.out.println("Learner with ID " + id + " has been enrolled in the course.");
    }
}

