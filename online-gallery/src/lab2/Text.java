package lab2;

public class Text implements Gallery {
	private String sourceFile;
	private double size;
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

	public int getNumOfLines() {
		return numOfLines;
	}

	public void setNumOfLines(int numOfLines) {
		this.numOfLines = numOfLines;
	}

	private int numOfLines;

	@Override
	public double timeToDownload(double bps) {
		// TODO Auto-generated method stub
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



}
