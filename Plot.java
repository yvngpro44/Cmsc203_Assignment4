public class Plot {
	private int x;
	private int y;
	private int width;
	private int depth;
	
	/*
	 * No-argument constructor with a default Plot x,y,width, and depth
	 */
	public Plot()
	{
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
		
	}
	/*
	 * Constructs a new object using the information of the object passed to it
	 
	 */
	public Plot(Plot p)
	{
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	
	/*
	 * Constructs a new object with the given x, y, width, and depth
	 */
	
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	/*
	 * Method checks if plot overlaps

	 */
	public boolean overlaps(Plot plot) {
		return x < plot.x + plot.width && x 
				+ width > plot.x && y < plot.y + plot.depth && y + depth > plot.y;
	}
	/*
	 * Method checks if plot is within the current plot bounds
	
	 */
	public boolean encompasses(Plot plot) {
		boolean encompass = false;
		
		double widthTotal = x + width;
		int access = 115;
		double depthTotal = y + depth;
		double RepresentX = plot.getX()+plot.getWidth();
		double RepresentY = plot.getY() + plot.getDepth();
		
		int TotalPlot;
		do {
		if (this.x<=plot.getX() && plot.getX()<=RepresentX && this.y<=plot.getY() && plot.getY()<=depthTotal 
				&& this.x<=RepresentX && RepresentX<=widthTotal
				&& this.y<=RepresentY  && RepresentY <= depthTotal) {
			encompass = true;
		}
	
		return encompass;
		}while (access == TotalPlot);
	}
	/**
	 * To String
	 * @return string
	 */
	public String toString()
	{
	return "Upper left: (" + this.x + "," + this.y + "); Width: " 
			+ width + " Depth: " + depth;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getX()
	{
		return x;
	}
	
	/*
	 * Gets depth/sets depth
	 */
	public int getDepth()
	{
		return depth;
	}
	public void setDepth(int depth)
	{
		this.depth = depth;
	}	
	/*
	 * Sets y
	 */
	public void setY(int y)
	{
		this.y = y;
	}
	
	public int getY()
	{
		return y;
	}

	
	public int getWidth()
	{
		return width;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	
}
