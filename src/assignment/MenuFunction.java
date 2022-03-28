package assignment;

import java.util.Scanner;

public class MenuFunction {

    public static void main(String[] args) {
        String prompt = """
                1. Phonebook
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call diverts
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. Sim settings
                                
                Please select an option
                """;
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        switch (select) {
            case 1:
                String phonebook = """
                        1. Search
                        2. Service Nos
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign
                        7. Send b'card
                        8. Option
                        9. Speed dial
                        10. Voice tags
                                                
                        please select an option
                        """;

                System.out.println(phonebook);

                int choiceOutput = input.nextInt();
                switch (choiceOutput) {
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service no");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign code");
                    case 7 -> System.out.println("Send b'card");
                    case 8 -> {
                        String option = """
                                1. Type of view
                                2. Memory status
                                                            
                                please select an option
                                 """;
                        System.out.println(option);
                        int subSelect = input.nextInt();
                        switch (subSelect) {
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory status");
                            default -> System.out.println("This is an invalid option");
                        }

                    }
                    case 9 -> System.out.println("Speed dial");
                    case 10 -> System.out.println("Voice tags");
                }
                break;
            case 2:
                String messages = """
                        1. Write Messages
                        2. Inbox
                        3. Outbox
                        4. Picture Messages
                        5. Templates
                        6. Smileys
                        7. Message Settings
                        8. Info Service
                        9. Voice Mailbox Number
                        10. Service Command Editor
                                                
                        please select a option
                        """;
                System.out.println(messages);

                int Output = input.nextInt();
                switch (Output) {
                    case 1 -> System.out.println("Write Option");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture Messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                        String messageSettings = """
                                1. Set 1
                                2. Common
                                                            
                                please select an option
                                """;
                        System.out.println(messageSettings);
                        int yourChoice = input.nextInt();
                        switch (yourChoice) {
                            case 1 -> {
                                String set1 = """
                                        1. Message Centre number
                                        2. Message sent as
                                        3. Message validity
                                                                                
                                        please select an option
                                        """;
                                System.out.println(set1);
                                int Choice = input.nextInt();
                                switch (Choice) {
                                    case 1 -> System.out.println("Message Centre number");
                                    case 2 -> System.out.println("Message sent as");
                                    case 3 -> System.out.println("Message validity");
                                    default -> System.out.println("This is an invalid option");
                                }
                            }
                            case 2 -> {
                                String common = """
                                        1. Delivery reports
                                         2. Reply via centre
                                         3. Character support
                                         
                                         please select an option
                                         """;
                                System.out.println(common);
                                int resolve = input.nextInt();
                                switch (resolve) {
                                    case 1 -> System.out.println("Delivery reports");
                                    case 2 -> System.out.println("Reply via centre");
                                    case 3 -> System.out.println("Character support");
                                    default -> System.out.println("This is an invalid option");
                                }
                            }

                        }
                    }
                    case 8 -> System.out.println("Info Service");

                    case 9 -> System.out.println("Voice Mailbox Number");
                    case 10 -> System.out.println("Service Command Editor");


                }
                break;
            case 3:
                System.out.println("You have selected Chat");
                break;
            case 4:
                String callRegister = """
                        1. Missed calls
                        2. Received calls
                        3. Dialled calls
                        4. Erase recent calls
                        5. Show call duration
                        6. Show call costs
                        7. Call cost settings
                        8. Prepaid credit
                                                
                        please select an option
                        """;

                System.out.println(callRegister);

                int collect = input.nextInt();
                switch (collect) {
                    case 1 -> System.out.println("You have 55 missed calls");
                    case 2 -> System.out.println("Received call is 66");
                    case 3 -> System.out.println("Your dialled numbers are 77");
                    case 4 -> System.out.println("calls erased");
                    case 5 -> {
                        String callDuration = """
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4.  Dialled calls' duration
                                5. Clear timers
                                                        
                                please select an option
                                """;
                        System.out.println(callDuration);

                        int enter = input.nextInt();
                        switch (enter) {
                            case 1 -> System.out.println("Last call duration is 1min:56sec");
                            case 2 -> System.out.println("All call duration is 1hr:1min:56sec");
                            case 3 -> System.out.println("Received call duration is 1hr");
                            case 4 -> System.out.println("Dialled call duration is 1min: 56sec");
                            case 5 -> System.out.println("Timer cleared");
                            default -> System.out.println("This is an invalid option");
                        }

                    }
                    case 6 -> {
                        String callCost = """
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters
                                                   
                                 please select an option
                                """;
                        System.out.println(callCost);

                        int get = input.nextInt();
                        switch (get) {
                            case 1 -> System.out.println("Last call cost is #56.00");
                            case 2 -> System.out.println("All call cost is #250.00");
                            case 3 -> System.out.println("0.00");

                            default -> System.out.println("This is an invalid option");
                        }

                    }

                    case 7 -> {
                        String callCostSettings = """
                                1. Call cost limit
                                2. Show cost in
                                    
                                 please select an option
                                """;
                        System.out.println(callCostSettings);

                        int get = input.nextInt();
                        switch (get) {
                            case 1 -> System.out.println("Call cost limit is #56.00");
                            case 2 -> System.out.println("Cost in will be displayed after the end of each call");

                            default -> System.out.println("This is an invalid option");
                        }
                    }
                    case 8 -> System.out.println("Prepaid credit");

                }
                break;
            case 5:
                String tones = """
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Keypad tones
                        6. Warning and game tones
                        7. Vibrating alert
                        8. Screen saver
                                                
                        please select an option
                        """;

                System.out.println(tones);

                int getIn = input.nextInt();
                switch (getIn) {
                    case 1 -> System.out.println("Ring tone selected");
                    case 2 -> System.out.println("Ringing volume increased");
                    case 3 -> System.out.println("incoming call alert activated");
                    case 4 -> System.out.println("composer option selected");
                    case 5 -> System.out.println("Keypad tones activated");
                    case 6 -> System.out.println("Warning and game tones selected");
                    case 7 -> System.out.println("Vibration mode");
                    case 8 -> System.out.println("Your screen saver is successful");
                    default -> System.out.println("This is an invalid option");
                }
break;
            case 6 :
                    String settings = """
                                1. Call settings
                                2. Phone settings
                                3. Security settings
                                4. Restore factory settings
                                
                                                        
                                please select an option
                                """;
                    System.out.println(settings);

                    int subEnter = input.nextInt();
                switch (subEnter) {
                    case 1 -> {
                        String callSettings = """
                                1. Automated redial
                                2. Speed dialling
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                                        
                                please select an option
                                """;
                        System.out.println(callSettings);
                        int enterCallSettings = input.nextInt();
                        switch (enterCallSettings) {
                            case 1 -> System.out.println("Automated redial activated");
                            case 2 -> System.out.println("Speed dialling activated");
                            case 3 -> System.out.println("DCall waiting activated");
                            case 4 -> System.out.println("Own number sending");
                            case 5 -> System.out.println("Phone line in use");
                            case 6 -> System.out.println("Automatic answer activated");
                            default -> System.out.println("This is an invalid option");
                        }
                    }
                    case 2 -> {
                        String phoneSettings = """
                                1. Language
                                2. Cell info display
                                3. Welcome display
                                4. Network selection
                                5. lights
                                6. Confirm sim service actions
                                                        
                                please select an option
                                """;
                        System.out.println(phoneSettings);
                        int enterPhoneSettings = input.nextInt();
                        switch (enterPhoneSettings) {
                            case 1 -> System.out.println("Language selected");
                            case 2 -> System.out.println("Cell info display");
                            case 3 -> System.out.println("Welcome display");
                            case 4 -> System.out.println("Network selection");
                            case 5 -> System.out.println("lights selected");
                            case 6 -> System.out.println("sim service action confirmed");
                            default -> System.out.println("This is an invalid option");
                        }
                    }
                    case 3 -> {
                        String securitySettings = """
                                1. Pin code request
                                2. Call barring service
                                3. fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                                        
                                please select an option
                                """;
                        System.out.println(securitySettings);
                        int enterSecuritySettings = input.nextInt();
                        switch (enterSecuritySettings) {
                            case 1 -> System.out.println("Pin code request successful");
                            case 2 -> System.out.println("Call barring activated");
                            case 3 -> System.out.println("fixed dialling activated");
                            case 4 -> System.out.println("Closed user group");
                            case 5 -> System.out.println("Phone security");
                            case 6 -> System.out.println("Change access codes successful");
                            default -> System.out.println("This is an invalid option");
                        }
                    }
                    case 4 -> System.out.println("Restore factory settings");
                    default -> System.out.println("This is an invalid option");
                }

            case 7:
                System.out.println("Your call has been diverted");
                break;
            case 8:
                System.out.println("You selected Games");
                break;
            case 9:
                System.out.println("You selected calculator");
                break;
            case 10:
                System.out.println("Reminder is activated");
                break;

            case 11:
                String clock = """
                                    1. Alarm clock
                                    2. Clock settings
                                    3. Date settings
                                    4. Stop watch
                                    5. Countdown timer
                                    6. Auto update of date and time
                                                            
                                    please select an option
                                    """;
                System.out.println(clock);

                int enterClock = input.nextInt();
                switch (enterClock) {
                    case 1 -> System.out.println("Alarm selected");
                    case 2 -> System.out.println("Clock updated");
                    case 3 -> System.out.println("Date has been set successfully");
                    case 4 -> System.out.println("Stop watch selected");
                    case 5 -> System.out.println("Countdown timer selected");
                    case 6 -> System.out.println("Date and time updated");
                    default -> System.out.println("This is an invalid option");
                }
                break;

            case 12:
                System.out.println("You selected Profile");
                break;
            case 13:
                System.out.println("Sim services selected");
                break;



        }
    }
}