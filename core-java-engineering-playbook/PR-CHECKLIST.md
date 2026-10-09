# Pull Request (PR) Checklist

Before submitting code to production (or checking off a module in the tracker), verify the following engineering standards.

## 1. Correctness & Logic
- [ ] Does the code solve the actual business problem without unnecessary "cleverness"?
- [ ] Are edge cases (null inputs, empty collections, integer overflow) handled explicitly?
- [ ] Are assertions and invariants strictly enforced?

## 2. Naming & Readability
- [ ] Are class names domain-oriented nouns (e.g., `PaymentValidator`, not `HelperManager`)?
- [ ] Are method names descriptive verbs (e.g., `calculateTotal`, not `doStuff`)?
- [ ] Can a junior engineer understand the execution flow without reading deep comments?

## 3. Encapsulation & State
- [ ] Are fields marked `private` (and `final` where possible)?
- [ ] Is immutability preferred for domain objects?
- [ ] Are internal mutable collections leaked via getters (e.g., returning `List` instead of `List.copyOf()`)?

## 4. Error Handling
- [ ] Are exceptions swallowed (`catch (Exception e) {}`)?
- [ ] Does the code fail fast on invalid inputs?
- [ ] Are meaningful messages and context provided in exceptions?
- [ ] Is exception propagation utilized correctly instead of inappropriate local recovery?

## 5. Thread Safety & Concurrency
- [ ] Is shared mutable state avoided where possible?
- [ ] Are non-thread-safe collections (e.g., `HashMap`) being used concurrently?
- [ ] Are proper synchronization primitives (or concurrent alternatives like `ConcurrentHashMap`) used?

## 6. Resource Cleanup
- [ ] Are I/O streams, connections, and files closed reliably?
- [ ] Is `try-with-resources` utilized for `AutoCloseable` types?
- [ ] Are thread pools explicitly shut down?

## 7. Performance & Complexity
- [ ] Is the Big-O time and space complexity understood?
- [ ] Are there hidden `O(N^2)` operations (e.g., `ArrayList.contains()` in a loop)?
- [ ] Are unnecessary object allocations in tight loops avoided?

## 8. Test Coverage
- [ ] Does the code have automated tests for the "happy path"?
- [ ] Are boundary values and invalid inputs tested?
- [ ] Are expected exceptions explicitly asserted?

## 9. Security
- [ ] Are untrusted inputs sanitized or rejected?
- [ ] Is native Java serialization avoided for untrusted data?
- [ ] Are secrets or sensitive data kept out of logs and exceptions?

## 10. Documentation
- [ ] Is the *why* (business reason, trade-offs) documented, rather than the *how*?
- [ ] Are complex algorithmic choices justified in comments?

## 11. Backward Compatibility
- [ ] Does this change break existing API contracts?
- [ ] If changing a method signature, are downstream callers updated?
