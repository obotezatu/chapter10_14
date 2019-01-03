package chapter10_14;

public class PieceWorker extends Employee{
	
	private double wage;
	private long pieces;
	
	public PieceWorker(String firstName, String lastName,String socialSecurityNumber, double wage, long pieces) {
		
		super(firstName, lastName, socialSecurityNumber);

	      if (wage < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "Wage per piece must be >= 0.0");
	      
	      if (pieces < 0.0) // validate pieces
		         throw new IllegalArgumentException(
		            "Quantity of pieces must be >= 0.0");

	      this.wage = wage;
	      this.pieces = pieces;
	}
	
	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage < 0.0) // validate wage
	         throw new IllegalArgumentException(
	            "Wage per piece must be >= 0.0");

	      this.wage = wage;
	}

	public long getPieces() {
		return pieces;
	}

	public void setPieces(long pieces) {
	      if (pieces < 0.0) // validate pieces
		         throw new IllegalArgumentException(
		            "Quantity of pieces must be >= 0.0");
		this.pieces = pieces;
	}

	@Override
	public double earnings() {
		return getPieces() * getWage() ;
	}
	
	 @Override                                                             
	   public String toString()                                              
	   {                                                                     
	      return String.format("PieceWorker employee: %s%n%s: $%,.2f; %s: %d",
	         super.toString(), "Wage per piece", getWage(),                     
	         "Pieces", getPieces());                                   
	   }                      
}
