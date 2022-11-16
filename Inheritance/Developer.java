public class Developer {
    private String platform;
    private String interviewerName;
    private String developerName;
    private int workingHours;

    public Developer(String platform, String interviewerName, int workingHours) {
        this.platform = platform;
        this.interviewerName = interviewerName;
        this.developerName = "";
        this.workingHours = workingHours;
}

    public String getPlatform() {
        return platform;
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public void display() {
        System.out.println("The platform name is " + platform);
        System.out.println("The interviewer name is " + interviewerName);
        System.out.println("The working hours is " + workingHours);
        if (developerName != "") {
            System.out.println("The developer name is " + developerName);
        }
    }
}