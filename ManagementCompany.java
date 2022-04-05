public class ManagementCompany extends java.lang.Object {

	private int MAX_PROPERTY = 5;
	private int MGMT_WIDTH = 10;
	private int MGMT_DEPTH = 10;
	private double mgmFeePer;
	private java.lang.String name;
	private java.lang.String taxID;
	private Property[] properties;
	private Plot plot;

	//** The No-arg Constructor with the default objects with empty strings, 0 for mgmFeePer, the Plot values set to (0, 0, 10, 10), and the property array length set to 5 */
	public ManagementCompany() {			
		this.name = "";
		this.taxID = "";
		this.mgmFeePer = 0;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
		
	}

	//** The Constructor that creates a ManagementCompany object with the default objects */
	public ManagementCompany(java.lang.String name, java.lang.String taxID, double mgmFeePer) {
			
		this.name = name;	
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
		
	}

	//**  object for the management company/
	public ManagementCompany(java.lang.String name, java.lang.String taxID, double mgmFeePer, int x, int y, int width, int depth) {
		int check = 1;
		
		switch (check) {
		case 1:
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		this.plot = new Plot(x, y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
		}
	}

	//** The Copied Constructor to be used in the ManagementCompany object */
	public ManagementCompany(ManagementCompany otherCompany) {
	
			name = otherCompany.name;
			taxID = otherCompany.taxID;
			mgmFeePer = otherCompany.mgmFeePer;
			plot = new Plot(otherCompany.plot);
			properties = new Property[otherCompany.MAX_PROPERTY];;
		

	}

	/*
	 * Creates a property object by copying from another property and adds it to the "properties" array
	 * 
	 * returns -1 if the array is full/returns -2 if the property object is null
	 * return -3 if the management company does not fit the plot
	 * return -4 if the property plot exceeds the plot
	 * 
	 * returns none of the previous cases and returns the index
	 */
	public int addProperty(Property property) {
		int num = -2;
		int num2 = -3;
		int num3 = -4;

		if (property == null) {
			return num;
		}

		if (!plot.encompasses(property.getPlot())) {
			return num2;
		}

		for (int i = 0; i < this.properties.length; i++) {
			if (properties[i] != null) {
				if (properties[i].getPlot().overlaps(property.getPlot())) {
					return num3;
				}
			}
			else {
				properties[i] = property;
				return i;
			}
		}

		return -1;
	}
	//** Returns the MAX_PROPERTY of the "properties" array */
	public int getMAX_PROPERTY() {
		return this.MAX_PROPERTY;
	}




	/*Creates a property object with default property objects, plot objects and add them all to the "properties" array */
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
	}

	//** Creates property objects to add them all to the "properties" array */
	public int addProperty(String name, String city, double rent, String owner) {
		
		return addProperty(new Property(name, city, rent, owner));
	}

	/* Displays property at index */
	public java.lang.String displayPropertyAtIndex(int indexvalues) {
		return (properties[indexvalues].toString()+"");
	}


	/*method finds the property within the properties array that has the maximum rent amount and returns the rent amount */
	public double maxRentProp() {
		if (this.properties[0] == null)
			return -1;
			
		double maxAmount = this.properties[0].getRentAmount();
		
		for(int i = 1; i < this.properties.length; i++) {
			if (this.properties[i] == null)
				return maxAmount;
			else if (this.properties[i].getRentAmount() > maxAmount)
				maxAmount = this.properties[i].getRentAmount();
		}
			
		return maxAmount; //if no null at end of array 
	}

	//** This method finds the index of the property with the maximum rent amount */
	public int maxRentPropertyIndex() {
		double maxAmount;
		int index = 0;
		for (int i = 0; i  < properties.length; i++) {
			if (properties[i] == null) {
				break;
			}

			switch (index) {
			case 4:
				maxAmount = properties[i].getRentAmount();
				index = i;
			}
		}
		return index;
	}

	

	//** This method accesses each "Property" object within the array "properties" and sums up the property rent and returns the total amount */
	public double totalRent() {
		
		double total = 0.0;
		int i = 0;
		
		while (i < properties.length && properties[i] != null) {
			total += properties[i].getRentAmount();
			i++;
		}
		return total;
	}

	
	public Plot getPlot() {
		
		return plot;
	}
	//** Displays the information in the "properties" array that is responsible for an output*/
		public java.lang.String toString() {
			
	String str = "";
	str = ("List of the properties for Alliance, taxID: " + taxID+"\n"+
	"__________________________________________________\n");

			
	for(int i = 0; i < MAX_PROPERTY; i++) {

			if(properties[i] != null)
				str += (" Property Name: " + properties[i].getPropertyName() +"\n" +
						"  Located in: " + properties[i].getCity() + "\n" + 
						"  Belong to: " + properties[i].getOwner() + "\n" + 
						"  Rent Amount: " + properties[i].getRentAmount()+"\n"); 

			}
			
			str += ("__________________________________________________\n"+"Total management Fee: " + mgmFeePer);
			
					return str;
		}
	
	public java.lang.String getName() {
		return name;
	}
}