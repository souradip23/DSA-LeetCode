# 142. Linked List Cycle II

## 🟡 Difficulty: Medium

---

## 📘 Problem Statement

Given the `head` of a linked list, return the node where the **cycle begins**.  
If there is no cycle, return `null`.

⚠️ Do NOT modify the linked list.

There is a cycle if a node can be revisited by continuously following the `next` pointer.

---

## 🖼️ Example 1

**Input**

head = [3,2,0,-4], pos = 1


**Output**

tail connects to node index 1


**Explanation**

![Example 1](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png)

The tail connects to the second node (index 1).

---

## 🖼️ Example 2

**Input**

head = [1,2], pos = 0


**Output**

tail connects to node index 0


**Explanation**

![Example 2](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png)

The tail connects to the first node.

---

## 🖼️ Example 3

**Input**

head = [1], pos = -1


**Output**

no cycle


**Explanation**

![Example 3](https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png)

There is no cycle.

---

## 🔒 Constraints

- Number of nodes: `[0, 10^4]`
- `-10^5 <= Node.val <= 10^5`
- `pos` is `-1` or a valid index
- `pos` is not given as input

---

# 💡 Optimal Approach — Floyd’s Cycle Detection (Tortoise & Hare)

### 🔥 Step 1: Detect if Cycle Exists

- Use two pointers:
  - `slow` → moves 1 step
  - `fast` → moves 2 steps
- If they meet → cycle exists
- If fast reaches null → no cycle

---

### 🔥 Step 2: Find Cycle Start

Once slow and fast meet:

1. Move one pointer back to `head`
2. Move both pointers one step at a time
3. The node where they meet again → **cycle start**

---

# 🧠 Why This Works (Mathematical Insight)

Let:

- `a` = distance from head to cycle start
- `b` = distance from cycle start to meeting point
- `c` = remaining cycle length

From Floyd’s proof:

When they meet:


a = c


So moving one pointer from head and one from meeting point  
will make them meet at the cycle start.

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n) |
| Space      | O(1) |

✔ No extra memory used.

---