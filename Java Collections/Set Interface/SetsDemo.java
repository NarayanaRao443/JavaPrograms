//package Set Interface;

// Set ---->
/*  1) HashSet --> Non Syncrhonized...Not Thread safe
                    i) HashSet values are stored in HashTable... it is called as hashing
                    ii) Initial capacity is 16. capacity is double after size is full.
                    iii) load factor is 0.75 is nothing but 75%

            methods we used
            add(), remove(), contains(), isEmpty(), size(), clear()
// 2) LinkedHashSet
                i) LinkedHashSet values are stored in Hashtable and doubleLinkedList
                i) Doesn't allows duplicate values
                ii) displayed as Insertion order 
// 3) TreeSet
                i) Doesn't allows duplicate values
                ii) sorting like ascending order 

    // Elements are not displayed in order.
    // Doesn't allows the duplicate values
    // Once the output prints then that output is repeated because of the hashcode.
*/
/* 
                            List    |  Set
                        |           |
1) Insertion order      |    Yes    |  No 
2) Duplicate values     |    Yes    |  No(Uinque values only)
3) Index position based |    Yes    |  No

*/

/*
|---------------|--------------------------|-----------------------------------------|------------------------|
|               |  HashSet                 |        LinkedHashSet                    |       TreeSet          |
|---------------|--------------------------|-----------------------------------------|------------------------|
|               |                          |                                         |                        |
| Order         |  unordered               |            Order                        |  sort(ascending order) |
| duplicates    |      no                  |            no                           |         no             |
| Syncrhonized  |      no                  |            no                           |         no             |
| datastructure |   hashtable              |        hastable + doubleLinkedList      |         balancedTree   |  
| capacity      |    16                    |            16                           |         --(no)         |
|---------------|--------------------------|-----------------------------------------|------------------------|
*/