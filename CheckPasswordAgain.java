import java.util.Scanner;

public class TestingApp {

    public static final int PASSWORD_LENGTH = 8;

    public static final String MY_PASSWORD = "!Chumaxonics@1";

    static int att = 2;

    public static void main(String[] args) {
        /*
         * @Chumaxonics
         * I will explain this code during our interview, this code os good for validating the requirement before checking the match_
         */
        Scanner input = new Scanner(System.in);
        String enteredPassword;
// Password requirement
        System.out.println("  \n Password must be more than 8 characters in length."
                +" \n Password must have at least one uppercase character"
                +" \n Password must have at least one lowercase character"
                +" \n Password must have at least one number"
                +" \n Password must have at least one special character among @#$%");
                  //remember that this will iterates 3 times because we are not using  a scanner for input here
            do {

                System.out.println(" \n ----Enter your password that meet the above following requirements-----------:");
                enteredPassword = input.nextLine();

                boolean validPassword = checkPassword(enteredPassword);
                if (validPassword) {
                    // before this part, check if the password meets the requirements
                    if (enteredPassword.equals(MY_PASSWORD)) {
                        System.out.println("************Please Continue**************");
                      
                        break; // if correct, end the loop here
                    } else {

                        System.out.println("-------Incorrect Password-----"+ att +" attempts left ");
                    }

                }
                if(att==0){

                    System.out.println(" \n You attempted three times, YOU ARE BLOCKED! "

                            +"Your password does not meet the requirements");
                    System.out.println("\n");
                }


            }while (att-- > 0);

    }

    public static boolean checkPassword(String userPassword)
    {
        boolean isFine = true;


        if (userPassword.length() < 8)
        {
            System.out.println("Password must be more than 8 characters in length.");
            isFine = false;
        }
        String upper_Case = "(.*[A-Z].*)";
        if (!userPassword.matches(upper_Case))
        {
            System.out.println(" -----Include uppercase character");
            isFine = false;
        }
        String lower_Case = "(.*[a-z].*)";
        if (!userPassword.matches(lower_Case))
        {
            System.out.println(" -----Include lowercase character");
            isFine = false;
        }
        String num = "(.*[0-9].*)";
        if (!userPassword.matches(num))
        {
            System.out.println(" -----Include one number");
            isFine = false;
        }
        String special_Chars = "(.*[@,#,$,%].*$)";
        if (!userPassword.matches(special_Chars ))
        {
            System.out.println(" -----Include special character ");
            isFine = false;
        }
        return isFine;
    }
}


