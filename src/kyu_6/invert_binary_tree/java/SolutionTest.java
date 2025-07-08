package kyu_6.invert_binary_tree.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testFromExample() {
        TreeNode given = new TreeNode(4);
        given.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        given.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));

        TreeNode expected = new TreeNode(4);
        expected.right = new TreeNode(2, new TreeNode(3), new TreeNode(1));
        expected.left = new TreeNode(7, new TreeNode(9), new TreeNode(6));

        assertTreeEqual(expected, Solution.invertTree(given));
    }

    private void assertTreeEqual(TreeNode expectedTree, TreeNode userTree) {
        if (expectedTree == null || userTree == null) return;

        if ((expectedTree.left == null && userTree.left != null) || (expectedTree.left != null && userTree.left == null)) {
            assertFalse(true, "left null node and none null node found");
        }

        if ((expectedTree.right == null && userTree.right != null) || (expectedTree.right != null && userTree.right == null)) {
            assertFalse(true, "right null node and none null node found");
        }

        assertEquals(expectedTree.value, userTree.value, "values do not match");

        if (expectedTree.left != null) {
            assertTreeEqual(expectedTree.left, userTree.left);
        }

        if (expectedTree.right != null) {
            assertTreeEqual(expectedTree.right, userTree.right);
        }
    }
}

