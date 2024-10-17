package Graph;

public class Celebrity_Problem {

	// Function to find the celebrity
	public static int findCelebrity(int[][] knows, int n) {
		int candidate = 0;

		// Step 1: Find a candidate for the celebrity
		for (int i = 1; i < n; i++) {
			if (knows[candidate][i] == 1) {
				candidate = i; // candidate cannot be celebrity if they know someone
			}
		}

		// Step 2: Verify the candidate
		for (int i = 0; i < n; i++) {
			if (i != candidate) {
				if (knows[candidate][i] == 1 || knows[i][candidate] == 0) {
					return -1; // Not a celebrity
				}
			}
		}
		return candidate; // Return the index of the celebrity
	}

	public static void main(String[] args) {
		// Given matrix
		int[][] knows = { { 0, 0, 1, 1 }, // v0
				{ 1, 0, 0, 1 }, // v1
				{ 1, 0, 0, 1 }, // v2
				{ 0, 0, 0, 0 } // v3
		};

		int n = knows.length;
		int celebrity = findCelebrity(knows, n);

		if (celebrity == -1) {
			System.out.println("No celebrity found.");
		} else {
			System.out.println("Celebrity is person: v" + celebrity);
		}
	}
}
