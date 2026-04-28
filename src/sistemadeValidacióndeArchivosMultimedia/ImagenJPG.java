package sistemadeValidacióndeArchivosMultimedia;

public class ImagenJPG extends Imagen{

	@Override
	public boolean isValid() {
		return getWidth()*getHeight() < 5000000;
	}

	public ImagenJPG(int width, int height) {
		super(width, height);
	}
	
}
