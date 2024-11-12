# Tetranacci Calculator

This project contains two Java implementations of Tetranacci number calculations: a recursive (exponential) version and an iterative (linear) version. 

## Overview

Tetranacci numbers are a generalization of Fibonacci numbers where each term is the sum of the previous four terms. The first few Tetranacci numbers are:
`0, 0, 0, 1, 1, 2, 4, 8, 15, 29, 56, 108...`

This project implements:
1. `BinaryTetranacci.java` - A recursive solution with exponential time complexity, which is inefficient for large `n`.
2. `LinearTetranacci.java` - An iterative solution with linear time complexity, optimized for larger values of `n`.

## Files

- **BinaryTetranacci.java** - Contains the recursive implementation.
- **LinearTetranacci.java** - Contains the iterative implementation.
- **README.md** - This file, providing an overview of the project.

## Usage

1. Compile the Java files:
   ```bash
   javac BinaryTetranacci.java
   javac LinearTetranacci.java
