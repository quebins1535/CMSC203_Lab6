/**
 * The purpose of this class, is to model a television
 * Kevin Sobalvarro
 * April 3, 2023
 */

public class Television {
	
	private String MANUFACTURER;
	private int SCREEN_SIZE;
	private boolean powerOn;
	private int channel;
	private int volume;

	/**
	 * This constructor will accept the name of the brand and size, 
	 * and make a new object with that information.
	 * @param brand is the manufacturer's brand
	 * @param size is the screen size
	 */
	public Television(String brand, int size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;		
	}
	
	/**
	 * This method will set the channel using the station
	 * @param station is the channel
	 */
	public void setChannel(int station) {
		channel = station;
	}
	
	/**
	 * This method will turn on and off the television
	 */
	public void power() {
		powerOn = !powerOn;
	}
	
	/**
	 * This method will increase the volume by 1.
	 */
	public void increaseVolume() {
		volume++;
	}
	
	/**
	 * This method will decrease the volume by 1.
	 */
	public void decreaseVolume() {
		volume--;
	}
	
	/**
	 * This method will return the current channel that TV is on.
	 * @return the current channel
	 */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * This method will return the current volume set on the TV.
	 * @return the current volume
	 */
	public int getVolume() {
		return volume;
	}
	
	/**
	 * This method will return the TV's manufacturer.
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	/**
	 * This method will return the screen size of the TV.
	 * @return the screen size
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
}