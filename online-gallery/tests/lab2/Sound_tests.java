package lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Sound_tests {

	@Test
	void testTimeToDownload() {
		Gallery aImage = new Sound("Track00", 1000,0);
		assertEquals(100,aImage.timeToDownload(10));
		
		Gallery bImage = new Sound("Track00",0,0);
		assertEquals(0,bImage.timeToDownload(0));
		
		Gallery cImage = new Sound("Track00",0,0);
		assertEquals(0,cImage.timeToDownload(10));

	}

	@Test
	void testIsSmallerThan() {
		Gallery aImage = new Sound("Track00", 1000,0);
		assertEquals(false,aImage.isSmallerThan(100));
		
		Gallery bImage = new Sound("Track01",0,0);
		assertEquals(true,bImage.isSmallerThan(100));
	}

	@Test
	void testIsSameName() {
		Gallery aImage = new Sound("Track00", 1000,0);
		assertEquals(true,aImage.isSameName("Track00"));
		
		Gallery bImage = new Sound("Track01", 1000,0);
		assertEquals(false,bImage.isSameName("Track00"));
	}

}
