# DSA-Assignment
<h1>Bubble Sort Algorithm</h1>
Bubble sort is a sorting algorithm that compares a element to check if they are in order, if not these elements are switched. 

The next pair of elements are compared and we continue on that pattern until all elements are in order.

<h2>Uses of Bubble Sort</h2>
Educational Purposes: Bubble sort is a friendly introduction to sorting algorithms. It basically provides a foundation for learning more advanced algorithms.

Small Data Sets: Bubble sort can be suitable for sorting small arrays where efficiency is not the primary concern. 

Partially Sorted Data: If the input data is already partially sorted, bubble sort can can be an efficient choice. 

Implementation Comparison: Bubble sort can serve as a baseline for comparing the performance of other sorting algorithms. By comparing the execution times and complexities of advanced algorithms with bubble sort, developers can evaluate the effectiveness and efficiency of alternative sorting approaches. 

<h2>Disadvantages</h2>
Time Complexity: Bubble sort has a time complexity of O(n^2) where n is the number of elements in the list, which means  its performance deteriorates significantly as the size of the input data increases. For large data sets, bubble sort becomes very slow and impractical compared to more efficient sorting algorithms.

Inefficiency: Bubble sort performs a large number of comparisons and swaps, even for nearly sorted data. This makes it inefficient for data sets that are partially sorted as it will perform unnecessary comparisons and swaps.

<h2>Advantages</h2>
Simplicity: Bubble sort is one of the simplest sorting algorithms to understand and implement.

Easy to implement: Due to its simplicity, bubble sort is a popular choice for teaching sorting algorithms. It provides a good starting point for understanding the basic concepts of sorting.

<h1>Depth-First Search</h1>
It is a searching algorithm for traversing a tree or a graph data structure.
We can put it in three steps: 
1.Pick a route
2.Keep going until you reach a dead end or a previously visited node.
3.Backtrack to the last node that has unvisited adjacent neighbors.

<h2>Advantages of DFS</h2>
Requires less memory since it only stores stack of nodes on the path from root node to current node

It can find solution with examining much search space and stop once found.


<h2>Disadvantages of DFS</h2>
Depth First Search is not guaranteed to find the solution.

 DFS may take a long time to visit other neighbouring nodes if the depth of the tree is huge




