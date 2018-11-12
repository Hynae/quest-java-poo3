public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;
  

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }
    
    public void takeOff() {
    	altitude = 100;
    	System.out.println(this.getName()+ "takes off in the sky");
    	
    }
    
    public void glide() {
	}
    
    public int ascend (int meters) {
    	altitude = altitude+meters;
    	System.out.println(this.getName() + "flies upward, altitude : " + meters);
    	return altitude;
    }
    
    public void land() {
    	altitude = 0;
    	System.out.println(this.getName() + "lands on the ground");
    	
    }
    
    public int descend (int meters) {
    	altitude = meters - meters;
    	System.out.println(this.getName() +  "flies downward, altitude : " + meters);
    	return altitude;
    }
    
    
    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}
