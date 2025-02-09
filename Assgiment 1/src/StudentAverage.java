
public class StudentAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The six test scores and their respective weights are given in the following
		 * format:
		 * 
		 * 75 0.10 95 0.20 85 0.25 55 0.25 65 0.10 70 0.10 The six assignment scores and
		 * their respective weights are given in the following format:
		 * 
		 * 55 0.05 65 0.10 65 0.15 60 0.25 55 0.25 50 0.20
		 * 
		 */

		int t_score1, t_score2, t_score3, t_score4, t_score5, t_score6;

		t_score1 = 75;
		t_score2 = 95;
		t_score3 = 85;
		t_score4 = 55;
		t_score5 = 65;
		t_score6 = 70;

		float t_weight1, t_weight2, t_weight3, t_weight4, t_weight5, t_weight6;

		t_weight1 = 0.10f;
		t_weight2 = 0.20f;
		t_weight3 = 0.25f;
		t_weight4 = 0.25f;
		t_weight5 = 0.10f;
		t_weight6 = 0.10f;

		float t_WeightTotal = t_weight1 + t_weight2 + t_weight3 + t_weight4 + t_weight5 + t_weight6;

		/*
		 * So what I just did was set the values for each test score and test weighted
		 * value. since the formula for weighted average (Weigted Averag = sum (x1w1 +
		 * x2w2 +...+xNwN)/ sum(wN)) I went ahead and also calculated the weight total.
		 * The next step is multiplying the scores with its designated weight and the
		 * adding them together.
		 */

		float T_VALUE = (float) (t_score1 * t_weight1) + (t_score2 * t_weight2) + (t_score3 * t_weight3)
				+ (t_score4 * t_weight4) + (t_score5 * t_weight5) + (t_score6 * t_weight6);

		int T_WeightedAverage = (int) (T_VALUE / t_WeightTotal);

		/*
		 * I first made sure the T_VALUE variable had the same data type whilst
		 * calculating its value. then I also converted the value of the result back to
		 * an integer. Just to make sure I get the weighted average in a its integer
		 * form as we initially had.
		 */
		// NOW LETS GET STARTED WITH THE ASSIGMENT PORTION OF THE CALCULATION

		int a_score1, a_score2, a_score3, a_score4, a_score5, a_score6;

		a_score1 = 55;
		a_score2 = 65;
		a_score3 = 65;
		a_score4 = 60;
		a_score5 = 55;
		a_score6 = 50;

		float a_weight1, a_weight2, a_weight3, a_weight4, a_weight5, a_weight6;

		a_weight1 = 0.05f;
		a_weight2 = 0.10f;
		a_weight3 = 0.15f;
		a_weight4 = 0.25f;
		a_weight5 = 0.25f;
		a_weight6 = 0.20f;

		float a_WeightTotal = a_weight1 + a_weight2 + a_weight3 + a_weight4 + a_weight5 + a_weight6;

		float A_VALUE = (float) (a_score1 * a_weight1) + (a_score2 * a_weight2) + (a_score3 * a_weight3)
				+ (a_score4 * a_weight4) + (a_score5 * a_weight5) + (a_score6 * a_weight6);

		int A_WeightedAverage = (int) (A_VALUE / a_WeightTotal);

		// Now it time for its final portion the Master Weighted Average.

		int M_WeightedAverage = (A_WeightedAverage + T_WeightedAverage) / 2; // I am still letting this number be an
																				// integer.

		System.out.println("This is the Weighted Test Average of the student is!!\n" + T_WeightedAverage);

		System.out.println("This is the Weighted Assigment Average!!\n" + A_WeightedAverage);

		System.out.println("And finally is the Master Weighted Average!!\n" + M_WeightedAverage);

		/*
		 * if you would like to test out my results visti this site:
		 * https://www.rapidtables.com/calc/math/weighted-average-calculator.html
		 */
	}

}
