# MoveAllZerosToEndOfArray

Given an array of integers arr[], the task is to move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.

Input: arr[] = [10, 20, 30]
Output: arr[] = [10, 20, 30]
Explanation: No change in array as there are no 0s.

Input: arr[] = [0, 0]
Output: arr[] = [0, 0]
Explanation: No change in array as there are all 0s.

3 ways to solve:
- [Naive Approach] Using Temporary Array - O(n) Time and O(n) Space
- [Better Approach] Two Traversals
- [Expected Approach] One Traversal

## [Naive Approach] Using Temporary Array - O(n) Time and O(n) Space
Create a temporary array of same size as the input array arr[].

- Copy all non-zero elements from arr[] to the temporary array.
- Then, fill all the remaining positions in temporary array with 0.
- Finally, copy all the elements from temporary array to arr[].

## [Better Approach] Two Traversals
The idea is to move all the zeros by traversing the array twice.

First traversal: shift non-zero elements
- Traverse the array and maintain the count of non-zero elements. This count is initialized with 0 and keeps track of where the next non-zero element should be placed in the array.
- If the element is non-zero, place it at arr[count] and increment count by 1.
- After traversing all the elements, all non-zero elements will be shifted to the front while maintaining their original order.

Second Traversal: Fill remaining positions with zeros
- After the first traversal, all non-zero elements will be at the start of the array and count will store the index where the first zero should be placed.
- Iterate from count to the end of array and fill all indices with 0.

Time complexity: `O(n)`, as we are traversing the array only twice.
Auxiliary Space: `O(1)`

## [Expected Approach] One Traversal
Similar to the previous approach, we took a pointer, say count to track where the next non-zero element should be placed.
However, on encountering a non-zero element, intead of directly placing the non-zero element at ar[count], we will swap the non-zero element with arr[count].
This will ensure that if there is any zero present[count], it is pushed towards the end of array and is not overwritten.

Time Complexity: `O(n)`, as we are traversing the array only once.
Auxiliary Space: `O(1)`