package proz;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")
public class Student {
  
  private int id;
  private String firstName;
  private String lastName;
  private int semester;
  
  public Student() {}
  
  public Student(String firstName, String lastName, int semester, int id) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.semester = semester;
    this.id = id;
  }
  
  @XmlElement
  public void setFirstName(String fname) {
    this.firstName = fname;
  }
  
  public String getFirstName() {
    return this.firstName;
  }
  
  @XmlElement
  public void setLastName(String lname) {
    this.lastName = lname;
  }
  
  public String getLastName() {
    return this.lastName;
  }
  
  @XmlElement
  public void setSemester(int semester) {
    this.semester = semester;
  }
  
  public int getSemester() {
    return this.semester;
  }
  
  @XmlAttribute
  public void setId(int id) {
    this.id = id;
  }
  
  public int getId() {
    return this.id;
  }
  
  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", semester=" + semester +
        '}';
  }
}