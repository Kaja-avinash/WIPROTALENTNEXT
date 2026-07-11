class Patient {

    private String patientName;
    private double height;
    private double weight;

    public Patient(String patientName, double height, double weight) {
        this.patientName = patientName;
        this.height = height;
        this.weight = weight;
    }

    public double computeBMI() {
        return weight / (height * height);
    }

    public String getPatientName() {
        return patientName;
    }

}