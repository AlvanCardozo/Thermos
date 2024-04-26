package exam_practice;
public class bottle {
	int avi_vol;
	String brand;
	String liquid;
	
	bottle(String brand){
		this.brand =  brand;
		this.liquid = liquid;
		this.avi_vol = 0;
	}
	
	void add_liquid(String liquid, int volume) {
		this.liquid =  liquid;
		avi_vol = avi_vol + volume;	
	}
	
	void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Liquid: " + liquid);
		System.out.println("Avilable volume: " + avi_vol);
		
	}
	
	public static void main(String [] args) {
		bottle mybottle = new bottle("Prime");
		mybottle.add_liquid("Juice",4);
		mybottle.display();
		
	}
}

