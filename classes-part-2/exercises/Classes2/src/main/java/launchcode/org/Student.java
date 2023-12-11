package launchcode.org;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        // gpa = (total quality score) / (total # of credits)
        // tqs = gpa * numberOfCredits

        double totalQualityScore = this.gpa * this.numberOfCredits;
        totalQualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore / this.numberOfCredits;
    }

    public String getGradeLevel(int credits) {
        // Determine the grade level of the student based on numberOfCredits
        if (credits < 30) {
            return "freshman";
        } else if (credits < 60) {
            return "sophomore";
        } else if (credits < 90) {
            return "junior";
        } else {
            return "senior";
        }
    }

    public String toString() {
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
        return studentReport;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();


        public static int getNextStudentId () {
            return nextStudentId;
        }

        public static void setNextStudentId ( int nextStudentId){
            Student.nextStudentId = nextStudentId;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getStudentId () {
            return studentId;
        }

        public void setStudentId ( int studentId){
            this.studentId = studentId;
        }

        public int getNumberOfCredits () {
            return numberOfCredits;
        }

        public void setNumberOfCredits ( int numberOfCredits){
            this.numberOfCredits = numberOfCredits;
        }

        public double getGpa () {
            return gpa;
        }

        public void setGpa ( double gpa){
            this.gpa = gpa;
        }
    }

    private Object getStudentId() {
    }