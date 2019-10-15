
public class PersonalInfo
{
  String firstName;
  String lastName;
  String gender;
  int age;
  
  public PersonalInfo(String firstName, String lastName, String gender, int age) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.gender = gender;
     this.age = age;
    }
  public PersonalInfo() {
     this.firstName = " ";
     this.lastName = " ";
     this.gender = " ";
     this.age = 0;
    }
  public void setfirstName(String firstName) {
     this.firstName = firstName;   
    }
  public String getfirstName() {
     return firstName; 
    }
  public void setlastName(String lastName) {
     this.lastName = lastName; 
    }
  public String getlastName() {
     return lastName; 
    }
  public void setGender(String gender) {
     this.gender = gender; 
    }
  public String getGender() {
     return gender; 
    }
  public void setAge() {
     this.age = age; 
    }
  public int getAge() {
      return age;
    }
  public String PersonalInfoFormat() {
     return String.format("%s, %s", lastName, firstName);
    }
}
