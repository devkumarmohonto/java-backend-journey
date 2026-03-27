# java-backend-journey
Starting my journey to become a professional Java Backend Engineer.

## Day 1 – Introduction to Java

Today I learned the basic concepts of programming and Java language.

### Computer and Programming Languages

A computer can only understand binary numbers (0 and 1).  
Humans cannot easily write programs using only 0 and 1, so we use programming languages to communicate with computers.

Programming languages are mainly divided into two types:

1. High Level Programming Language
2. Low Level Programming Language

High level languages are easier for humans to read and write, while low level languages are closer to machine language.

Java is a **high level programming language**.

---

### Java Program Execution Process

Before running a Java program, two main steps happen:

1. Compilation
2. Execution

First, the **source code (.java)** is compiled by the Java compiler.

```
Source Code (.java)
        ↓
Compiler (javac)
        ↓
Bytecode (.class)
```

The bytecode is then executed by the **Java Virtual Machine (JVM)** which converts it into machine code that the computer can understand.

---

### Why Java is Portable

Java programs are compiled into **bytecode**, not machine code.

Because of this, the same bytecode can run on any operating system that has a **JVM** installed.

This is why Java is known as a **portable language**.

---

### JDK, JRE, and JVM

To run Java programs we install the **Java Development Kit (JDK)**.

JDK contains:

- JRE (Java Runtime Environment)
- Development tools (javac, jconsole, jheap, etc.)

JRE contains:

- JVM (Java Virtual Machine)
- Java Class Libraries

---

### Java as an Object-Oriented Language

Java is an **Object-Oriented Programming Language (OOP)**.

Programs in Java are written using **classes and objects**.

---

### The Main Function

Every Java program starts execution from the **main() function**.

Example:

```java
public static void main(String[] args)
```

Here:

- `main()` is the starting function
- `void` means the function does not return any value

When a Java program runs, the JVM first executes the **main function**, and from there other functions are executed.


# Day 02 – Java Basics Practice

Today I practiced some fundamental concepts of Java such as:

- Input
- Output
- Variables
- Data Types
- Scanner Class

I also solved some errors while running my code and learned how to debug them.

---

# Output in Java

Output is used to display information on the screen (Console / Terminal).

In Java we mainly use three methods for output:

```java
System.out.print();
System.out.println();
System.out.printf();
```

### Example

```java
System.out.print("Hello");
System.out.print("World");
```

Output:

```
HelloWorld
```

### Using println()

```java
System.out.println("Hello");
System.out.println("World");
```

Output:

```
Hello
World
```

### Using New Line Character

We can also move to the next line using:

```
\n
```

Example:

```java
System.out.print("Name\nAge");
```

---

# Variables in Java

Variables are used to store data in a program.

You can imagine a variable like a container that stores values.

Example:

```java
int age = 25;
String name = "Tony";
```

Variables can change their value during program execution.

Example:

```java
int a = 30;
a = 35;
```

---

# Constants

Some values should never change.

Example:

```
PI = 3.14
```

These are called **constants**.

---

# Data Types in Java

Java is a **type-based language**, which means every variable must have a data type.

There are two types of data types:

1. Primitive Data Types
2. Non-Primitive Data Types

---

## Primitive Data Types

Java has 8 primitive data types:

- byte
- short
- int
- long
- float
- double
- char
- boolean

Example:

```java
int age = 25;
double price = 19.99;
char grade = 'A';
boolean isJavaFun = true;
```

---

## Non-Primitive Data Types

These are more flexible and can store more complex data.

Examples:

- String
- Array
- Class
- Object
- Interface

Example:

```java
String name = "Tony";
```

---

# Taking User Input in Java

To take input from the user we use the **Scanner class**.

First we import it:

```java
import java.util.Scanner;
```

Then we create a Scanner object.

```java
Scanner sc = new Scanner(System.in);
```

---

# next() vs nextLine()

```
next() → reads only the first word
nextLine() → reads the full line including spaces
```

Example:

```java
String name = sc.next();
```

or

```java
String name = sc.nextLine();
```

---

# Problems I Faced

While practicing I faced some errors such as:

- Writing the main function incorrectly
- Missing semicolons
- Missing curly braces
- Scanner resource warning

Example warning:

```
Resource leak: 'sc' is not closed
```

Solution:

```java
sc.close();
```

---

# What I Learned Today

- How Java output works
- How variables store values
- Difference between primitive and non-primitive data types
- How to take user input using Scanner
- Difference between next() and nextLine()
- How to fix common Java errors


## Day 03 – Conditional Statements in Java

Today I learned and practiced conditional statements in Java.

### Topics Covered

- if-else
- else-if chain
- switch statement
- break keyword

---

## If-Else Statement

The if-else statement is used to make decisions in a program.

If the condition is true, the `if` block runs.  
Otherwise, the `else` block runs.

### Example

```java
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Not Adult");
}
```

---

## Else-If Chain

When we have multiple conditions, we use an else-if chain.

```java
if (marks >= 90) {
    System.out.println("A");
} else if (marks >= 75) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

---

## Switch Statement

The switch statement is used when we have fixed values.

It is useful for menu-based or multiple-choice type problems.

### Example

```java
int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid");
}
```

---

## Break Keyword

The `break` keyword is used to stop execution inside a switch case.

If we do not use `break`, the next cases will also execute.

---

## Practice Programs

Today I practiced several problems:

- IfElse basic program
- Month Name Finder
- Season and Month Info Finder
- Simple Calculator using switch
- Smart Number Analyzer
- Smart Number Game
- Student Result System

---

## Problems I Faced

- Confusion in multiple conditions
- Missing break in switch statements
- Logical errors in condition checking

---

## What I Learned

- How to use if-else for decision making
- How to handle multiple conditions using else-if
- How switch works with fixed values
- Importance of break keyword
- How to solve real-life logic problems using conditions


## Day 04 – Loops in Java

Today I learned about loops in Java and practiced different types of loops.

### Topics Covered

- for loop
- while loop
- do-while loop

---

## What is a Loop?

A loop is used to execute a block of code repeatedly.

---

## Types of Loops

1. for loop
2. while loop
3. do-while loop

---

## For Loop

The for loop is used when the number of iterations is fixed.

### Example

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

---

## While Loop

The while loop is used when the number of iterations is not fixed.

It runs until the condition becomes false.

### Example

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

---

## Do-While Loop

The do-while loop executes the code at least once, then checks the condition.

### Example

```java
int i = 10;

do {
    System.out.println(i);
    i++;
} while (i < 6);
```

### Output

```
10
```

---

## Real-Life Understanding

- Use **for loop** when you know how many times to repeat (e.g., 10 push-ups)
- Use **while loop** when the condition is unknown (e.g., correct password)
- Use **do-while loop** when you want to run at least once

---

## What I Learned

- Difference between for, while, and do-while loops
- When to use each loop
- How loop conditions control execution


