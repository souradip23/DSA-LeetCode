# 1404. Number of Steps to Reduce a Number in Binary Representation to One

**Platform:** LeetCode  
**Difficulty:** Medium  
**Topics:** String, Bit Manipulation, Simulation  

---

## 📘 Problem Statement

Given the binary representation of an integer as a string `s`, return the number of steps to reduce it to `1` using the following rules:

- If the current number is **even**, divide it by `2`
- If the current number is **odd**, add `1` to it

It is guaranteed that the number can always be reduced to `1`.

---

## 🧪 Examples

### Example 1


Input: s = "1101"
Output: 6


**Explanation:**


1101 (13)
→ 1110 (14)
→ 111 (7)
→ 1000 (8)
→ 100 (4)
→ 10 (2)
→ 1


---

### Example 2


Input: s = "10"
Output: 1


---

### Example 3


Input: s = "1"
Output: 0


---

## 🚫 Why Converting to Integer Fails

Using:

```java
Integer.parseInt(s, 2);

❌ Causes overflow
❌ Binary length can be up to 500 bits
❌ int supports only 32 bits

👉 Hence, we must avoid numeric conversion.

 # ✅ Optimized Approach (String-Based)
💡 Key Idea

Traverse the binary string from right to left

Simulate operations using a carry

No actual number conversion required

# 🔁 Rules Applied on Each Bit

Even → divide by 2 → 1 step

Odd → add 1 + divide by 2 → 2 steps

Carry handles binary addition propagation

 # 🧠 Algorithm

Initialize:

steps = 0
carry = 0

Traverse the string from last index to index 1

For each bit:

Use (bit + carry) to determine even or odd

Update steps accordingly

Add remaining carry to steps