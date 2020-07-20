package lab2;

public class Image implements Gallery {
	private String sourceFile;
	private double size;//size is in bytes
	private int height;
	private int width;
	private String qualityOfImage;
	
	//total time taken based on the size of the file
	@Override
	public double timeToDownload(double bps) {
		// TODO Auto-generated method stub
		return size/bps;
	}

	@Override
	public boolean isSmallerThan(int maxSize) {
		return size < maxSize;
		// TODO Auto-generated method stub
	}
	
	@Override
	public boolean isSameName(String name) {
		// TODO Auto-generated method stub
		return name == sourceFile;
	}

	public String getSourceFile() {
		return sourceFile;
	}

	public void setSourceFile(String sourceFile) {
		this.sourceFile = sourceFile;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getQualityOfImage() {
		return qualityOfImage;
	}

	public void setQualityOfImage(String qualityOfImage) {
		this.qualityOfImage = qualityOfImage;
	}

	


}
