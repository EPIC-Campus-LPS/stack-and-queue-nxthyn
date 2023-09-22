import java.util.NoSuchElementException; // for throwing errors

/**********
 *
 * @author Nathan Hoehndorf
 * @version 1.0 -- September 22, 2023
 *
 **********/
public class Queue {

    private static int[] array; // array used for storing data structure information

    /**
     *
     * @param arr
     * initializes the array
     *
     */
    public Queue(int[] arr) {

        array = arr;

    }

    /**
     *
     * @param element
     * adds element to the end of the Queue
     * Runtime: O(n)
     *
     */
    public void add(int element) {

        int[] newArray = new int[array.length+1]; // array to replace old one
        // fills new array with old array values
        System.arraycopy(array, 0, newArray, 0, array.length);

        newArray[newArray.length-1] = element; // fills last spot with new element
        array = newArray;

    }

    /**
     *
     * @return first element
     * Removes the head of the Queue and then removes it
     * Runtime: O(1)
     *
     */
    public int remove() {

        try { // in the case the Queue has values

            int var = array[0]; // saves head
            array = reduceSize(); // removes head  and creates new array
            return var; // returns head

        } catch (ArrayIndexOutOfBoundsException e) { // in the case that the Queue is empty

            throw new NoSuchElementException();

        }

    }

    /**
     *
     * @return new array for remove() method
     * Runtime: O(n)
     *
     */
    private int[] reduceSize() {

        int[] newArray = new int[array.length-1];
        System.arraycopy(array, 1, newArray, 0, array.length - 1);

        return newArray;

    }

    /**
     *
     * @return head of Queue
     * returns the head of the Queue in the case that it is not empty
     * Runtime: O(1)
     *
     */
    public int peek() {

        try { // in the case that the Queue is not empty

            return array[0];

        } catch (ArrayIndexOutOfBoundsException e) { // in the case that the Queue is empty

            throw new NoSuchElementException();

        }

    }

    /**
     *
     * @return size of Queue
     * Runtime: O(1)
     *
     */
    public int size() {

        return array.length;

    }

    /**
     *
     * @return whether Queue is empty
     * Runtime: O(1)
     *
     */
    public boolean isEmpty() {

        return array.length == 0;

    }

}
