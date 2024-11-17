package org.example;

import java.util.Arrays;

public class Main {
    public static int methodOne(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int methodTwo(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Массив пустой!");
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
    }

    public static boolean methodThree(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

package org.example;

import java.util.Arrays;

public class Main {
    public static int methodOne(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int methodTwo(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Массив пустой!");
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
    }

    public static boolean methodThree(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2, 3, 4};
        int[] arr2 = {2, 2, 0};
        int[] arr3 = {1, 3, 5};
        int[] arr4 = {1, 0, 0, 3};
        int[] arr5 = {};

        System.out.println(String.format("(%s) = %d", Arrays.toString(arr1), methodOne(arr1)));
        System.out.println(String.format("(%s) = %d", Arrays.toString(arr2), methodOne(arr2)));
        System.out.println(String.format("(%s) = %d", Arrays.toString(arr3), methodOne(arr3)));
        System.out.println(String.format("(%s) = %d", Arrays.toString(arr5), methodOne(arr5)));
        System.out.println(String.format("(%s) = %d", Arrays.toString(arr4), methodTwo(arr4)));
        System.out.println(String.format("(%s) = %s", Arrays.toString(arr3), methodThree(arr3)));
        System.out.println(String.format("(%s) = %d", Arrays.toString(arr2), methodOne(arr2)));
        System.out.println(String.format("(%s) = %d", Arrays.toString(arr3), methodOne(arr3)));




    }
}
}
