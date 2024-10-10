import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    private static TreeMap<Integer, String> romanMap = new TreeMap<>();
    static {
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int nb = s.nextInt();
        System.out.println(convertToRoman(nb));
        s.close();
    }

    private static String convertToRoman(int nb) {
        int romanVal =  romanMap.floorKey(nb);
        if ( nb == romanVal ) return romanMap.get(nb);
        return romanMap.get(romanVal) + convertToRoman(nb-romanVal);
    }
}