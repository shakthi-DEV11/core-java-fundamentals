package com.engineering.playbook.jvm;

import java.util.List;
import java.util.UUID;

/**
 * Demonstrates Stack vs Heap allocation during a realistic business process.
 */
public class OrderProcessor {

    /**
     * Processes an order and returns a confirmation ID.
     * 
     * @param request The incoming order request containing items.
     * @return A unique order confirmation ID.
     * @throws IllegalArgumentException if the request is invalid.
     */
    public String processOrder(OrderRequest request) {
        // 'request' reference is on the STACK. The actual OrderRequest object is on the HEAP.
        
        if (request == null || request.items().isEmpty()) {
            throw new IllegalArgumentException("Order request cannot be null or empty");
        }

        // 'totalCents' is a primitive. It lives entirely on the STACK.
        // It requires no garbage collection.
        long totalCents = 0; 

        // The Iterator reference is on the stack, the Iterator object is on the heap.
        for (OrderItem item : request.items()) {
            // 'priceCents' and 'quantity' are primitives on the stack.
            long priceCents = item.priceCents();
            int quantity = item.quantity();
            
            // Primitive math: no heap allocation.
            totalCents += (priceCents * quantity);
        }

        if (totalCents <= 0) {
            throw new IllegalArgumentException("Order total must be greater than zero");
        }

        // 'confirmationId' reference is on the stack.
        // The UUID object and its internal String are allocated on the HEAP.
        String confirmationId = UUID.randomUUID().toString();
        
        saveToDatabase(confirmationId, totalCents);

        return confirmationId; // The reference is returned, the stack frame is popped.
    }

    private void saveToDatabase(String confirmationId, long totalCents) {
        // Simulated I/O boundary.
        // A new stack frame is created for 'saveToDatabase'.
        // 'confirmationId' (reference) and 'totalCents' (primitive) are copied into this new frame.
        System.out.println("Saved order " + confirmationId + " for " + totalCents + " cents.");
    }

    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        
        OrderRequest request = new OrderRequest(List.of(
            new OrderItem("LAPTOP-X1", 1500_00, 1),
            new OrderItem("MOUSE-M1", 45_00, 2)
        ));

        String id = processor.processOrder(request);
        System.out.println("Processing completed. Confirmation: " + id);
    }
}

// Using Java 16+ Records for immutable data carriers.
// Instances of these records are ALWAYS allocated on the heap.
record OrderRequest(List<OrderItem> items) {}
record OrderItem(String sku, long priceCents, int quantity) {}
