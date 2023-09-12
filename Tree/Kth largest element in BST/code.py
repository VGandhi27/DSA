class Solution:
    def kthLargest(self, root, k):
        self.result, self.node_count = None, 0
        self.traverse_and_find_kth_largest(root, k)
        return self.result

    def traverse_and_find_kth_largest(self, node, k):
        if not node:
            return

        # Traverse the right subtree first
        self.traverse_and_find_kth_largest(node.right, k)

        # Count the nodes as we traverse
        self.node_count += 1

        # Check if we've found the kth largest node
        if self.node_count == k:
            self.result = node.data

        # Continue traversing the left subtree
        self.traverse_and_find_kth_largest(node.left, k)
 
