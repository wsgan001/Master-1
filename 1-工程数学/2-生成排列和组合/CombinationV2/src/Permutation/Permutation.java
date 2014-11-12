package Permutation;
/** User: Yang Wenjing
 * Date: 13-11-28
 * Time: 下午9:45
 */
public class Permutation {
    public static void permutate(String text) {
        permutate(text.toCharArray(), 0, text.length());
    }

    static void permutate(char[] array, int current, int length) {
        if (current == length) {
            print(array);
            return;
        }
        for (int i = current; i < length; ++i) {
            swap(array, current, i);
            permutate(array, current + 1, length);
            swap(array, current, i);
        }
    }

    static void swap(char[] array, int first, int second) {
        char temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    static void print(char[] array) {
        for (char c : array)
            System.out.print(c);
        System.out.println();
    }
}
