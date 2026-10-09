# Core Java Engineering Playbook

## Repository Purpose
Welcome to the Core Java Engineering Playbook. This repository serves as a professional-grade training ground and engineering portfolio for a backend software engineer. It transitions junior developers from theoretical textbook knowledge to practical, production-ready enterprise Java development.

## Engineering Philosophy
1. **Production-First Mindset**: We don't write "Hello World." We write code that handles failures, edge cases, concurrent access, and scaling limitations.
2. **JVM Empathy**: We understand what our code does to memory, garbage collection, and CPU execution.
3. **Defense in Depth**: We validate inputs, handle exceptions explicitly, and avoid swallowing errors.
4. **Code Quality Over Cleverness**: Code is read vastly more times than it is written. We optimize for readability, maintainability, and clean abstractions.
5. **Continuous Verification**: Code that isn't tested is broken. We verify behavior through robust tests.

## Table of Contents / Module Navigation
1. [01 JVM and Fundamentals](./01-jvm-and-fundamentals)
2. [02 Execution Control and Loops](./02-execution-control-and-loops)
3. [03 Methods and Memory Stack](./03-methods-and-memory-stack)
4. [04 Arrays and Memory Layout](./04-arrays-and-memory-layout)
5. [05 Strings and Pool Internals](./05-strings-and-pool-internals)
6. [06 OOP and Domain Modeling](./06-oop-and-domain-modeling)
7. [07 Packages and Visibility](./07-packages-and-visibility)
8. [08 Resilient Exception Handling](./08-resilient-exception-handling)
9. [09 Wrappers and Autoboxing Traps](./09-wrappers-and-autoboxing-traps)
10. [10 Enums and State Machines](./10-enums-and-state-machines)
11. [11 Collections and Big-O](./11-collections-and-big-o)
12. [12 Generics and Type Erasure](./12-generics-and-type-erasure)
13. [13 Lambda and Functional Design](./13-lambda-and-functional-design)
14. [14 Stream API and Performance](./14-stream-api-and-performance)
15. [15 Modern Date-Time API](./15-modern-date-time-api)
16. [16 NIO and Efficient I/O](./16-nio-and-efficient-io)
17. [17 Serialization and Security Risks](./17-serialization-and-security-risks)
18. [18 Concurrency and Multithreading](./18-concurrency-and-multithreading)
19. [19 JVM Internals and GC Tuning](./19-jvm-internals-and-gc-tuning)
20. [20 Reflection and Proxies](./20-reflection-and-proxies)
21. [21 Modern Java Features in Production](./21-modern-java-features-in-production)
22. [22 Algorithmic Problem Solving](./22-algorithmic-problem-solving)
23. [23 System Mini-Projects](./23-system-mini-projects)
24. [24 Senior-Level Interview Prep](./24-senior-level-interview-prep)

## Java Version Requirements
- **Java 17 / Java 21+** (LTS versions)
- The playbook leverages modern language features including Records, Pattern Matching, Sealed Classes, and Virtual Threads.

## How to Compile and Run Examples
To compile and run standalone examples without an IDE:
```bash
# Navigate to the specific module directory
cd 01-jvm-and-fundamentals

# Compile a Java file
javac com/engineering/playbook/jvm/OrderProcessor.java

# Run the compiled class
java com.engineering.playbook.jvm.OrderProcessor
```

## How to Run Tests
Modules requiring structured testing utilize JUnit 5.
Compile and run tests using standard Maven/Gradle wrappers (if provided in project modules) or IDE test runners (IntelliJ IDEA).
For Core Java-only assertions, run the test harnesses via `java -ea TestRunner.java`.

## Project List
- Custom In-Memory LRU Cache
- Thread-Safe E-Commerce Inventory Manager
- Multithreaded File Log Parser
- REST-Like API Request Dispatcher
- Connection Pool Manager Simulator

## Verified Learning Progress
See [PROGRESS-TRACKER.md](./PROGRESS-TRACKER.md) for a detailed breakdown of completion status.

## Skills Practiced
- Core Java & JVM Internals
- Object-Oriented Design & Domain Modeling
- Memory Management & Garbage Collection Profiling
- Concurrency, Thread Safety, and Virtual Threads
- Data Structures & Algorithmic Complexity
- Unit Testing, Regression Testing, and Edge-case handling
- Code Review & Refactoring

## References
- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)
- [JEP (JDK Enhancement Proposals) Index](https://openjdk.org/jeps/0)
