# Searching Techniques 🔍

Searching Algorithms are techniques used to find specific elements within an array efficiently. Each algorithm has a unique approach, suitable for different situations depending on factors like the size of the array and whether it’s sorted or unsorted. Selecting the right method can optimize performance in various scenarios.

## Table of Contents 📑
- [Available Searching Methods](#available-searching-methods)
- [Why Use These Methods?](#why-use-these-methods?)
- [Files](#files)

## Available Searching Methods 📑

1. **Linear Search** 📏  
   A straightforward method that checks each element one by one until the target is found. Suitable for unsorted arrays or small datasets.

   - ⏳ **Time Complexity**: O(n)
   - 🛸 **Space Complexity**: O(1)

2. **Binary Search** 📶  
   A faster approach that requires the array to be sorted. It works by repeatedly dividing the search interval in half until the element is found.

   - ⏳ **Time Complexity**: O(log n)
   - 🛸 **Space Complexity**: O(1)

## Why Use These Methods? 🌟

- **Linear Search** is simple but can be slow for large datasets.
- **Binary Search** is much faster, but only works on sorted arrays.

## Files 📂

- `LinearSearch.java`  
  Contains the implementation of the Linear Search Algorithm.

- `BinarySearch.java`  
  Contains the implementation of the Binary Search Algorithm.
