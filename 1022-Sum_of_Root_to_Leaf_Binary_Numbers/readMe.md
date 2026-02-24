# 🌳 1022. Sum of Root To Leaf Binary Numbers

> Difficulty: Easy  
> Platform: LeetCode  

---

## 🧩 Problem Statement

You are given the `root` of a binary tree where each node has a value `0` or `1`.

Each root-to-leaf path represents a binary number starting with the most significant bit.

For example:

If the path is:

0 → 1 → 1 → 0 → 1

It represents binary `01101`, which equals **13** in decimal.

Return the **sum of all root-to-leaf binary numbers**.

The test cases are generated so that the answer fits in a 32-bit integer.

---

## 🖼 Example 1

![Binary Tree Example](https://assets.leetcode.com/uploads/2019/04/04/sum-of-root-to-leaf-binary-numbers.png)

### Input
root = [1,0,1,0,1,0,1]

### Output
22

### Explanation

Root-to-leaf paths:

- 1 → 0 → 0 = 100₂ = 4
- 1 → 0 → 1 = 101₂ = 5
- 1 → 1 → 0 = 110₂ = 6
- 1 → 1 → 1 = 111₂ = 7

Final Sum:

4 + 5 + 6 + 7 = **22**

---

## 🖼 Example 2

### Input
root = [0]

### Output
0

---

## 🚀 Approach

We use **DFS traversal**.

While traversing the tree:

- Build the binary number using:
  
  current = current * 2 + node.val

- When we reach a leaf node:
  - Add the number to the total sum

Why multiply by 2?

Because shifting a binary number left by 1 is equivalent to multiplying by 2.

---