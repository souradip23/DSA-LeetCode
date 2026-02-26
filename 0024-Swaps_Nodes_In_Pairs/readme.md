# 24. Swap Nodes in Pairs

## 🟡 Difficulty: Medium  

## 📌 Problem Statement

Given a linked list, swap every two adjacent nodes and return its head.

⚠️ You must solve the problem **without modifying the values in the nodes** (only node pointers can be changed).

---

## 🖼️ Example Illustration

![Swap Example](https://assets.leetcode.com/uploads/2020/10/03/swap_ex1.jpg)

---

## 🧪 Examples

### Example 1:

Input: head = [1,2,3,4]
Output: [2,1,4,3]


### Example 2:

Input: head = []
Output: []


### Example 3:

Input: head = [1]
Output: [1]


### Example 4:

Input: head = [1,2,3]
Output: [2,1,3]


---

## 🔒 Constraints

- The number of nodes in the list is in the range `[0, 100]`
- `0 <= Node.val <= 100`

---

## 💡 Approach (Iterative - Recommended)

### 🔹 Key Idea:
- Use a **dummy node** before the head.
- Swap pairs by changing pointers:
  - `first -> second`
  - `second -> first`
- Move to next pair.
- Do **NOT** change node values.

---

## 🔁 Algorithm Steps

1. Create a dummy node pointing to head.
2. Use a pointer `prev` starting from dummy.
3. While `prev.next` and `prev.next.next` exist:
   - Identify first and second nodes.
   - Swap them by updating pointers.
   - Move `prev` forward by 2 nodes.
4. Return `dummy.next`.

---