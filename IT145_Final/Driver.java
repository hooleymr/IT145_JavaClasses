import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);
    	
        initializeDogList();
        initializeMonkeyList();
        
        while(true) {
        	displayMenu();
        	String initialCommand = scnr.nextLine();
        	
            if(initialCommand.equals("1")) {
        		intakeNewDog(scnr);
        		
        	}
        	else if(initialCommand.equals("2")) {
        		intakeNewMonkey(scnr);
        	}
        	else if(initialCommand.equals("3")) {
        		reserveAnimal(scnr);
        	}
        	else if(initialCommand.equals("4")) {
        		printAnimals("Dog");
        	}
        	else if(initialCommand.equals("5")) {
        		printAnimals("Monkey");
        	}
        	else if(initialCommand.equals("6")) {
        		printAnimals("All");
        	}
        	else if(initialCommand.contentEquals("q")) {
        		System.out.println("Exiting application...");
        		System.exit(0);
        	}
        	else {
        		System.out.println("Please enter a valid command");
        		displayMenu();
        		}
            }
        }

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.


    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");
        Dog dog4 = new Dog("Fido", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "in service", false, "United States");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Harambe", "Capuchin", "male", "6yrs", "12.0", "06-05-2021", "United States", "in service", false, "United States", "10", "26", "26");
    	
    	monkeyList.add(monkey1);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        
        System.out.println("What is the acquisition date?");
        String acqDate = scanner.nextLine();
        
        System.out.println("What is the acquisition country?");
        String acqCountry = scanner.nextLine();
        
        System.out.println("What is the training status?");
        String trainingStatus = scanner.nextLine();
        
        System.out.println("Is the dog reserved [True/False]");
        boolean reserved = scanner.nextBoolean();
        
        System.out.println("What is the service country?");
        String servCountry = scanner.nextLine();
        
        
        //Adding in one line saves memory
        dogList.add(new Dog(name, breed, gender, age, weight, acqDate, acqCountry, trainingStatus, reserved, servCountry));
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
        	List<String> speciesList = Arrays.asList("capuchin", "guenon", "macaque", "marmoset", "squirrel monkey", "tamarin");
        	System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }
            
            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();
            while(!speciesList.contains(species.toLowerCase())) {
            	System.out.println("That species is not valid, please enter a valid species and check your spelling.");
            	species = scanner.nextLine();
            }
            
            
            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();
            
            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();
            
            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();
            
            System.out.println("What is the acquisition date?");
            String acqDate = scanner.nextLine();
            
            System.out.println("What is the acquisition country?");
            String acqCountry = scanner.nextLine();
            
            System.out.println("What is the training status?");
            String trainingStatus = scanner.nextLine();
            
            System.out.println("Is the monkey reserved [True/False]");
            boolean reserved = scanner.nextBoolean();
            
            System.out.println("What is the service country?");
            String servCountry = scanner.nextLine();
            
            System.out.println("What is the monkey's tail length?");
            String tailLength = scanner.nextLine();
            
            System.out.println("What is the monkey's height?");
            String height = scanner.nextLine();
            
            System.out.println("What is the monkey's body length?");
            String bodyLength = scanner.nextLine();
            
          //Adding in one line saves memory
            monkeyList.add(new Monkey(name, species, gender, age, weight, acqDate, acqCountry, trainingStatus, reserved, servCountry, tailLength, height, bodyLength));
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("Enter the animal type [Dog/Monkey]: ");
            String animalType = scanner.nextLine();
            if(!animalType.equalsIgnoreCase("Dog") && !animalType.equalsIgnoreCase("Monkey")) {
            	System.out.println("That is not a valid animal type, enter a valid animal type and check your spelling.");
            	System.out.println("Enter the animal type [Dog/Monkey]: ");
            	animalType = scanner.nextLine();
            }
            System.out.println("Enter the animal's name: ");
            String animalName = scanner.nextLine();
            boolean foundInLoop = false;
            
            if(animalType.equalsIgnoreCase("Dog")) {
            	//for each iterator of the list of dogs
                for(Dog dog: dogList) {
            		if(dog.getName().equalsIgnoreCase(animalName) && dog.getReserved() == false) {
            			dog.setReserved(true);
            			System.out.println(animalName + " is now reserved.");
            			foundInLoop = true;
            			return;
            		}
            		else if(dog.getName().equalsIgnoreCase(animalName) && dog.getReserved() == true) {
            			System.out.println(animalName + " is already reserved.");
            			foundInLoop = true;
            			return;
            		}
            	}
            	//dog was not found so exit function
                if(foundInLoop == false) {
            		System.out.println(animalName + " is not in our system.");
            		return;
            	}
            }
            
            else if(animalType.equalsIgnoreCase("Monkey")) {
            	for(Monkey monkey: monkeyList) {
            		if(monkey.getName().equalsIgnoreCase(animalName) && monkey.getReserved() == false) {
            			monkey.setReserved(true);
            			System.out.println(animalName + " is now reserved.");
            			foundInLoop = true;
            			return;
            		}
            		else if(monkey.getName().equalsIgnoreCase(animalName) && monkey.getReserved() == true) {
            			System.out.println(animalName + " is already reserved.");
            			foundInLoop = true;
            			return;
            		}
            	}
            	if(foundInLoop == false) {
            		System.out.println(animalName + " is not in our system");
            		return;
            	}
            }
            

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
        public static void printAnimals(String whatToPrint) {
            //Added input to function to define which statements to print
        	if(whatToPrint.equals("All")) {
            	for(Dog animal: dogList) {
            		if(animal.getTrainingStatus().equalsIgnoreCase("in service") && animal.getReserved() == false) {
            			System.out.println(animal.getName() + " | " + animal.getTrainingStatus() + " | " + animal.getAcquisitionLocation() + " | Reserved: " + animal.getReserved());
            		}
            	}
            	for(Monkey animal: monkeyList) {
            		if(animal.getTrainingStatus().equalsIgnoreCase("in service") && animal.getReserved() == false) {
            			System.out.println(animal.getName() + " | " + animal.getTrainingStatus() + " | " + animal.getAcquisitionLocation() + " | Reserved: " + animal.getReserved());
            		}
            	
            	}
        	}
        	else if(whatToPrint.equals("Dog")) {
        		System.out.println("All Dogs: ");
        		for(Dog dog: dogList) {
        			System.out.println(dog.getName() + " | " + dog.getTrainingStatus() + " | " + dog.getAcquisitionLocation() + " | Reserved: " + dog.getReserved());
        		}
        	}
        	else if(whatToPrint.equals("Monkey")) {
        		for(Monkey animal: monkeyList) {
        			System.out.println(animal.getName() + " | " + animal.getTrainingStatus() + " | " + animal.getAcquisitionLocation() + " | Reserved: " + animal.getReserved());
        		}
        	}
        }
}

