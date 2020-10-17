/** CS300: Project 3
    Author: Austin Gray
    Date: 05/05/2020
 */

public class MyHashKey {
    /**Hash method for creating key using Person object*/
    public static int getHashKey(Person p) {
        int lkey = keyCalc(p.getLastName().toCharArray());
        int fkey = keyCalc(p.getFirstName().toCharArray());

        return lkey * fkey;
    }

    /**Hash method for creating key for search purposes using first and last name*/
    public static int getHashKey(String lastName, String firstName) {
        int lkey = keyCalc(lastName.toCharArray());
        int fkey = keyCalc(firstName.toCharArray());

        return lkey * fkey;
    }

    /**Algorithm for creating key*/
    public static int keyCalc(char[] arr) {
        int b = 41;
        int key = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            char s0 = arr[i];
            char s1 = arr[i + 1];
            char s2 = arr[i + 2];

            key += ((s0 * b + s1) * b + s2) * b;
        }
        return (key * (b + arr[arr.length - 1]));
    }
}
