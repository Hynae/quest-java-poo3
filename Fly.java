
public interface Fly {
	void takeOff();
	int ascend (int meters);
	int descend (int meters);
	void land ();
	static void glide() {System.out.println("It glides into the air");
	}
}
