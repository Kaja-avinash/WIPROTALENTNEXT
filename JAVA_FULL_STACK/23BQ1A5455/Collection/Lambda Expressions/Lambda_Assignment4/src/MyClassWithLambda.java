public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc = (str) -> {

            if (str == null || str.trim().isEmpty()) {

                return 0;

            }

            return str.trim().split("\\s+").length;

        };

        String sentence = "Welcome to Wipro Java Full Stack";

        System.out.println("Sentence : " + sentence);

        System.out.println("Word Count : " + wc.count(sentence));

    }

}