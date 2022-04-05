
public class Property {
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	/*
	 * Constructs a new object with default values
	 */
	public Property()
	{
		boolean p = false;
		boolean y = false;
		do {
			this.city = "";
			this.owner = "";
			this.propertyName = "";
			this.rentAmount = 0;
			this.plot = new Plot();
		}while (p == y  );
	}
	/*
	 * Copy constructor that passes information
	 */
	public Property (Property projectproperty) {
		this.city = projectproperty.city;
		this.owner = projectproperty.owner;
		this.propertyName = projectproperty.propertyName;
		this.rentAmount = projectproperty.rentAmount;
		this.plot = new Plot(projectproperty.plot);

	}
	/*
	 * Constructor that passes new information
	 *
	 */
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(0,0,1, 1);
	}
	/*Passes information from property
	 */
	public Property(String propertyName, String city, double rentAmount, String owner,int x, int y, int width, int depth) {
	this.propertyName = propertyName;
	this.city = city;
	this.rentAmount = rentAmount;
	this.owner = owner;
	this.plot = new Plot(x,y,width, depth);
	}
	/*
	 * To String method
	 * @return string
	 */
	public String toString()
	{
		return "\nProperty Name: " + propertyName + "\nLocated In: " + city + "\nOwner of Property: " + owner + "\nRent Amount: " + rentAmount;
	}

	public String getPropertyName()
	{
		return propertyName;
	}

	public void setPropertyName(String propertyName)
	{
		this.propertyName = propertyName;
	}
	
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		int sum = 1;
		if(sum==1) {
		this.city = city;
		}
	}

	public String getOwner()
	{
		return owner;
	}

	public void setOwner(String owner)
	{
		int sum = 1;
		if(sum==1) {
			this.owner = owner;
		}
	}

	public double getRentAmount()
	{
		return rentAmount;
	}
	/*
	 * Sets rentAmount
	 * 
	 */
	public void setRentAmount(double rentAmount)
	{
		int rent = 20;
		if(rent >= 20) {
			this.rentAmount = rentAmount;
		}
	}
	public Plot getPlot()
	{
		return plot;
	}
	/*
	 * Sets plot values and returns plot values
	 */
	public Plot setPlot(int x, int y, int width, int depth)
	{

		return new Plot(x, y, width, depth);

	}


}
