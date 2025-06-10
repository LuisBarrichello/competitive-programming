# Array Reverse
Give an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.

### Examples:

Input: arr[] = {1, 4, 3, 2, 6, 5}
Output: {5, 6, 2, 3, 4, 1}
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

Input: arr[] = {4, 5, 1, 2}
Output: {2, 1, 5, 4}
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.

# Ways to solve
Studing this simple problem, it has many ways to settle. such:

- [Naive Approach] Using a temporary array - O(n) Time and O(n) Space
- [Expected Approach - 1] Using Two Pointers - O(n) Time and O(1) Space
- [Expected Approach - 2] By Swapping Elements - O(n) Time and O(1) Space
- [Alternate Approach] Using Recursion - O(n) Time and O(n) Space
- Using Inbuilt Methods - O(n) Time and O(1) Space

## [Naive Approach] Using a temporary array - O(n) Time and O(n) Space
The idea is to use a temporary array to store the reverse of the array.

- Create a temporary array of same size as the original array.
- Now, copy all elements from original array to the temporary array in reverse order.
- Finally, copy all the elements from temporary array back to the original array.

**Time Complexity:** O(n), Copying elements to a new array is a linear operation.

**Auxiliary Space:** O(n), as we are using an extra array to store the reversed array.

## [Expected Approach - 1] Using Two Pointers - O(n) Time and O(1) Space
The idea is to maintain two pointers: left and right, such that left points at the beginning of the array and right points to the end of the array.

While left pointer is less than the right pointer, swap the elements at these two positions. After each swap, increment the left pointer and decrement the right pointer to move towards the center of array. This will swap all the elements in the first half with their corresponding element in the second half.