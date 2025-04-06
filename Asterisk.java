public class Asterisk {
    public static void main(String[] args) {
        int n = 4; // Total number of rows

        // Outer loop for the rows
        for (int i = 1; i <= n; ++i) {
            // Print leading spaces for center alignment
            for (int j = 1; j <= (n - i); ++j) {
                System.out.print(" "); // Spaces for alignment
            }

            // Inner loop for printing stars
            for (int k = 1; k <= (2 * i - 1); ++k) {
                System.out.print("*"); // Print stars followed by space
            }

            // Move to the next line after each row
            System.out.println();
        }
        for(int i =(n-1);i>=1;i--) {
        	for(int j=1;j<=(n-i);j++) {
        		System.out.print(" ");
        	}
        	for(int k=1;k<=(2*i-1);k++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }
}
