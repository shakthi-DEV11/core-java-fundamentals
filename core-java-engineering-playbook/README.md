# Core Java Engineering Playbook

> [!TIP]
> For the primary repository overview, verified learning map, and quick-start instructions, visit the **[Root Repository README](../README.md)**.

## Repository Purpose
Welcome to the Core Java Engineering Playbook. This workspace serves as a structured training ground and engineering portfolio for backend Java development. It transitions from theoretical concepts to practical, production-ready Core Java through runnable code, architectural notes, and explicit trade-off analysis.

## Engineering Philosophy
1. **Production-First Mindset**: We don't write toy examples. We write code that handles failures, edge cases, concurrent access, and scaling limitations.
2. **JVM Empathy**: We understand what our code does to memory, garbage collection, and CPU execution.
3. **Defense in Depth**: We validate inputs, handle exceptions explicitly, and avoid swallowing errors.
4. **Code Quality Over Cleverness**: Code is read vastly more times than it is written. We optimize for readability, maintainability, and clean abstractions.
5. **Continuous Verification**: Code that isn't tested is broken. We verify behavior through robust tests and assertions.

## Module Navigation & Status

See [`ENGINEERING-ROADMAP.md`](./ENGINEERING-ROADMAP.md) for full curriculum descriptions and [`PROGRESS-TRACKER.md`](./PROGRESS-TRACKER.md) for real-time completion tracking.

- **[01 JVM and Fundamentals](./01-jvm-and-fundamentals)** — **Active** ([Technical Notes](./01-jvm-and-fundamentals/stack-vs-heap.md) \| [OrderProcessor.java](./01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java))
- 02 Execution Control and Loops — *(Planned — see [Roadmap Phase 1](./ENGINEERING-ROADMAP.md#phase-1-jvm-foundation--execution-mechanics))*
- 03 Methods and Memory Stack — *(Planned — see [Roadmap Phase 1](./ENGINEERING-ROADMAP.md#phase-1-jvm-foundation--execution-mechanics))*
- 04 Arrays and Memory Layout — *(Planned — see [Roadmap Phase 1](./ENGINEERING-ROADMAP.md#phase-1-jvm-foundation--execution-mechanics))*
- 05 Strings and Pool Internals — *(Planned — see [Roadmap Phase 1](./ENGINEERING-ROADMAP.md#phase-1-jvm-foundation--execution-mechanics))*
- 06 OOP and Domain Modeling — *(Planned — see [Roadmap Phase 2](./ENGINEERING-ROADMAP.md#phase-2-domain-modeling--object-oriented-engineering))*
- 07 Packages and Visibility — *(Planned — see [Roadmap Phase 2](./ENGINEERING-ROADMAP.md#phase-2-domain-modeling--object-oriented-engineering))*
- 08 Resilient Exception Handling — *(Planned — see [Roadmap Phase 3](./ENGINEERING-ROADMAP.md#phase-3-reliability--data-structures))*
- 09 Wrappers and Autoboxing Traps — *(Planned — see [Roadmap Phase 2](./ENGINEERING-ROADMAP.md#phase-2-domain-modeling--object-oriented-engineering))*
- 10 Enums and State Machines — *(Planned — see [Roadmap Phase 2](./ENGINEERING-ROADMAP.md#phase-2-domain-modeling--object-oriented-engineering))*
- 11 Collections and Big-O — *(Planned — see [Roadmap Phase 3](./ENGINEERING-ROADMAP.md#phase-3-reliability--data-structures))*
- 12 Generics and Type Erasure — *(Planned — see [Roadmap Phase 3](./ENGINEERING-ROADMAP.md#phase-3-reliability--data-structures))*
- 13 Lambda and Functional Design — *(Planned — see [Roadmap Phase 4](./ENGINEERING-ROADMAP.md#phase-4-functional-paradigms--data-processing))*
- 14 Stream API and Performance — *(Planned — see [Roadmap Phase 4](./ENGINEERING-ROADMAP.md#phase-4-functional-paradigms--data-processing))*
- 15 Modern Date-Time API — *(Planned — see [Roadmap Phase 4](./ENGINEERING-ROADMAP.md#phase-4-functional-paradigms--data-processing))*
- 16 NIO and Efficient I/O — *(Planned — see [Roadmap Phase 5](./ENGINEERING-ROADMAP.md#phase-5-io-serialization--boundaries))*
- 17 Serialization and Security Risks — *(Planned — see [Roadmap Phase 5](./ENGINEERING-ROADMAP.md#phase-5-io-serialization--boundaries))*
- 18 Concurrency and Multithreading — *(Planned — see [Roadmap Phase 6](./ENGINEERING-ROADMAP.md#phase-6-high-performance--concurrency))*
- 19 JVM Internals and GC Tuning — *(Planned — see [Roadmap Phase 6](./ENGINEERING-ROADMAP.md#phase-6-high-performance--concurrency))*
- 20 Reflection and Proxies — *(Planned — see [Roadmap Phase 6](./ENGINEERING-ROADMAP.md#phase-6-high-performance--concurrency))*
- 21 Modern Java Features in Production — *(Planned — see [Roadmap Phase 7](./ENGINEERING-ROADMAP.md#phase-7-modernization--real-world-synthesis))*
- 22 Algorithmic Problem Solving — *(Planned — see [Roadmap Phase 7](./ENGINEERING-ROADMAP.md#phase-7-modernization--real-world-synthesis))*
- 23 System Mini-Projects — *(Planned — see [Roadmap Phase 7](./ENGINEERING-ROADMAP.md#phase-7-modernization--real-world-synthesis))*
- 24 Senior-Level Interview Prep — *(Planned — see [Roadmap Phase 7](./ENGINEERING-ROADMAP.md#phase-7-modernization--real-world-synthesis))*

## Java Version Requirements
- **Java 17 LTS or higher** (verified on OpenJDK 25.0.4).
- Implemented examples utilize Java 16+ Records (`record OrderRequest`, `record OrderItem`) and immutable collections (`List.of`).
- The roadmap covers upcoming features such as Pattern Matching, Sealed Classes, and Virtual Threads.

## How to Compile and Run Examples
To compile and run standalone examples using standard JDK tools without an external build system:

```bash
# From this directory (core-java-engineering-playbook):
cd 01-jvm-and-fundamentals

# Compile the Java source file
javac com/engineering/playbook/jvm/OrderProcessor.java

# Run the compiled class
java com.engineering.playbook.jvm.OrderProcessor
```

Or from the repository root:
```bash
javac -d out core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java
java -cp out com.engineering.playbook.jvm.OrderProcessor
```

## Testing Approach
- Illustrative unit testing patterns using JUnit 5 assertions are documented in [`01-jvm-and-fundamentals/stack-vs-heap.md#j-testing-strategy`](./01-jvm-and-fundamentals/stack-vs-heap.md#j-testing-strategy).
- Standalone automated test files (`*Test.java`) and build automation (Maven/Gradle) are scheduled as upcoming additions as the module suite expands.

## Planned Mini-Projects (Phase 7)
The following mini-projects are specified in the engineering roadmap to integrate multi-module concepts into working systems:
- Custom In-Memory LRU Cache (Collections & O(1) eviction)
- Thread-Safe E-Commerce Inventory Manager (Concurrency & atomics)
- Multithreaded File Log Parser (NIO & producer-consumer workers)
- REST-Like API Request Dispatcher (Reflection & routing)
- Connection Pool Manager Simulator (Resource synchronization & lifecycle)

## Verified Learning Progress
See [`PROGRESS-TRACKER.md`](./PROGRESS-TRACKER.md) for the active status of each module, and [`PR-CHECKLIST.md`](./PR-CHECKLIST.md) for code quality requirements.

## Skills Practiced
- Core Java syntax and JVM memory mechanics (Stack frames vs. Heap allocation)
- Object-oriented design and immutable domain modeling (Records)
- Defensive programming and fail-fast validation
- Autoboxing performance awareness in loops
- Engineering standards and architectural documentation

## References
- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)
- [JEP Index](https://openjdk.org/jeps/0)
