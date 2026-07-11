class CollegeStudent extends Student {

    private String collegeName;
    private String year;

    public CollegeStudent(String name, String dateOfBirth, String studentId,
                          String collegeName, String year) {
        super(name, dateOfBirth, studentId);
        this.collegeName = collegeName;
        this.year = year;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getYear() {
        return year;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setYear(String year) {
        this.year = year;
    }

}