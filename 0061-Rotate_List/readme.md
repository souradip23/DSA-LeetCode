# 61. Rotate List

**Difficulty:** Medium  
**Topic:** Linked List  
**Company Tags:** Amazon, Microsoft, Google  

---

## 🧩 Problem Statement

Given the head of a linked list, rotate the list to the **right by `k` places**.

---

## 🔍 Examples

### Example 1

**Input**

head = [1,2,3,4,5], k = 2


**Output**

[4,5,1,2,3]


**Visualization**

![Rotate List Example 1](https://assets.leetcode.com/uploads/2020/11/13/rotate1.jpg)

---

### Example 2

**Input**

head = [0,1,2], k = 4


**Output**

[2,0,1]


**Visualization**

![Rotate List Example 2](https://assets.leetcode.com/uploads/2020/11/13/roate2.jpg)

---

## 📌 Constraints

- Number of nodes: `0 ≤ n ≤ 500`
- Node value: `-100 ≤ Node.val ≤ 100`
- `0 ≤ k ≤ 2 * 10⁹`

---

## 💡 Key Observations

- Rotating by `k` where `k > length` is redundant  
  → Use `k = k % length`
- The list rotation can be done **without extra space**
- Make the list **circular**, then break it at the right point

---

## 🛠️ Approach (Efficient – O(n))

1. If the list is empty, has one node, or `k = 0` → return head
2. Find the **length** of the list
3. Connect the last node to the head (circular list)
4. Find the new tail: `(length - k % length - 1)`
5. Break the cycle and return the new head

---