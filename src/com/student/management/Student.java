package com.student.management;

public class Student {
    
    private int studentId;
    private String studentName;
    private String studentAddress;
    private int studentRoll;
    private String studentDepartment;
    private long contactNo;
    
    //Default Constructor!!
    public Student() {
        super();
    }

    // Parameterized Constructor!!
    public Student(int studentId, String studentName, String studentAddress, int studentRoll, String studentDepartment,
            long contactNo) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentRoll = studentRoll;
        this.studentDepartment = studentDepartment;
        this.contactNo = contactNo;
    }

    //Getter and Setter Methods!!
    public synchronized int getStudentId() {
        return studentId;
    }


    public synchronized void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    public synchronized String getStudentName() {
        return studentName;
    }


    public synchronized void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public synchronized String getStudentAddress() {
        return studentAddress;
    }


    public synchronized void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }


    public synchronized int getStudentRoll() {
        return studentRoll;
    }


    public synchronized void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }


    public synchronized String getStudentDepartment() {
        return studentDepartment;
    }


    public synchronized void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }


    public synchronized long getContactNo() {
        return contactNo;
    }


    public synchronized void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }


    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
                + ", studentRoll=" + studentRoll + ", studentDepartment=" + studentDepartment + ", contactNo=" + contactNo + "]";
    }                   
}
