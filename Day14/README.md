# Day 14: Mastering Strings and StringBuilders in Java

## Overview

Today, I explored the concepts of strings and `StringBuilder` in Java, focusing on their differences, methods, and practical applications. Here’s a detailed summary of what I learned:

## Topics Covered

### String vs StringBuilder

- **String:**
  - **Immutable:** Once created, the content cannot be changed.
  - **Methods:** `charAt()`, `length()`, `substring()`, `indexOf()`, `concat()`, etc.

- **StringBuilder:**
  - **Mutable:** The content can be modified without creating new objects.
  - **Methods:** `append()`, `insert()`, `delete()`, `reverse()`, etc.

### Important String Methods

- `charAt(int index)`: Returns the character at the specified index.
- `length()`: Returns the length of the string.
- `substring(int beginIndex, int endIndex)`: Returns a new string that is a substring of this string.
- `indexOf(String str)`: Returns the index within this string of the first occurrence of the specified substring.
- `concat(String str)`: Concatenates the specified string to the end of this string.

### Operators in Strings

- `+`: Concatenation operator.
- `==`: Reference comparison (not content comparison).
- `equals(Object anObject)`: Content comparison.

### Palindrome Check Problem

- Developed a function to check if a given string is a palindrome.
- Used two-pointer technique for efficient comparison.

### Pretty Printing

- Techniques to format and print strings in a more readable manner using `String.format()`, `printf()`, and other formatting tools.

