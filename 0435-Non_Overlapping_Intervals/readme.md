# 435. Non-overlapping Intervals

## 🟡 Difficulty: Medium

---

## 📘 Problem Statement

Given an array of intervals `intervals` where:


intervals[i] = [starti, endi]


Return the **minimum number of intervals you need to remove** to make the rest of the intervals non-overlapping.

👉 Intervals that only **touch at a point are NOT overlapping**.  
Example: `[1,2]` and `[2,3]` are non-overlapping.

---

## 🖼️ Example 1

**Input**

intervals = [[1,2],[2,3],[3,4],[1,3]]


**Output**

1


**Explanation**  
Remove `[1,3]` and the rest are non-overlapping.

---

## 🖼️ Example 2

**Input**

intervals = [[1,2],[1,2],[1,2]]


**Output**

2


**Explanation**  
Remove two intervals.

---

## 🖼️ Example 3

**Input**

intervals = [[1,2],[2,3]]


**Output**

0


**Explanation**  
Already non-overlapping.

---

## 🔒 Constraints

- `1 <= intervals.length <= 10^5`
- `intervals[i].length == 2`
- `-5 * 10^4 <= starti < endi <= 5 * 10^4`

---

# 💡 Optimal Approach — Greedy (Sort by End Time)

### 🔥 Key Idea

To minimize removals:
- Sort intervals by **end time**
- Always keep the interval that finishes earliest
- If the current interval overlaps with the previous kept interval → remove it

This works because choosing the earliest finishing interval leaves maximum space for future intervals.

---

## 🧠 Algorithm Steps

1. Sort intervals by `end` ascending.
2. Initialize:
   - `end = intervals[0][1]`
   - `count = 0`
3. Iterate from index `1`:
   - If `intervals[i][0] < end`
     - Overlap → increment `count`
   - Else
     - Update `end = intervals[i][1]`

---

## ⏱ Time & Space Complexity

| Complexity | Value |
|------------|--------|
| Time       | O(n log n) (sorting) |
| Space      | O(1) |

---
