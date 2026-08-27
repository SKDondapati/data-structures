import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator<String> iterator = strings.listIterator();
        int count = 0;
        String first = "";
        while (iterator.hasNext()) {
            if (count == 0) {
                first = iterator.next();
            }
            count++;
        }
        iterator = strings.listIterator();
        iterator.next();
        iterator.remove();
        strings.addLast(first);
        String currValue = "";
        for (int i = 1; i < count; i++) {
            iterator = strings.listIterator();
            currValue = iterator.next();
            iterator.remove();
            strings.addLast(currValue);
        }
        System.out.println(strings);
    }
}