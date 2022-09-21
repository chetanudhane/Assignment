package day8.line_comparison;

public class LineComparison2 {

	private double x1;
	private double y1;
	private double x2;
	private double y2;

	public LineComparison2(double X1, double Y1, double X2, double Y2) {
		this.x1 = X1;
		this.y1 = Y1;
		this.x2 = X2;
		this.y2 = Y2;
	}

	public double calculate_length() {
		double LengthOfLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return LengthOfLine;
	}

	static void check_Equality(Double lengthOfline_1, Double lengthOfline_2) {
		if (lengthOfline_1.equals(lengthOfline_2)) {
			System.out.println("Both the lines are equal");
		} else
			System.out.println("Both the lines are not equal");
	}

	public static void main(String[] args) {

		LineComparison2 line1 = new LineComparison2(15, 12, 22, 24);
		double lengthOfline_1 = line1.calculate_length();
		System.out.println("Length of Line one is : " + lengthOfline_1);

		LineComparison2 line2 = new LineComparison2(16, 22, 24, 16);
		double lengthOfline_2 = line2.calculate_length();
		System.out.println("Length of Line two is : " + lengthOfline_2);
		LineComparison2.check_Equality(lengthOfline_1, lengthOfline_2);
	}

}
