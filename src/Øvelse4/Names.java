package Øvelse4;

public class Names {
  private String firstName;
  private String middleName;
  private String lastName;


  public Names(String fullName) {
    String[] fullNameArray = fullName.split(" ");
   int counter = 0;
   for (int i = 0; i < fullName.length(); i++){
     if (fullName.charAt(i) == ' '){
       counter++;
     }
     if (counter == 1){
       firstName = fullNameArray[0];
       lastName = fullNameArray[1];
     }
     if (counter == 2){
       this.firstName = fullNameArray[0];
       this.middleName = " " + fullNameArray[1];
       this.lastName = fullNameArray[2];
     }
   }

  }

  public String toString() {
    if (this.middleName== null){
      this.middleName = "";
    }
    return firstName + middleName + " " + lastName;
  }
}
