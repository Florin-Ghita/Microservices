package com.floringhita.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
