# Day 9 - DSA Learning Journey
Concepts Covered
# 1. Infinite Array
An infinite array is a conceptual array that is extremely large or unbounded. Searching in such an array requires specialized techniques since the size is not known beforehand.

# Problem: Position of an Element in Infinite Sorted Array
To find the position of an element in an infinite sorted array, we use an expanding search range to locate the element. Once the range is identified, binary search is applied within that range.
# 2. Mountain Array (Bitonic Array)
A mountain array is one that increases to a peak and then decreases. This unique structure requires a different approach for searching and finding peaks.

# Problem 1: Find Peak Index in a Mountain Array
To find the peak index, we can use a binary search approach that narrows down the peak element by comparing middle elements with their neighbors.
# Problem 2: Search in a Mountain Array
To search for an element in a mountain array, we first find the peak and then perform binary searches on both the increasing and decreasing parts of the array.

# Leetcode Problems Solved
Find Peak Index in Mountain Array: [Leetcode Problem Link]
Search in a Mountain Array: [Leetcode Problem Link]