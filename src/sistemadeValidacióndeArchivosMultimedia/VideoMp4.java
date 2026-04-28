package sistemadeValidacióndeArchivosMultimedia;

public class VideoMp4 extends Video{

	@Override
	public boolean isValid() {
		return getLength() < 300;
	}

	public VideoMp4(int length) {
		super(length);
	}
	
}
