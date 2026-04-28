package sistemadeValidacióndeArchivosMultimedia;

public abstract class Imagen implements Validable{

	private int width;
	private int height;
	
	@Override
	public abstract boolean isValid();

	public Imagen(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
