
public class RocketCollector implements Collector{


	@Override
	public Iterator getIterator() {
		return new RocketIterator();
	}

}
