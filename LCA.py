class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def rootToNodePath(self, node, data, ans):
        if node is None:
            return False
        if node == data:
            ans.append(node)
            return True

        res = self.rootToNodePath(node.left, data, ans) or self.rootToNodePath(node.right, data, ans)
        if res:
            ans.append(node)

        return res

    def lowestCommonAncestor(self, root, p, q):
        list1 = []
        list2 = []

        self.rootToNodePath(root, p, list1)
        self.rootToNodePath(root, q, list2)

        i = len(list1) - 1
        j = len(list2) - 1

        LCA = None

        while i >= 0 and j >= 0:
            if list1[i] != list2[j]:
                break

            LCA = list1[i]
            i -= 1
            j -= 1

        return LCA
