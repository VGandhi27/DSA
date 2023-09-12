# Finding the Kth Largest Element in a Binary Search Tree
Binary Search Trees (BSTs) are a fundamental data structure in computer science, known for their efficient searching and sorting capabilities. One common task involving BSTs is finding the Kth largest element, which can be useful in various scenarios. In this article, we will discuss the problem of finding the Kth largest element in a BST, present an approach to solve it, provide optimized code, and analyze its time and space complexity.

 

## Problem Statement
Given a Binary Search Tree and a positive integer K, we are tasked with finding the Kth largest element in the BST.

 


Given a Binary Search Tree. Your task is to complete the function which will return the Kth largest element without doing any modification in Binary Search Tree.

![image](https://github.com/VGandhi27/Data_Structures/assets/93124166/2f172462-268e-4d85-82ef-52ce776ac8f2)

Your Task:
You don't need to read input or print anything. Your task is to complete the function kthLargest() which takes the root of the BST and an integer K as inputs and returns the Kth largest element in the given BST.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(H) where H is the max recursion stack of height H at a given time.

Constraints:
1 <= N <= 105
1 <= K <= N


## Link : [Kth largest element in BST](https://practice.geeksforgeeks.org/problems/kth-largest-element-in-bst/1)



## Approach
To find the Kth largest element in a BST, we can perform a reverse in-order traversal of the tree. In a normal in-order traversal, we visit nodes in ascending order (left, root, right). However, in a reverse in-order traversal, we visit nodes in descending order (right, root, left).

Here is how the approach works:
1. Initialize a result variable to store the Kth largest element and a node_count variable to keep track of the number of nodes visited.
2. Start the reverse in-order traversal from the right subtree.
3. While traversing, increment the node_count with each visited node.
4. When the node_count becomes equal to K, set the result to the value of the current node. This means we have found the Kth largest element.
5. Continue the traversal to the left subtree.


## Code : [Solution](https://github.com/VGandhi27/Data_Structures/blob/main/Tree/Kth%20largest%20element%20in%20BST/code.py) 
 
