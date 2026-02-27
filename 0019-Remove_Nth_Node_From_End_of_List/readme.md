# 19. Remove Nth Node From End of List

## 🟡 Difficulty: Medium

### 📘 Problem Statement

Given the `head` of a linked list, remove the **nth node from the end** of the list and return its head.

---

## 🖼️ Example 1

**Input**

head = [1,2,3,4,5], n = 2


**Output**

[1,2,3,5]


**Explanation**

Original List:

1 → 2 → 3 → 4 → 5


Remove 2nd node from end (node with value 4):


1 → 2 → 3 → 5


Reference Image:
https://assets.leetcode.com/uploads/2020/10/03/remove_ex1.jpg

---

## 🖼️ Example 2

**Input**

head = [1], n = 1


**Output**

[]


---

## 🖼️ Example 3

**Input**

head = [1,2], n = 1


**Output**

[1]


---

## 🔒 Constraints

- The number of nodes in the list is `sz`.
- 1 <= sz <= 30
- 0 <= Node.val <= 100
- 1 <= n <= sz

---

## 🚀 Follow Up

Can you solve this in **one pass**?

---

# 💡 Approach — Two Pointer (One Pass Solution)

We use two pointers:

- `fast`
- `slow`

### 🔹 Key Idea

1. Move `fast` pointer `n + 1` steps ahead.
2. Move both `fast` and `slow` together until `fast` reaches the end.
3. `slow` will be just before the node we need to remove.
4. Update `slow.next`.

To handle edge cases (like removing the head), we use a **dummy node**.

---

## 🔹 Algorithm

1. Create a dummy node pointing to `head`
2. Set `fast = dummy`, `slow = dummy`
3. Move `fast` `n + 1` steps
4. Move both pointers until `fast == null`
5. Remove node → `slow.next = slow.next.next`
6. Return `dummy.next`

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n)   |
| Space      | O(1)   |

---