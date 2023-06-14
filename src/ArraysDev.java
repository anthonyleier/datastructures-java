import java.util.Arrays;

public class ArraysDev {
    public static void main(String[] args) {
        int[] numbers = {23,32,12,56,78,98,234,452,429,530,1,5,7,8};
        String[] names = {"Anthony", "Luiz", "Wendel", "Marilia"};

        int item1 = numbers[3];
        int item2 = numbers[7];
        System.out.println(item1 + item2);
        System.out.println(numbers.length);

        for (String name : names) {
            System.out.println(name);
        }

        int[][] matrix = {{1,2},{3,4},{5,6}};
        int item3 = matrix[2][1];
        System.out.println(item3);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers,98);
        System.out.println(index);

        int[] numbers2 = Arrays.copyOf(numbers, numbers.length+1);
        System.out.println(Arrays.equals(numbers, numbers2));
    }
}
