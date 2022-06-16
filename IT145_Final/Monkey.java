/*Inherit from the RescueAnimal class.
Implement all attributes to meet the specifications.
Include a constructor. You may use a default constructor. To score “exemplary” on this criterion, you must include the more detailed constructor that takes all values for the attributes and sets them. Refer to the constructor in the Dog class for an example.
Include accessors and mutators for all implemented attributes.*/

public class Monkey extends RescueAnimal {
	
	//INSTANCE VARIABLES
	private String species;
	private String tailLength;
	private String height;
	private String bodyLength;
	
	//CONSTRUCTOR
	//Monkey specific variables: tail length, height, body length, and species
	public Monkey(String name, String species, String gender, String age,
		    String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry, 
			String tailLength, String height, String bodyLength) {
		
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        

	}
	
	//Mutators
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
	
	public void setTailLength(String monkeyTailLength) {
		tailLength = monkeyTailLength;
	}
	
	public void setHeight(String monkeyHeight) {
		height = monkeyHeight;
	}
	
	public void setBodyLength(String monkeyBodyLength) {
		bodyLength = monkeyBodyLength;
	}
	
	//Accessors
	public String getSpecies() {
		return species;
	}
	
	public String getTailLength() {
		return tailLength;
	}
	
	public String getHeight() {
		return height;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}
}
