# Core Java Fundamentals

<p align="center">
  <strong>A transparent, code-grounded engineering portfolio and technical study of JVM architecture, memory mechanics, object-oriented design, and modern Java.</strong>
</p>

<p align="center">
  <a href="https://github.com/shakthi-DEV11/core-java-fundamentals"><img src="https://img.shields.io/badge/Repository-core--java--fundamentals-1f425f?style=for-the-badge&logo=github" alt="Repository" /></a>
  <a href="https://openjdk.org/"><img src="https://img.shields.io/badge/Java-17%2B%20(LTS)-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 17+" /></a>
  <a href="https://openjdk.org/"><img src="https://img.shields.io/badge/Tested%20On-JDK%2025%20LTS-007396?style=for-the-badge&logo=openjdk&logoColor=white" alt="Tested on JDK 25" /></a>
  <a href="https://github.com/shakthi-DEV11"><img src="https://img.shields.io/badge/Author-Shakthi%20Nagarajan-0969da?style=for-the-badge" alt="Author" /></a>
  <img src="https://img.shields.io/badge/Status-Active%20Learning-2ea44f?style=for-the-badge" alt="Status: Active Learning" />
</p>

<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=java,idea,git,github" alt="Java, IntelliJ IDEA, Git, GitHub" />
  </a>
</p>

---

## 1. About the Repository

Welcome to **Core Java Fundamentals**. This repository serves as an evidence-based learning portfolio and technical reference for mastering backend Core Java. Rather than presenting abstract textbook summaries or unsubstantiated claims, this project links theoretical concepts directly to runnable source code, memory diagrams, code reviews, and honest progress tracking.

### Core Objectives
- **Understand JVM Execution & Memory Boundaries**: Explore stack frame allocation, heap object lifecycles, and Garbage Collection (GC) pressure.
- **Learn Core Java through Code**: Write clean, defensive Java code with explicit validation and boundary checking.
- **Examine Performance & Idioms**: Avoid common traps like autoboxing in tight loops, improper equality comparisons, and mutable state leaks.
- **Practice Algorithmic Thinking**: Build clean data structures and study time/space complexity trade-offs.
- **Maintain Engineering Standards**: Apply professional pull-request (PR) standards and clear documentation.

> [!NOTE]
> **Project Scope**: This is a developing personal learning repository documenting an ongoing journey from foundational mechanics to advanced Java architecture. It is structured around an engineering curriculum, with active modules implemented in pure Java and upcoming topics clearly marked as planned.

---

## 2. Repository Architecture & Directory Tree

All active learning modules, technical deep dives, and roadmaps are organized under the [`core-java-engineering-playbook/`](./core-java-engineering-playbook/) workspace.

### Real Directory Layout

```text
core-java-fundamentals/
├── README.md                                          <- Repository landing page (this file)
└── core-java-engineering-playbook/                    <- Core engineering module workspace
    ├── .gitignore                                     <- Exclusions for compiled bytecode and IDEs
    ├── README.md                                      <- Playbook architectural overview
    ├── ENGINEERING-ROADMAP.md                         <- 24-module, 7-phase curriculum
    ├── PROGRESS-TRACKER.md                            <- Granular topic and exercise progress
    ├── PR-CHECKLIST.md                                <- 11-point production engineering checklist
    └── 01-jvm-and-fundamentals/                       <- Module 01: JVM architecture & memory
        ├── stack-vs-heap.md                           <- Technical deep dive: Stack vs Heap
        └── com/engineering/playbook/jvm/
            └── OrderProcessor.java                    <- Executable example (Records, stack/heap flow)
```

### Verified File Guide

| File | Purpose | Location |
| :--- | :--- | :--- |
| **Root Landing Page** | Primary repository overview, learning map, and run instructions | [`README.md`](./README.md) |
| **Playbook Overview** | Engineering philosophy and module architecture | [`core-java-engineering-playbook/README.md`](./core-java-engineering-playbook/README.md) |
| **Engineering Roadmap** | 7-phase, 24-module structured curriculum from JVM to Concurrency | [`core-java-engineering-playbook/ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md) |
| **Progress Tracker** | Real-time audit of notes, runnable code, tests, and interview prep | [`core-java-engineering-playbook/PROGRESS-TRACKER.md`](./core-java-engineering-playbook/PROGRESS-TRACKER.md) |
| **PR Standards Checklist**| 11-point engineering standard covering correctness, concurrency, and security | [`core-java-engineering-playbook/PR-CHECKLIST.md`](./core-java-engineering-playbook/PR-CHECKLIST.md) |
| **Stack vs. Heap Notes** | 178-line technical analysis with junior-vs-senior code review & interview Q&A | [`core-java-engineering-playbook/01-jvm-and-fundamentals/stack-vs-heap.md`](./core-java-engineering-playbook/01-jvm-and-fundamentals/stack-vs-heap.md) |
| **Order Processor** | Runnable Java 16+ example demonstrating stack frames & heap allocation | [`core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java`](./core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java) |

---

## 3. Core Java Learning Map

The table below catalogs the 24 foundational Core Java topics, mapping each to verified evidence within the repository.

- **Implemented**: Concrete, runnable Java source code exists in the repository.
- **Documented**: Structured technical notes, code reviews, or interview scenarios exist.
- **In Progress**: Active implementation or partial evidence exists.
- **Planned**: Outlined in [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md) for upcoming implementation.

| # | Topic | Evidence in Repository | Current Status |
| :-: | :--- | :--- | :--- |
| 1 | **JVM fundamentals & bytecode execution** | [`stack-vs-heap.md`](./core-java-engineering-playbook/01-jvm-and-fundamentals/stack-vs-heap.md#d-execution-flow-and-jvm-internals) (JIT Escape Analysis, method frames) | **Documented / In Progress** |
| 2 | **Stack versus heap memory** | [`OrderProcessor.java`](./core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java) & [`stack-vs-heap.md`](./core-java-engineering-playbook/01-jvm-and-fundamentals/stack-vs-heap.md) | **Implemented & Documented** |
| 3 | **Variables and primitive data types** | [`OrderProcessor.java`](./core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java#L34-L46) (`long totalCents`, `int quantity` on stack) | **Implemented & Documented** |
| 4 | **Conditional statements and loops** | [`OrderProcessor.java`](./core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java#L30-L48) (Defensive conditionals, enhanced `for` loop) | **Implemented** *(Module 02 Planned)* |
| 5 | **Methods and parameter passing** | [`OrderProcessor.java`](./core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java#L52-L69) (Pass-by-value frames in `saveToDatabase`) | **Implemented & Documented** |
| 6 | **Arrays and memory layout** | [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-1-jvm-foundation--execution-mechanics) (Module 04: Contiguous memory & cache locality) | **Planned** |
| 7 | **String immutability and String Pool** | [`OrderProcessor.java`](./core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java#L54) (`UUID` String) & [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-1-jvm-foundation--execution-mechanics) | **Planned** *(Usage in Mod 01)* |
| 8 | **Classes and objects** | [`OrderProcessor.java`](./core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java) (Class declaration, object instantiation, state) | **Implemented** |
| 9 | **Encapsulation, inheritance, & polymorphism**| [`PR-CHECKLIST.md`](./core-java-engineering-playbook/PR-CHECKLIST.md#3-encapsulation--state) & [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-2-domain-modeling--object-oriented-engineering) (Module 06) | **Documented & Planned** |
| 10 | **Packages and access modifiers** | [`OrderProcessor.java`](./core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java#L1) (`com.engineering.playbook.jvm`, `public`/`private`) | **Implemented** *(Module 07 Planned)* |
| 11 | **Exception handling** | [`OrderProcessor.java`](./core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java#L30-L50) (`IllegalArgumentException`) & [`PR-CHECKLIST.md`](./core-java-engineering-playbook/PR-CHECKLIST.md#4-error-handling) | **Implemented & Documented** |
| 12 | **Wrapper classes and autoboxing** | [`stack-vs-heap.md`](./core-java-engineering-playbook/01-jvm-and-fundamentals/stack-vs-heap.md#e-code-review-junior-vs-senior) (Autoboxing heap churn: `Long` vs `long`) | **Documented** *(Module 09 Planned)* |
| 13 | **Enums and state management** | [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-2-domain-modeling--object-oriented-engineering) (Module 10: Strict state transitions) | **Planned** |
| 14 | **Collections Framework & Big-O** | [`OrderProcessor.java`](./core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java#L3-L64) (`List<OrderItem>`, `List.of()`) & [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-3-reliability--data-structures) | **Implemented** *(Module 11 Planned)* |
| 15 | **Generics and type erasure** | [`OrderProcessor.java`](./core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java#L74) (`List<OrderItem>`) & [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-3-reliability--data-structures) | **Planned** *(Module 12)* |
| 16 | **Functional interfaces & lambdas** | [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-4-functional-paradigms--data-processing) (Module 13: Functional composition) | **Planned** |
| 17 | **Stream API & performance** | [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-4-functional-paradigms--data-processing) (Module 14: Lazy evaluation & allocation costs) | **Planned** |
| 18 | **Modern Date-Time API** | [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-4-functional-paradigms--data-processing) (Module 15: `java.time`, UTC, ISO parsing) | **Planned** |
| 19 | **File I/O and NIO** | [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-5-io-serialization--boundaries) (Module 16: ByteBuffers, Channels, Files) | **Planned** |
| 20 | **Serialization & security risks** | [`PR-CHECKLIST.md`](./core-java-engineering-playbook/PR-CHECKLIST.md#9-security) & [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-5-io-serialization--boundaries) (Module 17) | **Planned** |
| 21 | **Multithreading & concurrency** | [`PR-CHECKLIST.md`](./core-java-engineering-playbook/PR-CHECKLIST.md#5-thread-safety--concurrency) & [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-6-high-performance--concurrency) (Module 18) | **Documented & Planned** |
| 22 | **Garbage collection & JVM internals** | [`stack-vs-heap.md`](./core-java-engineering-playbook/01-jvm-and-fundamentals/stack-vs-heap.md#f-performance-and-trade-offs) (Eden space, GC pause latency, JFR profiling) | **Documented** *(Module 19 Planned)* |
| 23 | **Modern Java features** | [`OrderProcessor.java`](./core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java#L74-L75) (Java 16+ Records: `OrderRequest`, `OrderItem`) | **Implemented** *(Module 21 Planned)* |
| 24 | **Algorithms & problem-solving** | [`stack-vs-heap.md`](./core-java-engineering-playbook/01-jvm-and-fundamentals/stack-vs-heap.md#i-refactoring-challenge) (Score aggregation refactoring exercise) | **Documented** *(Module 22 Planned)* |

---

## 4. Java Problem List & Practical Evidence

The following table indexes the concrete coding problems, architectural reviews, and scenarios documented in this repository:

| Problem / Exercise | Concept Practiced | Source File or Note | Verification Status |
| :--- | :--- | :--- | :--- |
| **Order Processing & Memory Footprint** | Stack frame lifecycle, primitive accumulation, heap allocation, Java Records, fail-fast validation | [`OrderProcessor.java`](./core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java) | **Implemented & Runnable** (JDK 17+) |
| **Junior vs. Senior Autoboxing Review** | GC allocation pressure caused by `Long` wrapper objects in tight accumulation loops | [`stack-vs-heap.md`](./core-java-engineering-playbook/01-jvm-and-fundamentals/stack-vs-heap.md#e-code-review-junior-vs-senior) | **Documented Code Review** |
| **High-Allocation CSV Ingestion Scenario** | Diagnosing Eden space exhaustion and Minor GC pauses with Java Flight Recorder (JFR) | [`stack-vs-heap.md`](./core-java-engineering-playbook/01-jvm-and-fundamentals/stack-vs-heap.md#h-scenario-based-interview-interrogation) | **Documented Interview Scenario** |
| **Score Aggregation Refactoring** | Eliminating unnecessary `Double` wrapper heap allocations in numeric averages | [`stack-vs-heap.md`](./core-java-engineering-playbook/01-jvm-and-fundamentals/stack-vs-heap.md#i-refactoring-challenge) | **Documented Refactoring Challenge** |
| **Order Processor Defensive Unit Tests** | Asserting non-null constraints, empty list rejections, and confirmation IDs using JUnit 5 idioms | [`stack-vs-heap.md`](./core-java-engineering-playbook/01-jvm-and-fundamentals/stack-vs-heap.md#j-testing-strategy) | **Documented Test Harness Snippet** |
| *Custom In-Memory LRU Cache* | Doubly-linked list with HashMap index for $O(1)$ lookup and eviction | [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-7-modernization--real-world-synthesis) | *Planned Mini-Project* |
| *Thread-Safe Inventory Manager* | Concurrent updates, optimistic locking, race condition mitigation | [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-7-modernization--real-world-synthesis) | *Planned Mini-Project* |
| *Multithreaded File Log Parser* | Java NIO channels, memory-mapped files, producer-consumer queue | [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-7-modernization--real-world-synthesis) | *Planned Mini-Project* |
| *REST-Like API Dispatcher* | Reflection-based routing, custom annotations, request dispatching | [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-7-modernization--real-world-synthesis) | *Planned Mini-Project* |
| *Connection Pool Simulator* | Thread-safe resource acquisition, timeouts, lifecycle management | [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md#phase-7-modernization--real-world-synthesis) | *Planned Mini-Project* |

---

## 5. Featured Example: JVM Stack vs. Heap Allocation

The core learning demonstration in Module 01 explores the mechanical differences between the **Stack** and the **Heap** using an e-commerce order processing flow:

- **Source Code**: [`OrderProcessor.java`](./core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java)
- **Technical Deep Dive**: [`stack-vs-heap.md`](./core-java-engineering-playbook/01-jvm-and-fundamentals/stack-vs-heap.md)

### Key Architectural Concepts Demonstrated
1. **Stack Allocation**:
   - The thread invokes `processOrder(OrderRequest request)`. A new **stack frame** is pushed onto the thread's call stack.
   - Local primitive variables (`long totalCents = 0`, `long priceCents`, `int quantity`) reside directly inside this frame.
   - Operations on these primitives execute in CPU registers and L1/L2 cache with **zero Garbage Collection impact**.
   - When `processOrder` returns, the frame is popped; stack memory is instantly reclaimed in $O(1)$ time.
2. **Heap Allocation**:
   - The `OrderRequest` instance, the `List<OrderItem>`, the `OrderItem` elements, and the generated `UUID` String reside on the **Heap**.
   - Only **references** (pointers) to these objects live in the method's local variable stack frame.
   - Reclaiming heap allocations requires Garbage Collector root-tracing.
3. **Autoboxing Trap Analysis**:
   - Demonstrates why using `Long totalCents = 0L` instead of primitive `long` creates a new heap object on every addition in a loop, causing GC thrashing under high throughput (e.g., 10,000 requests/sec).
4. **Modern Language Idioms**:
   - Utilizes Java 16+ **Records** (`record OrderRequest(...)`, `record OrderItem(...)`) for immutable, transparent data carriers.
   - Utilizes `List.of(...)` (Java 9+) for immutable collection factories.

```java
// Snippet from OrderProcessor.java demonstrating stack-bound primitive math
long totalCents = 0; 
for (OrderItem item : request.items()) {
    long priceCents = item.priceCents(); // Primitive: lives on the stack
    int quantity = item.quantity();      // Primitive: lives on the stack
    totalCents += (priceCents * quantity); // No heap allocation!
}
```

---

## 6. Engineering Roadmap & Progress

The curriculum follows a 7-phase sequence designed to build strong software engineering fundamentals:

```
[Phase 1: JVM Foundation] ──> [Phase 2: Domain Modeling] ──> [Phase 3: Reliability & DS]
           │                                                                 │
           ▼                                                                 ▼
[Phase 4: Functional Design] ──> [Phase 5: I/O & Boundaries] ──> [Phase 6: Concurrency]
                                                                             │
                                                                             ▼
                                                                 [Phase 7: System Projects]
```

- **Full Curriculum**: See [`ENGINEERING-ROADMAP.md`](./core-java-engineering-playbook/ENGINEERING-ROADMAP.md) for detailed topic descriptions.
- **Granular Status**: See [`PROGRESS-TRACKER.md`](./core-java-engineering-playbook/PROGRESS-TRACKER.md) for module-by-module tracking.

### Honest Status Summary
- **Phase 1 (JVM & Fundamentals)**: Active. Module 01 contains verified technical notes (`stack-vs-heap.md`) and runnable code (`OrderProcessor.java`). Modules 02–05 are planned.
- **Phases 2–7**: Planned. Modules are documented in the roadmap and will be populated sequentially with focused exercises and tests.
- **Testing Status**: Module 01 currently documents a JUnit 5 testing strategy inside `stack-vs-heap.md`. Standalone test files (`*Test.java`) and build automation (Maven/Gradle) are scheduled as upcoming additions.

---

## 7. How to Compile and Run the Examples

### Prerequisites
- **Java Development Kit (JDK)**: **Java 17 LTS or higher** (tested and verified on **OpenJDK 25.0.4**).
- **Build System**: None required for standalone modules. Code compiles directly with standard `javac`.
- **Git**: Installed for repository management.

### 1. Clone the Repository
```bash
git clone https://github.com/shakthi-DEV11/core-java-fundamentals.git
cd core-java-fundamentals
```

### 2. Compile and Run from Repository Root
To compile the class files into a separate build output folder (`out/`):

```bash
# 1. Compile OrderProcessor into the 'out' directory
javac -d out core-java-engineering-playbook/01-jvm-and-fundamentals/com/engineering/playbook/jvm/OrderProcessor.java

# 2. Run the fully qualified class name
java -cp out com.engineering.playbook.jvm.OrderProcessor
```

### 3. Compile and Run from Module Directory
Alternatively, navigate directly to the module folder:

```bash
cd core-java-engineering-playbook/01-jvm-and-fundamentals

# Compile in-place
javac com/engineering/playbook/jvm/OrderProcessor.java

# Run the class
java com.engineering.playbook.jvm.OrderProcessor
```

### Verified Runtime Output
```text
Saved order 5f21a386-d2a1-464c-9a92-5678a970271a for 159000 cents.
Processing completed. Confirmation: 5f21a386-d2a1-464c-9a92-5678a970271a
```

### 4. Opening in IntelliJ IDEA
1. Launch **IntelliJ IDEA**.
2. Select **File > Open...** and choose the root directory: `core-java-fundamentals`.
3. In **Project Structure** (`Ctrl+Alt+Shift+S` / `Cmd+;`), set the **SDK** to **JDK 17** or higher.
4. Mark the module source root:
   - Navigate to `core-java-engineering-playbook/01-jvm-and-fundamentals`.
   - Right-click the folder > **Mark Directory as > Sources Root**.
5. Open `com.engineering.playbook.jvm.OrderProcessor` and click the **Run** green arrow beside `main()`.

---

## 8. Technology Stack

| Technology | Purpose | Evidence in Repository |
| :--- | :--- | :--- |
| **Java 17+ / OpenJDK 25** | Primary programming language runtime | Standard library APIs, Java 16+ records, enhanced switch syntax compatibility |
| **IntelliJ IDEA** | IDE development environment | Project layout, `.gitignore` entries for `.idea/` and `*.iml` |
| **Git & GitHub** | Source control and portfolio distribution | Branch management, commit history, repository host |
| **Markdown** | Technical documentation & engineering checklists | Structured guides, PR checklist, and roadmap |

---

## 9. Skills Practiced Through Evidence

The artifacts present in this repository demonstrate practical experience in:

- **JVM Architecture Reasoning**: Differentiating stack frames from heap allocations, understanding GC roots, and analyzing JIT Escape Analysis.
- **Defensive Programming**: Validating method preconditions, asserting non-null state, and throwing targeted runtime exceptions (`IllegalArgumentException`).
- **Modern Core Java Syntax**: Leveraging Java 16+ Records for transparent immutable data carriers and modern collection factory methods (`List.of()`).
- **Performance-Conscious Coding**: Identifying and mitigating autoboxing heap allocations in loops to prevent GC thrashing.
- **Engineering Quality Standards**: Evaluating changes against an 11-point production readiness checklist (readability, encapsulation, error handling, thread safety).
- **Technical Writing & Architecture**: Authoring structured technical documentation, code reviews, and scenario-based interview responses.

---

## 10. Author & Official References

### Author
- **Shakthi Nagarajan**
- **GitHub**: [github.com/shakthi-DEV11](https://github.com/shakthi-DEV11)
- **Repository**: [github.com/shakthi-DEV11/core-java-fundamentals](https://github.com/shakthi-DEV11/core-java-fundamentals)

### Official References
- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [The Java Language Specification (Java SE 17 / 21 Edition)](https://docs.oracle.com/javase/specs/)
- [JEP 395: Records](https://openjdk.org/jeps/395)
- [JVM HotSpot Virtual Machine Garbage Collection Tuning Guide](https://docs.oracle.com/en/java/javase/17/gctuning/)

---

## 11. Future Improvements & Planned Additions

As the repository evolves along the engineering roadmap, upcoming work will focus on:

1. **Standalone Test Harnesses**: Add dedicated `*Test.java` test files using JUnit 5 assertions for all examples.
2. **Build Automation**: Introduce a lightweight Maven or Gradle build definition to streamline multi-module compilation and test execution.
3. **Module 02 (Control Flow & Loops)**: Implement branch prediction benchmarks and algorithmic loop implementations.
4. **Data Structures & Collections**: Implement deep dives into `HashMap` hashing, load factors, resizing, and collision resolution.
5. **Concurrency & Thread Safety**: Build hands-on labs covering `ReentrantLock`, `ConcurrentHashMap`, and Java 21+ Virtual Threads.
6. **Portfolio Mini-Projects**: Build the standalone mini-projects specified in Phase 7 (LRU Cache, File Log Parser, Inventory Manager).
