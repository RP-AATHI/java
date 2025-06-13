package javadevelop;
import java.util.Arrays;
import java.util.Scanner;
public class Program4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int size = scanner.nextInt();
if (size <= 0) {
System.out.println("Invalid size. Please enter a positive integer.");
return;
}
int[] array = new int[size];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < size; i++) {
array[i] = scanner.nextInt();
}
int sum = 0;
for (int num : array) {
sum += num;
}
double average = (double) sum / size;
System.out.println("\nSum of array elements: " + sum);
System.out.println("Average of array elements: " + average);
int[] ascending = array.clone();
Arrays.sort(ascending);
int[] descending = array.clone();
Arrays.sort(descending);
for (int i = 0; i < descending.length / 2; i++) {
int temp = descending[i];
descending[i] = descending[descending.length - 1 - i];
descending[descending.length - 1 - i] = temp;
}


System.out.println("\nArray in ascending order: " + Arrays.toString(ascending));
System.out.println("Array in descending order: " + Arrays.toString(descending));
}
}

