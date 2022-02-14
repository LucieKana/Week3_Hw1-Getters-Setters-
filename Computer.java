package week1Hw3;

public class Computer{
		private String name;
		private int year;
		private int cost;
	
	 //Getters
	 public String getName() {
		 return name;
	 }
	
	 public int getYear() {
		 return year;
	 }
	
	 public int getCost() {
		 return cost;
	 }
	// setters
	 public void setName(String name) {
		 this.name = name;
	 }
	 public void setYear(int year) {
		 this.year = year;
	 }
	 public void setCost(int c) {
		 this.cost = c;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Computer comp = new Computer();
      comp.setName("macbook");
      System.out.println(comp.getName());
	}

}
