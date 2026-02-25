# 📘 219. Contains Duplicate II

🟢 Difficulty: Easy  

---

## 📝 Problem Statement

Given an integer array `nums` and an integer `k`,  
return `true` if there are two **distinct indices** `i` and `j` such that:

- `nums[i] == nums[j]`
- `abs(i - j) <= k`

Otherwise, return `false`.

---

## 🧪 Example 1

### Input

nums = [1,2,3,1]
k = 3


### Output

true


### Explanation
Index 0 and 3 both contain `1`  
`abs(0 - 3) = 3 <= k`

---

## 🧪 Example 2

### Input

nums = [1,0,1,1]
k = 1


### Output

true


---

## 🧪 Example 3

### Input

nums = [1,2,3,1,2,3]
k = 2


### Output

false


No duplicate exists within distance `2`.

---

## 📌 Constraints

- `1 <= nums.length <= 10⁵`
- `-10⁹ <= nums[i] <= 10⁹`
- `0 <= k <= 10⁵`

---