package zadaci_04_02_2016;

/*
 * (Stopwatch) Design a class named StopWatch. The class contains:
 Private data fields startTime and endTime with getter methods.
 A no-arg constructor that initializes startTime with the current time.
 A method named start() that resets the startTime to the current time.
 A method named stop() that sets the endTime to the current time.
 A method named getElapsedTime() that returns the elapsed time for the
 stopwatch in milliseconds.
 */
public class treci {
	// Design a class named StopWatch
	public class StopWatch {
		// Private data fields startTime and endTime
		private long startTime;
		private long endTime;

		// A no-arg constructor that initializes startTime with the current time
		public StopWatch() {
			startTime = System.currentTimeMillis();
		}

		// A method named start() that resets the startTime to the current time
		public void start() {
			startTime = System.currentTimeMillis();
		}

		// A method named stop() that sets the endTime to the current time.
		public void stop() {
			endTime = System.currentTimeMillis();
		}

		// A method named getElapsedTime() that returns the elapsed time for the
		// stopwatch in milliseconds
		public long getElapsedTime() {
			return endTime - startTime;
		}

	}

}
