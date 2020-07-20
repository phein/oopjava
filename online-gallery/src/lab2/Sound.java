package lab2;

public class Sound implements Gallery{
	private String sourceFile;
	protected double size;
	private double timeInSeconds;

	public Sound(String sourceFile, double size, double timeInSeconds) {
		this.sourceFile = sourceFile;
		this.size = size;
		this.timeInSeconds = timeInSeconds;
	}

	@Override
	public double timeToDownload(double bps) {
		// TODO Auto-generated method stub
		if (bps == 0) {
			return 0;
		}
		return size/bps;
	}

	@Override
	public boolean isSmallerThan(int maxSize) {
		// TODO Auto-generated method stub
		return size < maxSize;
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

	public double getTimeInSeconds() {
		return timeInSeconds;
	}

	public void setTimeInSeconds(double timeInSeconds) {
		this.timeInSeconds = timeInSeconds;
	}



}
