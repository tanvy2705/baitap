public class main27 {
        public static void main(String[] args) {
            // Create two points
            MyPoint p1 = new MyPoint(1, 2);
            MyPoint p2 = new MyPoint(4, 6);

            // Create a line using these two points
            MyLine line1 = new MyLine(p1, p2);

            // Output details of the line
            System.out.println(line1); // MyLine[begin=(1,2), end=(4,6)]

            // Display line length and gradient
            System.out.println("Length of line: " + line1.getLength());  // Should return 5.0 (calculated using the distance formula)
            System.out.println("Gradient of line: " + Math.toDegrees(line1.getGradient()));  // Should return the gradient in degrees
            // Check the new length and gradient
            System.out.println("Updated length: " + line1.getLength());  // Should return new length
            System.out.println("Updated gradient: " + Math.toDegrees(line1.getGradient()));  // Updated gradient in degrees
        }
    }
