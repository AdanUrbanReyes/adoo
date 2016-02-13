package modelo;

import java.util.LinkedList;

public class Employeer {
    private String socialSecurityNumber;
    private String name;
    private String surname;
    private String password;
    private float pay;
    private LinkedList <ScheduleOfWork> schedule;
    public Employeer(String socialSecurityNumber,String name,String surname,String password,float pay,LinkedList <ScheduleOfWork> schedule){
        this.socialSecurityNumber=socialSecurityNumber;
        this.name=name;
        this.surname=surname;
        this.password=password;
        this.pay=pay;
        this.schedule=schedule;
    }
    public void setCurp(String socialSecurityNumber){
        this.socialSecurityNumber=socialSecurityNumber;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setPay(float pay){
        this.pay=pay;
    }
    public void setDayOfWork(LinkedList <ScheduleOfWork> schedule){
        this.schedule=schedule;
    }
    public String getCurp(){
        return socialSecurityNumber;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPasssword(){
        return password;
    }
    public Float getPay(){
        return pay;
    }
    public LinkedList <ScheduleOfWork> getDayOfWork(){
        return schedule;
    }
}
