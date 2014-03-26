/**
 * A student class made to represent a student object for the registrar3 simulation.
 *
 * @author Aaron Gerston
 */
public class student {
	private int enqueueTime;
	private int timeNeeded;
	private int dequeueTime;

	/**
	 * Constructs a student object
	 *
	 * @param int time - the amount of time this student needs at the help desk
	 * @param int arrivalTime - the time at which this student enters the queue
	 */
	public student(int time, int arrivalTime) {
		timeNeeded = time;
		enqueueTime = arrivalTime;
	}
	
	/**
	 * Sets the time at which the given student leaves the queue.
	 *
	 * @param int time - the time at which the student leaves the queue
	 */
	public void setDequeueTime(int time) {
		dequeueTime = time;
	}
	
	/**
	 * Fetches the time at which the student entered the queue
	 *
	 * @return int enqueueTime
	 */
	public int getEnqueueTime() {
		return enqueueTime;
	}
	
	/**
	 * Fetches the time at which the student leaves the queue
	 *
	 * @return int dequeueTime
	 */
	public int getDequeueTime() {
		return dequeueTime;
	}
	
	/**
	 * Fetches the amount of time the student needs at the help desk
	 *
	 * @return int timeNeeded
	 */
	public int getTimeNeeded() {
		return timeNeeded;
	}
	
	/**
	 * Returns a String containing information about enqueue time and time needed.
	 * Used mainly for debugging purposes.
	 */
	public String toString() {
		return new String("\tArrival time: "+enqueueTime+"\tTime needed: "+timeNeeded);
	}
}
