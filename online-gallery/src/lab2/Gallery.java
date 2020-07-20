package lab2;

public interface Gallery {


	/*
	 * Computes the time taken  to download a file
	 * according to connection speed
	 * @param bps connection byte per seconds
	 * <pre> bps positive double
	 * @return double 
	 */
	public double timeToDownload(double bps);
	
	/*
	 * determines whether if the file is smaller 
	 * than given maximum size
	 * @param maxSize maximum size that can be download
	 * @pre none
	 * @return boolean
	 */
	public boolean isSmallerThan(int maxSize);
	
	/*
	 * determines whether the name of a file is the same
	 * as some given name
	 * @param
	 * @pre none
	 * @return boolean
	 */
	public boolean isSameName(String name);
}
