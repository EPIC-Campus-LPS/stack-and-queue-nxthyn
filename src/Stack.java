import java.util.EmptyStackException;

/**********
 *
 * @author Nathan Hoehndorf
 * @version 1.0 -- September 22, 2023
 *
 **********/
public class Stack {

    private static int[] array; // way of storing Stack's data

    /**
     *
     * @param arr
     * initializes the array
     *
     */
    public Stack(int[] arr) {

        array = arr;

    }

    /**
     *
     * @param element
     * Adds the element passed as the first element of the Stack
     * Runtime: O(n)
     *
     */
    public void push(int element) {

        int[] newArray = new int[array.length+1]; // new array that will replace old

        // fills the array with the same values
        System.arraycopy(array, 0, newArray, 1, array.length);

        newArray[0] = element; // finishes the array by adding the element into the first index
        array = newArray; // sets the array equal to the new array

    }

    /**
     *
     * @return the first element
     * Removes the top of the stack and then returns it
     * Runtime: O(1)
     *
     */
    public int pop() {

        try { // in the case that the array is at least 1-element long

            int value = array[0]; // assigns value to variable so it can be removed
            array  = reduceSize(); // calls helper method to remove the first index
            return value; // returns the previously saved first element

        } catch (ArrayIndexOutOfBoundsException e) { // in the case the array is length 0

            throw new EmptyStackException();

        }

    }

    /**
     *
     * @return new array
     * Eliminates the first element of the array, and creates a new array that is one index smaller
     * Runtime: O(n)
     *
     */
    private int[] reduceSize() {

        int[] newArray = new int[array.length-1]; // new array that will be returned
        // fills array with previous values except first element
        System.arraycopy(array, 1, newArray, 0, array.length - 1);

        return newArray; // returns new array

    }

    /**
     *
     * @return first element
     * Returns the first element of the array if the length is at least 1
     * Runtime: O(1)
     *
     */
    public int peek() {

        try { // in the case the length is at least 1

            return array[0]; // returns first element

        } catch (ArrayIndexOutOfBoundsException e) { // in the case the length is 0

            throw new EmptyStackException();

        }

    }

    /**
     *
     * @return length of array
     * Runtime O(1)
     *
     */
    public int size() {

        return array.length;

    }

    /**
     *
     * @return whether array is empty
     * Checks if the length is 0, if so, isEmpty is true, otherwise it is false
     * Runtime: O(1)
     *
     */
    public boolean isEmpty() {

        return array.length == 0;

    }

}
