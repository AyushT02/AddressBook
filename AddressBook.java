
public class AddressBook 
{
    public static void main(String[]args) {
        PersonalInfo p1 = new PersonalInfo("Ayush", "Thengne", "Male", 16);
        Address a1 = new Address("13100 Blackberry Dr.", "", "Goshen", "Kentucky", "40026");
        Contact c1 = new Contact("502-759-8976", a1, p1);
        System.out.println(p1.PersonalInfoFormat());
        System.out.println(a1.AddressFormat());
        System.out.println(p1.getGender());
        System.out.println("Age: " + p1.getAge());
        System.out.println(c1.ContactFormat());
        
        
           
        
        
        
    }
        
    
}
