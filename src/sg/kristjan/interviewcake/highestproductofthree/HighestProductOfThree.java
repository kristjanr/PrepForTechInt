package sg.kristjan.interviewcake.highestproductofthree;

// https://www.interviewcake.com/question/java/highest-product-of-3
class HighestProductOfThree {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, -7, 3, -4};
        System.out.println(highestProduct(arr1));
    }

    private static long highestProduct(int[] arr) {
        long firstLowest = Integer.MAX_VALUE, secondLowest = Integer.MAX_VALUE;
        long firstHighest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE, thirdHighest = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > firstHighest) {
                thirdHighest = secondHighest;
                secondHighest = firstHighest;
                firstHighest = n;
            } else if (n > secondHighest) {
                thirdHighest = secondHighest;
                secondHighest = n;
            } else if (n > thirdHighest) {
                thirdHighest = n;
            }

            if (n < firstLowest) {
                secondLowest = firstLowest;
                firstLowest = n;
            } else if (n < secondLowest) {
                secondLowest = n;
            }
        }

        long productOfTwoNegativesAndAPositive = firstLowest * secondLowest * firstHighest;
        long productOfThreePositives = firstHighest * secondHighest * thirdHighest;

        return  Math.max(productOfTwoNegativesAndAPositive, productOfThreePositives);
    }
}