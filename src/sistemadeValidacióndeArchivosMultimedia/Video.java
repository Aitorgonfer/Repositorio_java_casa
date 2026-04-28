package sistemadeValidacióndeArchivosMultimedia;

public abstract class Video implements Validable{
	
	private int length;

	@Override
	public abstract boolean isValid();

	public Video(int length) {
		super();
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}
