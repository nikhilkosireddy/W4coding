
public class RocketMainClass {
	 public static void main(String[] args) {
	      RocketCollector rocket = new RocketCollector();

	      for(Iterator iter = rocket.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Rocket Type: " + name);
	      } 	
	   }
}
