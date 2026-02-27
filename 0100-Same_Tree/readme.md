# 100. Same Tree

## 🟢 Easy

### 📘 Problem Statement

Given the roots of two binary trees `p` and `q`, write a function to check if they are the same or not.

Two binary trees are considered the same if:

- They are **structurally identical**
- The nodes have the **same values**

---

## 🖼️ Example 1

**Input:**

p = [1,2,3]
q = [1,2,3]


![Example 1](https://assets.leetcode.com/uploads/2020/12/20/ex1.jpg)

**Output:**

true


---

## 🖼️ Example 2

**Input:**

p = [1,2]
q = [1,null,2]


![Example 2](https://assets.leetcode.com/uploads/2020/12/20/ex2.jpg)

**Output:**

false


---

## 🖼️ Example 3

**Input:**

p = [1,2,1]
q = [1,1,2]


**Output:**

false


---

## 🔒 Constraints

- The number of nodes in both trees is in the range `[0, 100]`
- `-10^4 <= Node.val <= 10^4`

---

# 💡 Approach

### ✅ Recursive Comparison (DFS)

To check if two trees are the same:

1. If both nodes are `null` → return `true`
2. If one is `null` and the other is not → return `false`
3. If values are different → return `false`
4. Recursively check:
   - Left subtree
   - Right subtree

---

### ⏱ Complexity

- **Time Complexity:** O(n)  
- **Space Complexity:** O(h) (height of tree due to recursion stack)

---