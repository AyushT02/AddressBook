
public class Contact 
{
   String phoneNumber;
   Address address;
   PersonalInfo person;
   public Contact(String phoneNumber, Address address, PersonalInfo person) {
     this.phoneNumber = phoneNumber;
     this.address = address;
     this.person = person;
    }
   public Contact() {
     this.phoneNumber = " ";
     this.address = new Address();
     this.person = new PersonalInfo();
    }
   public void setphoneNumber(String phoneNumber) {
     this.phoneNumber = phoneNumber;  
    }
   public String getphoneNumber () {
       return phoneNumber;
    } 
    
   public String ContactFormat() {
     return phoneNumber;
    }
    
}
