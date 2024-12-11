package com.grace.graphql_openapi.controller;

import com.grace.graphql_openapi.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class GraphQLController {

    @QueryMapping
    public Product product(String id) {
        return new Product(id, "Sample Product", 99.99);
    }

    @QueryMapping
    public List<Product> products() {
        return Arrays.asList(
                new Product("1", "Product A", 50.0),
                new Product("2", "Product B", 150.0)
        );
    }
}
