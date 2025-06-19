Exercise 2: E-commerce Platform Search Function

Scenario:
You are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance.

Steps:
1.	Understand Asymptotic Notation:

o	Explain Big O notation and how it helps in analyzing algorithms.

- It is used to describe upper bound / max limit of a program's space and time complexity.
- It helps us to analyze algorithms by describing how much memory it  will consume and how many statements will be executed.
- Lower Big O is better for both the space and time complexity.

o	Describe the best, average, and worst-case scenarios for search operations.

##### For linear search

- Best case: The key to be searched is the first element.
- Average case: The key is present in the array.
- Worst case: The key is not present in the array.

##### For binary search

- Best case: the key to be searched is present at the middle of the array.
- Average case: the key is present in the array.
- Worst case: the key is at the extreme corners of the array or not present at all.

2. Setup:

o	Create a class Product with attributes for searching, such as productId, productName, and category.

3. Implementation:

o	Implement linear search and binary search algorithms.

o	Store products in an array for linear search and a sorted array for binary search.

4.	Analysis:

      o	Compare the time complexity of linear and binary search algorithms.

| Scenario     | Linear Search | Binary Search |
|--------------|---------------|---------------|
| Best Case    | O(1)          | O(1)          |
| Average Case | O(n)          | O(log n)      |
| Worst Case   | O(n)          | O(log n)      |

Discuss which algorithm is more suitable for your platform and why.

- Binary search is more suitable since it takes O(log n) while linear search take much more i.e. O(n)