public class App {
    public static void main(String[] args) throws Exception {
        double resultCheck = valueFromWord("four");
        System.out.println(resultCheck);
    }

    static double valueFromWord(String workString) {
        String[] numberWords = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", };
        double initialValue = 0;
        for (int i = 0; i < numberWords.length; i++) {
            if (workString.equals(numberWords[i])) {
                initialValue = i + 1;
            }
        }
        return initialValue;
    }
}