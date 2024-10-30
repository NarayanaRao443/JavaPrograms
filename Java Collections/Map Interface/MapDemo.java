
// Map is an interface it has different type of classes. It is a key-value pair
        key must be Uinque value. but values can be duplicate
        if we put duplicate key then the the updated key-value pair will be print
        if we put duplicate value then there is no problem. It will executes with that particular key 
        we can use put() to add the key-value
        not follows the Insertion order
        prints the randomly
    i) HashMap
        i) It doesn't follows the order
        ii) prints randomly
        iii) capacity - 16
    ii) LinkedHashMap
        i)  follows the order
        ii) capacity - 16
    iii) TreeMap
        i) prints in ascending order
        ii) capacity -- nothing
    iv) HashTable
        i) prints in random order
        ii) capacity - 11

    put() it is used to add the key-value pairs
    remove() it is used to remove from the Map
    get("key") it is used to prints the value of the key. we need to pass the key.
    clear() it is used to remove all the elements
    size() returns the size of the Map
    isEmpty() returns true if the map is empty otherwise false
    keySet() returns the all keys 



|---------------|--------------------------|-----------------------------------------|------------------------|-----------------|
|               |  HashMap                 |        LinkedHashMap                    |       TreeMap          |   HashTable     |
|---------------|--------------------------|-----------------------------------------|------------------------|-----------------|
|               |                          |                                         |                        |                 |
| Order         |  unordered               |           Order                         | sort(ascending order)  | unordered       |
| duplicates    |      no                  |            no                           |         no             |   no            |
| Syncrhonized  |      no                  |            no                           |         no             |   yes           |
| datastructure |   hashtable              |        hastable + doubleLinkedList      |     red black Tree     |   hashtable     |
| capacity      |    16                    |            16                           |         --(no)         |    11           |
|---------------|--------------------------|-----------------------------------------|------------------------|-----------------|


Collections methods
---------------------

i) sort()
ii) reverse()
iii) swap()
iv) min()
v)  max() 

public class MapDemo {
    public static void main(String[] args) {

        
    }
}
