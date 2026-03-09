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