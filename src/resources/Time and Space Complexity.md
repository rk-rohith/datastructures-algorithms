# BigO cheatsheet
<img width="933" alt="image" src="https://github.com/rk-rohith/DSA/assets/88598718/87482242-1bef-49b1-bcae-8aea937bfd18">
<img width="934" alt="image" src="https://github.com/rk-rohith/DSA/assets/88598718/3d576c53-b501-4c76-873c-d87d1727b793">
<img width="603" alt="image" src="https://github.com/rk-rohith/DSA/assets/88598718/7d36f18a-71cd-44aa-8439-a6e8de2947d8">

### Big O notation is used to express the asymptotic behavior of a function. That means how the function behaves as it approaches infinity.

#### In many cases the "O" of an algorithm will fall into one of the following cases:

1. ##### O(1) - Time to complete is the same regardless of the size of input set. An example is accessing an array element by index. O(1), means your computer gets a task done with 1 step, it's excellent, Ordered No.1
2. ##### O(Log N) - Time to complete increases roughly in line with the log2(n). For example 1024 items takes roughly twice as long as 32 items, because Log2(1024) = 10 and Log2(32) = 5. An example is finding an item in a binary search tree (BST). O(logN), means your computer complete a task with logN steps, its good, Ordered No.2
3. ##### O(N) - Time to complete that scales linearly with the size of the input set. In other words if you double the number of items in the input set, the algorithm takes roughly twice as long. An example is counting the number of items in a linked list. O(N), finish a task with N steps, its fair, Order No.3
4. ##### O(N Log N) - Time to complete increases by the number of items times the result of Log2(N). An example of this is heap sort and quick sort.  O(NlogN), ends a task with O(NlogN) steps, it's not good, Order No.4
5. ##### O(N^2) - Time to complete is roughly equal to the square of the number of items. An example of this is bubble sort.  O(N^2), get a task done with N^2 steps, it's bad, Order No.5
6. ##### O(2^N), get a task done with 2^N steps, it's horrible, Order No.6
7. ##### O(N!) - Time to complete is the factorial of the input set. An example of this is the traveling salesman problem brute-force solution. O(N!), get a task done with N! steps, it's terrible, Order No.7
