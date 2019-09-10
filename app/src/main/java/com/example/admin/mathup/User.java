package com.example.admin.mathup;

public class User
{
   private String userId;
    private String name;
    private String email;
    private String Classroom;
    private  String teacher;
    private int numberOfAnswered;
    private int numberOfRightAnswers;
    private int numberOfWrongAnswers;



    public User()
    {

    }
    public User(String userId,String nameId,String emailId,String Classroom,String teacher){
        this.name=nameId;
        this.email=emailId;
        this.userId= userId;
        this.Classroom=Classroom;
        this.teacher=teacher;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUserId() {
        return userId;
    }

    public String getClassroom() {
        return Classroom;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getNumberOfAnswered() {
        return numberOfAnswered;
    }

    public int getNumberOfRightAnswers() {
        return numberOfRightAnswers;
    }

    public int getNumberOfWrongAnswers() {
        return numberOfWrongAnswers;
    }
}
