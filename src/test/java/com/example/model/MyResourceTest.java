package com.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyResourceTest {
    
    @Test
    void testBuilder() {
        MyResource r = new MyResourceBuilder().withNewSpec().withName("Ruben").withAlias("ruromero").endSpec().build();
        MyResource other = new MyResourceBuilder(r).build();
        
        assertEquals(r.toString(), other.toString());
    }
}
