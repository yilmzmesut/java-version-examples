package org.yilmzmesut.test.test.java8;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Java8Test {

    // Functional Programming
    // Supplier --> returns a value
    // Consumer --> take input and do something, return void
    // Function --> one input and do something and return an object
    // Predicate --> test a if condition
    // .... other functional interfaces in java.util.function package

    @Test
    public void streamApiTest() {
        List<Product> productList = getSampleProduct();

        List<String> collect = productList.stream()
                .filter(Objects::nonNull)
                .map(Product::getName)
                .filter(name -> name.contains("P"))
                .collect(Collectors.toList());

        System.out.println(collect);
    }

    @Test
    public void supplierTest() {
        Supplier<String> stringSupplier = () -> "this is a supplier";
        System.out.println(stringSupplier);
    }

    @Test
    public void consumerTest() {
        Consumer<List<Product>> productListConsumer = productList ->
                Optional.ofNullable(productList).orElse(new ArrayList<>())
                        .forEach(System.out::println);

        Consumer<List<Product>> addSampleProduct = productList ->
                Optional.ofNullable(productList).orElse(new ArrayList<>()).add(Product.builder().name("NEW").id(11111L).build());

        productListConsumer.accept(getSampleProduct());
        productListConsumer.accept(null);
        System.out.println("----------------");
        addSampleProduct.andThen(productListConsumer).accept(getSampleProduct());
    }

    @Test
    public void functionTest() {
        Function<List<Product>, Long> getCount = productList -> (long) productList.size();
        Function<List<Product>, Long> getPContainsCount = productList -> productList.stream()
                .map(Product::getName)
                .filter(s -> s.contains("P"))
                .count();
        System.out.println("count : " + getCount.apply(getSampleProduct()));
        System.out.println("PCount : " + getPContainsCount.apply(getSampleProduct()));

        Function<Integer, Integer> mathSquare = integer -> integer * integer;
        Function<Integer, Integer> subtractOne = integer -> integer - 1;

        System.out.println("andThen : " + mathSquare.andThen(subtractOne).apply(2));
        System.out.println("compose : " + mathSquare.compose(subtractOne).apply(2));
    }

    @Test
    public void customFunctionTest() {
        IntegerToString integerToString = i -> i + " is converted to String";
        System.out.println(integerToString.integerAsString(2));
    }

    private List<Product> getSampleProduct() {
        return new ArrayList<>(
                List.of(
                        Product.builder().name("P1").id(1L).build(),
                        Product.builder().name("P2").id(2L).build(),
                        Product.builder().name("P3").id(3L).build(),
                        Product.builder().name("R1").id(4L).build(),
                        Product.builder().name("R2").id(5L).build(),
                        Product.builder().name("R3").id(6L).build()
                )
        );
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    static class Product {
        private Long id;
        private String name;
    }
}
