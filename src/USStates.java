import java.util.*;

/*
 *@author Vita Wiebe
 *@version Assignment 2, Tuesday class, Section H9
 */
public class USStates {

    public static void main(String[] args) {

        // create a 50x1 2D array to store State/Capitol pairs
        String[][] usaStates = new String[50][2];

        /*
         tediously populate said array with each state and its corresponding capitol;
         pattern is State [n][0], Capitol [n + 1][1];

         - note to self: these are off a bit
        */
        usaStates[0][0] = "Alabama";
        usaStates[0][1] = "Montgomery";
        usaStates[1][0] =  "Alaska";
        usaStates[1][1] = "Juneau";
        usaStates[2][0] = "Arizona";
        usaStates[2][1] = "Phoenix";
        usaStates[3][0] = "Arkansas";
        usaStates[3][1] = "Little Rock";
        usaStates[4][0] = "California";
        usaStates[4][1] = "Sacramento";
        usaStates[5][0] = "Colorado";
        usaStates[5][1] = "Denver";
        usaStates[6][0] = "Connecticut";
        usaStates[6][1] = "Hartford";
        usaStates[7][0] = "Delaware";
        usaStates[7][1] = "Dover";
        usaStates[8][0] = "Florida";
        usaStates[8][1] = "Tallahassee";
        usaStates[9][0] = "Georgia";
        usaStates[9][1] = "Atlanta";
        usaStates[10][0] = "Hawaii";
        usaStates[10][1] = "Honolulu";
        usaStates[11][0] = "Idaho";
        usaStates[11][1] = "Boise";
        usaStates[12][0] = "Illinois";
        usaStates[12][1] = "Springfield";
        usaStates[13][0] = "Indiana";
        usaStates[13][1] = "Indianapolis";
        usaStates[14][0] = "Iowa";
        usaStates[14][1] = "Des Moines";
        usaStates[15][0] = "Kansas";
        usaStates[15][1] = "Topeka";
        usaStates[16][0] = "Kentucky";
        usaStates[16][1] = "Frankfort";
        usaStates[17][0] = "Louisiana";
        usaStates[17][1] = "Baton Rouge";
        usaStates[18][0] = "Maine";
        usaStates[18][1] = "Augusta";
        usaStates[19][0] = "Maryland";
        usaStates[19][1] = "Annapolis";
        usaStates[20][0] = "Massachusetts";
        usaStates[20][1] = "Boston";
        usaStates[21][0] = "Michigan";
        usaStates[21][1] = "Lansing";
        usaStates[22][0] = "Minnesota";
        usaStates[22][1] = "St. Paul";
        usaStates[23][0] = "Mississippi";
        usaStates[23][1] = "Jackson";
        usaStates[24][0] = "Missouri";
        usaStates[24][1] = "Jefferson City";
        usaStates[25][0] = "Montana";
        usaStates[25][1] = "Helena";
        usaStates[26][0] = "Nebraska";
        usaStates[26][1] = "Lincoln";
        usaStates[27][0] = "Nevada";
        usaStates[27][1] = "Carson City";
        usaStates[28][0] = "New Hampshire";
        usaStates[28][1] = "Concord";
        usaStates[29][0] = "New Jersey";
        usaStates[29][1] = "Trenton";
        usaStates[30][0] = "New Mexico";
        usaStates[30][1] = "Santa Fe";
        usaStates[31][0] = "New York";
        usaStates[31][1] = "Albany";
        usaStates[32][0] = "North Carolina";
        usaStates[32][1] = "Raleigh";
        usaStates[33][0] = "North Dakota";
        usaStates[33][1] = "Bismarck";
        usaStates[34][0] = "Ohio";
        usaStates[34][1] = "Columbus";
        usaStates[35][0] = "Oklahoma";
        usaStates[35][1] = "Oklahoma City";
        usaStates[36][0] = "Oregon";
        usaStates[36][1] = "Salem";
        usaStates[37][0] = "Pennsylvania";
        usaStates[37][1] = "Harrisburg";
        usaStates[38][0] = "Rhode Island";
        usaStates[38][1] = "Providence";
        usaStates[39][0] = "South Carolina";
        usaStates[39][1] = "Columbia";
        usaStates[40][0] = "South Dakota";
        usaStates[40][1] = "Pierre";
        usaStates[41][0] = "Tennessee";
        usaStates[41][1] = "Nashville";
        usaStates[42][0] = "Texas";
        usaStates[42][1] = "Austin";
        usaStates[43][0] = "Utah";
        usaStates[43][1] = "Salt Lake City";
        usaStates[44][0] = "Vermont";
        usaStates[44][1] = "Montpelier";
        usaStates[45][0] = "Virginia";
        usaStates[45][1] = "Richmond";
        usaStates[46][0] = "Washington";
        usaStates[46][1] = "Olympia";
        usaStates[47][0] = "West Virginia";
        usaStates[47][1] = "Charleston";
        usaStates[48][0] = "Wisconsin";
        usaStates[48][1] = "Madison";
        usaStates[49][0] = "Wyoming";
        usaStates[49][1] = "Cheyenne";

        /*
         create a HashMap in which to store our Key-Value pairs, State-Capitol in this
         case;
        */
        HashMap<String,String> stateCapitol = new HashMap<>();

        // loop through 2D array, putting said values into HashMap in Key-Value pairs;
        for(int n = 0; n < usaStates.length - 1; n++){
            stateCapitol.put(usaStates[n][0].toUpperCase(),usaStates[n][1].toUpperCase());
        }

        /*
         prompt end-user for input in the form of a US state 5 times;

         convert this output to all-caps and print out the state and its corresponding
         capitol city;
        */
        for(int i = 0; i < 5; i++){

            System.out.println("Please enter the name of a US state to retrieve its capitol, " +
                    "typing 'enter' to enter input: ");
            Scanner scan = new Scanner(System.in);
            String userInput = "";

            // parse user input for key, convert to all-caps;
            String receivedToken = scan.next();
            while(receivedToken.equals("enter")){
                userInput += receivedToken.toUpperCase();
                receivedToken = scan.next();
            }

            /*
             if stateCapitol contains the state user enters, print
             state and its corresponding capitol city;
            */
            if(stateCapitol.containsKey(userInput)){
                System.out.println("State: " + userInput + "  Capitol: " + stateCapitol.get(userInput));
            }
        }
    }
}
