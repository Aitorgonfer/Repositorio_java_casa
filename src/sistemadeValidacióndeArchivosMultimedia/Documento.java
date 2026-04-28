package sistemadeValidacióndeArchivosMultimedia;

public abstract class Documento implements Validable{
	
	private long size;

	@Override
	public abstract boolean isValid();

	public Documento(long size) {
		super();
		this.size = size;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}
	
}
