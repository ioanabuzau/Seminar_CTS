package Classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the jungle!");
		
		Zoo zoo = new Zoo();
		Zookeeper keeper = new Zookeeper();
		keeper.setName("Mihai");
		zoo.setKeeper(keeper);
		
		Zebra zebra1 = new Zebra ("zebra 1");
		Zebra zebra2 = new Zebra ("zebra 2");
		
		keeper.feed(zebra2);
		
		Girafa girafa1 = new Girafa ("girafa 1");
		
		keeper.feed(girafa1);
		
	}

}
