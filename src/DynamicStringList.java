public class DynamicStringList implements StringList {
    public String[] arr;
    public int acutalLength = 0;

    public DynamicStringList() {
        arr = new String[10];
    }

    /**
     * Retrieves the string at the specified index in the list.
     *
     * @param index the index of the string to retrieve.
     * @return the string at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or
     *                                   index >= size()).
     */
    public String get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    /**
     * Replaces the string at the specified index with the given value.
     *
     * @param index the index of the string to replace.
     * @param value the new value to set at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or
     *                                   index >= size()).
     */
    public void set(int index, String value) {

    }

    /**
     * Adds a new string to the end of the list.
     *
     * @param value the string to add to the list.
     */
    public void add(String value) {
        arr[acutalLength] = value;
        acutalLength++;
    }

    /**
     * Removes the string at the specified index from the list.
     *
     * @param index the index of the string to remove.
     * @return the string that was removed.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or
     *                                   index >= size()).
     */
    public String remove(int index) {
        return null;
    }

    /**
     * Returns the number of strings currently in the list.
     *
     * @return the size of the list.
     */
    public int size() {
        return acutalLength;
    }

    /**
     * Returns the current capacity of the list (i.e., the number of elements it can
     * hold before resizing).
     *
     * @return the capacity of the list.
     */
    public int capacity() {
        return -1;
    }
}
