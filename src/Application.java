/** CS300: Project 3
    Author: Austin Gray
    Date: 05/05/2020
 */

import java.io.*;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) throws IOException {
        ArrayList<Person> list = new ArrayList<Person>();
        MyMap<Integer, Person> map = new MyHashMap<>();

        BufferedReader br = new BufferedReader(new FileReader("src/person.csv"));
        String line;

        br.readLine();

        while((line = br.readLine()) != null) {
            String[] values = line.split(",");

            Person entry = new Person(Integer.parseInt(values[0]), values[1], values[2], Integer.parseInt(values[3]));
            list.add(entry);
        }

        for(Person p: list) {
            map.put(MyHashKey.getHashKey(p), p);
        }

        map.tableInfo();
        System.out.println("Entries in map:\n" + map);

        int searchKey = MyHashKey.getHashKey("Brown", "Evelyn");
        System.out.println((map.get(searchKey)).toString());

    }
}
