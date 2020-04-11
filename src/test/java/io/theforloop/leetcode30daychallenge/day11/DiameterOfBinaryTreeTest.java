package io.theforloop.leetcode30daychallenge.day11;

import io.theforloop.leetcode30daychallenge.DataStructures.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Shubham
 */
class DiameterOfBinaryTreeTest {

    @Test
    void diameterOfBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int expRes = 3;
        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();
        int res = diameterOfBinaryTree.diameterOfBinaryTree(root);
        assertEquals(expRes,res);
    }
}