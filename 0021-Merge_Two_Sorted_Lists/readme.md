# 21. Merge Two Sorted Lists

## 🟢 Difficulty: Easy

### 📘 Problem Statement

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one sorted list.  
The list should be made by **splicing together the nodes** of the first two lists.

Return the head of the merged linked list.

---

## 🖼️ Example 1

**Input**

list1 = [1,2,4]
list2 = [1,3,4]


**Output**

[1,1,2,3,4,4]


### 🔍 Visual Explanation

![Merge Two Sorted Lists](https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg)

---

## 🖼️ Example 2

**Input**

list1 = []
list2 = []


**Output**

[]


---

## 🖼️ Example 3

**Input**

list1 = []
list2 = [0]


**Output**

[0]


---

## 🔒 Constraints

- The number of nodes in both lists is in the range `[0, 50]`.
- `-100 <= Node.val <= 100`
- Both `list1` and `list2` are sorted in non-decreasing order.

---

# 💡 Approach — Iterative (Two Pointers)

We use:

- A **dummy node** to simplify logic
- A pointer `current` to build the merged list

### 🔹 Key Idea

1. Compare nodes of both lists.
2. Attach the smaller node to `current.next`.
3. Move the pointer forward.
4. When one list becomes null, attach the remaining part of the other list.

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n + m) |
| Space      | O(1) |

Where:
- `n` = length of list1
- `m` = length of list2

---
