# 20. Valid Parentheses

## 🟢 Difficulty: Easy  

## 📌 Problem Statement

Given a string `s` containing just the characters:


'(', ')', '{', '}', '[' and ']'


Determine if the input string is valid.

---

## ✅ A string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

---

## 🧪 Examples

### Example 1

Input: s = "()"
Output: true


### Example 2

Input: s = "()[]{}"
Output: true


### Example 3

Input: s = "(]"
Output: false


### Example 4

Input: s = "([])"
Output: true


### Example 5

Input: s = "([)]"
Output: false


---

## 🔒 Constraints

- `1 <= s.length <= 10^4`
- `s` consists only of parentheses characters `'()[]{}'`.

---

## 💡 Approach

We use a **Stack** data structure:

- Push opening brackets onto the stack.
- When encountering a closing bracket:
  - If the stack is empty → invalid.
  - If the top of stack doesn’t match → invalid.
  - Otherwise pop from stack.
- At the end:
  - If stack is empty → valid.
  - Else → invalid.

---

## 🧠 Algorithm

1. Create an empty stack.
2. Traverse each character in the string.
3. If it is an opening bracket → push to stack.
4. If it is a closing bracket:
   - Check for matching opening bracket.
   - If mismatch → return false.
5. After traversal, return `stack.isEmpty()`.

---