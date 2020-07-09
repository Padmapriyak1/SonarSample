
public class One {
  String message = "foo";

  public String foo() {
    return message;
  }

  public void uncoveredMethod() {
    System.out.println(foo());
    
   
  }
  
  public static class BMICalculator {
		
		private static final double BMI_THRESHOLD = 25.0;

		public static boolean isDietRecommended(double weight, double height) {
			if (height == 0.0) throw new ArithmeticException();
			double bmi = weight / (height * height);
			if (bmi < BMI_THRESHOLD)
				return false;
			return true;
	}
		
  }
  
}


		

