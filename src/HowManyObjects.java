
public class HowManyObjects {

	static int count;
	
	HowManyObjects(){
		count++;
	}
	
	public static void main(String[] args) {
		HowManyObjects o=new HowManyObjects();
		HowManyObjects o1=new HowManyObjects();
		HowManyObjects o2=new HowManyObjects();
		System.out.println("No.of objects is created:"+count);
	}

}
