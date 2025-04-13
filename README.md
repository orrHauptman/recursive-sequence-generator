Recursive Sequence Generator

This Java utility calculates how many non-decreasing integer sequences of a given length n can be formed using values from 1 to max.

The algorithm uses a clean recursive approach with no loops, following divide-and-conquer logic.

📌 Problem Definition

Given two positive integers:

n: the length of the sequence

max: the maximum value allowed in the sequence

Count how many sequences of length n can be built using values from 1 to max, where each sequence is non-decreasing (i.e., sorted in ascending order, duplicates allowed).

🧠 Example

For n = 3, max = 2, the valid sequences are:

[1, 1, 1]  
[1, 1, 2]  
[1, 2, 2]  
[2, 2, 2]

So the result is 4.
