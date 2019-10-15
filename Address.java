

public class Address
{
   String street1;
   String street2;
   String city;
   String state;
   String zipCode;
   
  public Address(String street1, String street2, String city, String state, String zipCode) {
      this.street1 = street1;
      this.street2 = street2;
      this.city = city;
      this.state = state;
      this.zipCode = zipCode;
    }
    
  public Address() {
     this.street1 = " ";
     this.street2 = " ";
     this.city = " ";
     this.state = " ";
     this.zipCode = " ";
    }
    
  public void setStreet1(String street1) {
     this.street1 = street1; 
    }
  public String getStreet1() {
     return street1; 
    }
    
  public void setStreet2(String street2) {
     this.street2 = street2; 
    }
  public String getStreet2() {
     return street2; 
    }
  public void setCity(String city) {
     this.city = city; 
    }
  public String getCity() {
     return city; 
    }
  public void setState(String state) {
     this.state = state; 
    }
  public String getState() {
     return state; 
    }
  public void setZipCode(String zipCode) {
      this.zipCode = zipCode;
    }
  public String getZipCode() {
     return zipCode; 
    }
  public String AddressFormat() {
      System.out.println(street1);
      System.out.println(street2);
      return String.format("%s, %s %s", city, state, zipCode);
    }
}
