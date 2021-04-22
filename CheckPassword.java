
import java.util.Scanner;

public class PasswordClass {
    // protect the variables
     private static final int PASSWORD_LENGTH = 8;
     private static final String MY_PASSWORD = "!Chumaxonics@1";
     private final static  String PATTERN = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";

    public static void main(String[] args) {
      // Password requirement
        System.out.println("  \n Password must be more than 8 characters in length."
                +" \n Password must have at least one uppercase character"
                +" \n Password must have at least one lowercase character"
                +" \n Password must have at least one number"
                +" \n Password must have at least one special character among @#$%");
        /* code */
        // No need to change this password via objects and other packages
        checkPassword();
    }

    private static void checkPassword() {

        int att = 2; // the attempts declared here .. .

        Scanner input = new Scanner(System.in);
        String enteredPassword;
        // loops three times, decrements as the end-user test their password
        //compares and then decrements

        do { // this loop will run regardless of the condition, and check the condition after the first execution

            System.out.println(" \n ----Enter your password that meet the above following requirements-----------: ");

                                enteredPassword = input.nextLine();


            boolean isTrue = enteredPassword.matches(PATTERN);// works

            //Check the password length and if the pattern is met
            // if you change the attempts and loop, you might require to break the iterations

            if (enteredPassword.length() < PASSWORD_LENGTH || (!isTrue)) {
                 // check the attempts
                if (att == 0) {

                    System.out.println("You attempted three times, YOU ARE BLOCKED!");
                }
                //if both requirements are not met, do this
                else if(enteredPassword.length() < PASSWORD_LENGTH&&(!isTrue)){
                          System.out.println("Your password length is week and it does  not requirements above, please try again..");
                }
                //if the result return false, then the above requirements are not met
                else if (!isTrue){

                    System.out.println("Your password does  not requirements above, please try again..");

                }
                else { // else the length is our problem

                             System.out.println("Your password length does  not meet the length requirements, please try again..");

                }
            } else {
                // if both conditions are met, then you can continue
                //not compulsory though

                if (enteredPassword.equals(MY_PASSWORD)&& (isTrue)) {

                    System.out.println("--------------------Please Continue---------------------");

                }
                //checking if the user attempts equals zero after decrementing

                else if (att == 0) {

                    System.out.println("You attempted three times, YOU ARE BLOCKED! ");

                } else { // possibility of having a wrong password although the above length and requirements are met
                    System.out.println("Incorrect Password. you have attempts remaining: " + att);
                }
            }

        } while (att-- > 0);// decrement

    }

}


