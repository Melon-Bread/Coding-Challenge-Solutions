class ArmstrongNumbers {
	boolean isArmstrongNumber(int numberToCheck) {
		int[] digits = new int[Integer.toString(numberToCheck).length()];
		int digitTotal = 0;

        for (int i = 0; i < digits.length; i++) {
            digits[i] = Character.getNumericValue(Integer.toString(numberToCheck).charAt(i));
            digitTotal += (int)Math.pow(digits[i], digits.length);
        }

        return digitTotal == numberToCheck;
	}
}
