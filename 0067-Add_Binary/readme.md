# Add Binary

## 🧠 Problem Statement

Given two binary strings `a` and `b`, return their sum as a binary string.

You must add the two binary numbers and return the result in binary form.

---

## 📌 Example

### Example 1
**Input:**

a = "11"
b = "1"


**Output:**

"100"


---

### Example 2
**Input:**

a = "1010"
b = "1011"


**Output:**

"10101"


---

## 🚀 Approach (Digit-by-Digit Addition)

### 💡 Idea

- Start from the **rightmost digit** of both strings.
- Add corresponding digits along with a **carry**.
- Append `(sum % 2)` to the result.
- Update `carry = sum / 2`.
- Continue until both strings and carry are exhausted.
- Reverse the result at the end.

---
