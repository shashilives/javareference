package problem.solving;

import java.util.Scanner;

public class SubStringProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String inputString = "aabcccabba";
        String inputString = "aabcccccabba";
        String part1 = inputString.substring(0, inputString.length() / 2);
        String part2 = inputString.substring(inputString.length() / 2, inputString.length());
        findMinSubString(part2.substring(part2.length() - 1).toCharArray()[0], part1, part2);
    }

    static void findMinSubString(char lastCharPart2, String part1, String part2) {
        System.out.println("part 1 = " + part1);
        System.out.println("part 2 = " + part2);
        System.out.println("Last char of part 2 - " + lastCharPart2);
        char[] part1Arr = part1.toCharArray();
        int substringcount = 0;
        for (int i = 0; i < part1Arr.length; i++) {
            if (part1Arr[i] == lastCharPart2) {
                substringcount++;
            } else {
                break;
            }
        }

        if (substringcount == 0) {
            System.out.println((part2 + part1).length());
        } else {
            String newPart1 = part1.substring(substringcount);
            System.out.println("new part 1 " + newPart1);

            char[] part2Arr = part2.toCharArray();
            int substringcount2 = 0;
            for (int i = part2Arr.length - 1; i >= 0; i--) {
                if (part2Arr[i] == lastCharPart2) {
                    substringcount2++;
                } else {
                    break;
                }
            }
            findMinSubString(part2.substring(part2.substring(0, part2.length() - substringcount2).length() - 1).toCharArray()[0], newPart1,  part2.substring(0, part2.length() - substringcount2));
        }


    }
}
