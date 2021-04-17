package ru.com.anton;

public interface Serviceble {
	public abstract boolean IsreadyToService();
	public int getDistanceOnServise();
	public void addDistance(int additionalDistance);
	public void addDistance(double additionalDistance);
}
