package day8.line_comparison;

public class LineComparison3 {

	private double x1;
	private double y1;
	private double x2;
	private double y2;

	public LineComparison3(double X1, double Y1, double X2, double Y2) {
		this.x1 = X1;
		this.y1 = Y1;
		this.x2 = X2;
		this.y2 = Y2;
	}

	public double calculate_length() {
		double LengthOfLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return LengthOfLine;
	}

	static void compare_Lines(Double lengthOfline_1, Double lengthOfline_2) {
		int value = lengthOfline_1.compareTo(lengthOfline_2);

		if (value < 0) {
			System.out.println("Line one is Smaller then Line two");
		} else if (value > 0) {
			System.out.println("Line one is Larger then Line two");
		} else {
			System.out.println("Both Lines are equal");
		}
	}

	public static void main(String[] args) {

		LineComparison3 line1 = new LineComparison3(15, 12, 22, 24);
		double lengthOfline_1 = line1.calculate_length();
		System.out.println("Length of Line one is : " + lengthOfline_1);

		LineComparison3 line2 = new LineComparison3(16, 22, 24, 16);
		double lengthOfline_2 = line2.calculate_length();
		System.out.println("Length of Line two is : " + lengthOfline_2);
		LineComparison3.compare_Lines(lengthOfline_1, lengthOfline_2);

	}

}
