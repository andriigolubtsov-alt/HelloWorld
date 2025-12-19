import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTasks {
    public static void main(String[] args) {

        // 1) create new ArrayList, add some colors, print collection
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        System.out.println("1) Initial list: " + colors);

        // 2) iterate through all elements
        System.out.println("2) Iterate:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("   index " + i + " -> " + colors.get(i));
        }

        // 3) insert element at first position
        colors.add(0, "Yellow");
        System.out.println("3) After insert at first position: " + colors);

        // 4) retrieve an element at specified index
        int indexToGet = 2;
        if (indexToGet >= 0 && indexToGet < colors.size()) {
            System.out.println("4) Element at index " + indexToGet + ": " + colors.get(indexToGet));
        } else {
            System.out.println("4) Index out of range: " + indexToGet);
        }

        // 5) update specific element by given element
        int indexToSet = 1;
        if (indexToSet >= 0 && indexToSet < colors.size()) {
            colors.set(indexToSet, "Purple");
            System.out.println("5) After update index " + indexToSet + ": " + colors);
        } else {
            System.out.println("5) Index out of range: " + indexToSet);
        }

        // 6) remove the third element (index 2)
        if (colors.size() > 2) {
            String removed = colors.remove(2);
            System.out.println("6) Removed 3rd element (" + removed + "): " + colors);
        } else {
            System.out.println("6) Not enough elements to remove the 3rd one.");
        }

        // 7) search an element in the array list
        String target = "Blue";
        int pos = colors.indexOf(target);
        if (pos != -1) {
            System.out.println("7) Found \"" + target + "\" at index " + pos);
        } else {
            System.out.println("7) \"" + target + "\" not found");
        }

        // 8) sort a given array list
        Collections.sort(colors);
        System.out.println("8) Sorted list: " + colors);

        // 9) copy one array list into another (clone)
        @SuppressWarnings("unchecked")
        ArrayList<String> copy = (ArrayList<String>) colors.clone();
        System.out.println("9) Copied list (clone): " + copy);

        // 10) reverse elements (Collections.reverse)
        Collections.reverse(colors);
        System.out.println("10) Reversed original list: " + colors);

        // 11) compare two array lists (equals)
        System.out.println("11) colors.equals(copy) = " + colors.equals(copy));

        // 12) empty an array list (clear)
        copy.clear();
        System.out.println("12) After clear(), copy: " + copy);

        // 13) test an array list is empty or not (isEmpty)
        System.out.println("13) copy.isEmpty() = " + copy.isEmpty());

        // 14) increase the size of an array list
        // В Java ArrayList "увеличить размер" можно, например, добавив элементы (или null-ы).
        while (colors.size() < 10) {
            colors.add("NewColor" + colors.size());
        }
        System.out.println("14) Increased size to 10 by adding elements: " + colors);

        // 15) trim the capacity to the current list size (trimToSize)
        colors.trimToSize();
        System.out.println("15) trimToSize() done. Final list: " + colors);
    }
}