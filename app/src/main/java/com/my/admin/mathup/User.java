package com.my.admin.mathup;

public class User
{
   private String userId;
    private String name;
    private String email;
    private String classroom;
    private  String teacher;
    private String school;
    public int numberOfAnswered;
    public int numberOfRightAnswers;
    public int numberOfWrongAnswers;



    public User()
    {

    }
    public User(String userId,String nameId,String emailId,String classroom,String teacher,String school){
        this.name=nameId;
        this.email=emailId;
        this.userId= userId;
        this.classroom=classroom;
        this.teacher=teacher;
        this.school=school;
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
        return this.classroom;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getSchool(){ return school; }

    public int getNumberOfAnswered() {
        return numberOfAnswered;
    }



    public void setNumberOfAnswered(int numberOfAnswered) {
        this.numberOfAnswered = numberOfAnswered;
    }

    public void setNumberOfWrongAnswers(int numberOfWrongAnswers) {
        this.numberOfWrongAnswers = numberOfWrongAnswers;
    }

    public int getNumberOfRightAnswers() {
        return numberOfRightAnswers;
    }

    public int getNumberOfWrongAnswers() {
        return numberOfWrongAnswers;
    }
}
