package com.qde.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Students
{
//Defining student id as primary key
@Id
@Column
private int studentId;
@Column
private String studentName;
@Column
private int studentAge;

public int getstudentId()
{
return studentId;
}
public void setStudentId(int studentId)
{
this.studentId = studentId;
}
public String getStudentName()
{
return studentName;
}
public void setStudentName(String studentName)
{
this.studentName = studentName;
}
public int getStudentAge()
{
return studentAge;
}
public void setStudentAge(int studentAge)
{
this.studentAge = studentAge;
}

}