import java.util.Arrays;

public class AnagramChecker 
{
    public static void main(String[] args) 
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the strings anagrams? " + result);
    }
    public static boolean areAnagrams(String str1, String str2) 
    {
       if (str1.length() != str2.length()) 
       {
            return false;
       }

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}
