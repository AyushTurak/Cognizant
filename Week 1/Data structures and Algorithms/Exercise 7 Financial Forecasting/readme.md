Exercise 7: Financial Forecasting
Scenario:
You are developing a financial forecasting tool that predicts future values based on past data.
Steps:
1.	Understand Recursive Algorithms:

      o	Explain the concept of recursion and how it can simplify certain problems.
- Recursion means a function calling itself to solve parts of same problem.
- It can simplify certain problems by breaking complex problems into smaller pieces.
- It also eliminates the need for loops.

2.	Setup:

      o	Create a method to calculate the future value using a recursive approach.
3.	Implementation:

      o	Implement a recursive algorithm to predict future values based on past growth rates.
4.	Analysis:

      o	Discuss the time complexity of your recursive algorithm.
- Since each recursive call reduces the yearLeft by 1, the time complexity is O(n)
- where n = years left

o	Explain how to optimize the recursive solution to avoid excessive computation.

- If the n is very large, then stack overflow may occur. 
- To optimize this, we can use loops instead.
- Or we can apply direct formula.