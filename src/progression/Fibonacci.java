package progression;

public class Fibonacci {
	
	/**
	 * 배열의 피보나치 수열
	 * @return
	 */
	public int fibonacciArray() {
		
		int[] array = {5, 4, 3, 2, 1};
		int sum = 0;
		for(int num : array) {
			sum += num;
		}
		System.out.println(sum);
		return sum;
	}
	
	/**
	 * 입력받은 값의 피보나치 수열
	 * @param num
	 * @return
	 */
	public int fibonacci(int num) {
		
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum += num;
			num--;
		}
		return sum;
	}
	
	/**
	 * ���ȣ��-���丮�󿬻�
	 * @param num
	 * @return
	 */
	public int factorial(int num) {
		if(num > 1) {
			return factorial(num-1) * num;
		}else {
			return 1;
		}
	}
	
	
	
	
	
	
}
