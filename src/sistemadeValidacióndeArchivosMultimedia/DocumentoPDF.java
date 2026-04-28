package sistemadeValidacióndeArchivosMultimedia;

public class DocumentoPDF extends Documento{

	@Override
	public boolean isValid() {
		return getSize() < 1048576;
	}

	public DocumentoPDF(long size) {
		super(size);
	}
	
}
