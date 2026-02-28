# 141. Linked List Cycle

## 🟢 Difficulty: Easy

---

## 📘 Problem Statement

Given the `head` of a linked list, determine if the linked list has a **cycle**.

A cycle exists if a node can be revisited by continuously following the `next` pointer.

Return `true` if there is a cycle. Otherwise, return `false`.

⚠️ `pos` is used internally to indicate where the tail connects, but it is NOT passed as a parameter.

---

## 🖼️ Example 1

**Input**

head = [3,2,0,-4], pos = 1


**Output**

true


**Explanation**

![Example 1](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png)

The tail connects to the 1st node (0-indexed), forming a cycle.

---

## 🖼️ Example 2

**Input**

head = [1,2], pos = 0


**Output**

true


**Explanation**

![Example 2](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png)

The tail connects to the 0th node.

---

## 🖼️ Example 3

**Input**

head = [1], pos = -1


**Output**

false


**Explanation**

![Example 3](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png)

There is no cycle.

---

## 🔒 Constraints

- Number of nodes: `[0, 10^4]`
- `-10^5 <= Node.val <= 10^5`
- `pos` is `-1` or a valid index
- `pos` is not given in input

---

# 💡 Optimal Approach — Floyd’s Cycle Detection (Tortoise & Hare)

## 🔥 Idea

Use two pointers:

- `slow` → moves 1 step at a time
- `fast` → moves 2 steps at a time

### ✅ If there is a cycle:
They will eventually meet.

### ❌ If there is no cycle:
`fast` will reach `null`.

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n) |
| Space      | O(1) |

✔ Solves the follow-up requirement (constant memory)

---