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
            } else {
                iterator.next();
            }
            count++;
        }

        iterator = strings.listIterator();
        iterator.next();
        iterator.remove();
        String currValue = "";
        for (int i = 0; i < count-1; i++) {
            for (int j = 0; j < i-1; j++) {
                iterator.next();
            }
            currValue = iterator.next();
            iterator.remove();
            iterator = strings.listIterator();
            iterator.add(currValue);
        }
        while (iterator.hasNext()) {
            iterator.next();
        }
        iterator.add(first);
    }
}