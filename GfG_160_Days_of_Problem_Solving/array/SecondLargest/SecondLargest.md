# Second Largest
Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.

Note: If the second largest element does not exist, return -1.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 there is no second largest element.

3 ways to solve this problem:
- [Naive Approach] Using Sorting
- [Better Approach] Two Pass Search
- [Expected Approach] One Pass Search

## Using Sorting
We sort the array, then traverse it in reverse from the end. The first element different from the largest one is the second largest. If all are equal, return -1.

Time Complexity:
 - `O(n*log(n))` -> as sorting the array takes it
 - `O(n)` -> time and traversing the array
 - `(n*log(n) + n) = O(n*log(n))` -> in the worst case, total time

Auxiliary space: `O(1)`, as no extra space is required

## Two Pass Search
For to solve this way, we need to traverse the array twice, but why? It's simple, in the first traversal, we need to find the maximum element and ind the second traversal, we find the largest element, ignoring the one we found in the first traversal

Time Complexity: 
- `O(2*n) = O(n)` -> as we are traversing the array two times.

Auxiliary space: `O(1)`, as no extra space is required.

## One Pass Search
The idea more simple yet, get the largest and second largest while traversing the array. Initialize largest and sec. largest with -1.
For any index i:
- if arr[i] > largest, update sec. largest with largest and largest with arr[i].
- else, if arr[i] , largest and arr[i] > sec largest, update sec largest with arr[i].

Time complexity:
- `O(n)` - > traversing the array only once

Auxiliary space: `O(1)`