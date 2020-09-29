
public class Buffonsneedle {
	
	public static void main(String[] args) {
		
		needleSimulation(10000000);
		
	}
	
	public static void needleSimulation(int iterations) {
		
		double successCount = 0;
		
		for (int i = 1; i <= iterations; i++) {
			
			double distanceToLine = 2 * Math.random();
			
			double angleToLine = Math.PI * Math.random();
			
			if (distanceToLine <= Math.sin(angleToLine)) {
				
				successCount = successCount + 1;
				
			}
			
		}
		
		if (successCount > 0) {
			
			double result = iterations / successCount;
			
			System.out.print("Computation: " + iterations + " / " 
						+ successCount + "\n" + "Estimate of Pi: " + result);
			
		}
		
		else {
			
			System.out.print("Successcount = 0");
			
		}
		
	}

}
