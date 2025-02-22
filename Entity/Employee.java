package com.spring.demo.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String name;

    private String password;
    public Employee()
    {
        
    }
    public Employee(int id,String name,String password)
    {
        this.id=id;
        this.name=name;
        this.password=password;
    }
    public int getId(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getpassword(){
        return password;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setpasword(String password)
    {
        this.password=password;
    }
    
}
