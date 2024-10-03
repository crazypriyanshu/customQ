package com.qProject.queue.InterviewProblems.misc.customAnnotations;
@JsonSerializable
public class Person {
    @JsonElement
    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @JsonElement(key = "personAge")
    private String age;

    public void initNames(){
        this.firstname = this.firstname.substring(0,1).toUpperCase() + this.firstname.substring(1);
        this.age = this.age;
    }
}
