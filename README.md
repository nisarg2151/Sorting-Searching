# Sorting-Searching

Various Introductory Sorting &amp; Searching Techniques.

## Contents

- #### SelectionSort.java

    Selection Sort.     
    Runtime - **O(n^2)**    
    
- #### SelectionSortBounded.java

    Selection Sort with input= k to sort desired number of elements.      
    Runtime **O(nk)**, where k = number of elements to be sorted in array of n elements.
    
    **Input:** 4, 6, 8, 15, 20, 22, 10, 3, 9, 2 and **k** = 4     
    **Output:** 2, 3, 4, 6
    
- #### MedianBySorting.java

    Finding Median of given array by using selection sort.
    
- #### ShellSort.java

    Shell Sort Implementation.
    
    Though unintuitive, it can be shown that the above algorithm has a runtime of **O(N^3/2)** in
comparison to selection sort which has a runtime of O(N^2).

    An example run of Shell Sort with gaps 5, 3 and 1 is shown below.     
    
    Input 62 83 18 53 07 17 95 86 47 69 25 28   
    H = 5 17 28 18 47 07 25 83 86 53 69 62 95   
    H = 3 17 07 18 47 28 25 69 62 53 83 86 95   
    H = 1 07 17 18 25 28 47 53 62 69 83 86 95   

    The first pass, 5-sorting, performs insertion sort on separate subarrays (a1, a6, a11), (a2, a7, a12),
(a3, a8), (a4, a9), (a5, a10). For instance, it changes the subarray (a1, a6, a11) from (62, 17, 25) to
(17, 25, 62). The next pass, 3-sorting, performs insertion sort on the subarrays (a1, a4, a7, a10),
(a2, a5, a8, a11), (a3, a6, a9, a12). The last pass, 1-sorting, is an ordinary insertion sort of the entire
array (a1,..., a12).

  **Input** = [2, 5, 6, 4, 10, 9, 8, 1, 10, 5] and **H** = [5, 3,1]
  
  **Output** = [1, 2, 4, 5, 5, 6, 8, 9, 10, 10]

    
- #### IndexSearch.java

    Search for index in sorted array such that its value is equal to element at that particular index.    
    Finds out whether there is an index i for which A[i] = i
    
    Runtime **O(log n)**
    
    