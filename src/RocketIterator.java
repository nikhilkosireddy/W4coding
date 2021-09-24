
public class RocketIterator implements Iterator {
    public String type[] = {"Hobby" , "Professional"};
	int pos;
	
	@Override
	public Object next() {

		if(this.hasNext()) {return type[pos++];}
		return null;
	}
	
	@Override
	public boolean hasNext() {
		if(pos < type.length)
		{
			return true;
		}

		return false;
	}
	
}
