public class JuniorDeveloper extends Developer{
    private double salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;

    public JuniorDeveloper(String platform, String interviewerName, int workingHours, double salary, String appointedBy, String terminationDate){
        super(platform, interviewerName, workingHours);
        this.salary = salary;
        this.appointedBy = appointedBy;
        this.terminationDate = terminationDate;
        this.appointedDate = "";
        this.evaluationPeriod = "";
        this.specialization = "";
        this.joined = false;
    }

    public double getSalary() {
        return salary;
    }
    public String getAppointedDate() {
        return appointedDate;
    }
    public String getEvaluationPeriod() {
        return evaluationPeriod;
    }
    public String getTerminationDate() {
        return terminationDate;
    }
    public String getSpecialization() {
        return specialization;
    }
    public String getAppointedBy() {
        return appointedBy;
    }
    public boolean getJoined() {
        return joined;
    }

    public void setSalary(double salary) {
        if (joined == true) {
            this.salary = salary;
        } else {
            System.out.println("The developer is already appointed");
        }
    }

    public void appointDeveloper(String developerName, String appointedDate, String terminationDate, String specialization) { 
        if (joined == false) {
            super.setDeveloperName(developerName);
            this.joined = true;
        } else {
            System.out.println("The developer is already appointed");
        }
        this.appointedDate = appointedDate;
        this.terminationDate = terminationDate;
        this.specialization = specialization;
    }

    public void display() {
        super.display();
        if (joined == true) {
            System.out.println("The Evaluation period is "+evaluationPeriod);
            System.out.println("The Termination date is "+terminationDate);
            System.out.println("The Developer salary is "+salary);
            System.out.println("The Specialization is "+specialization);
            System.out.println("The Appointed by is "+appointedBy);
        }
    }
}
