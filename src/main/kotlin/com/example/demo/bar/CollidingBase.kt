package com.example.demo.bar

import com.fasterxml.jackson.annotation.JsonSubTypes

@JsonSubTypes(
    JsonSubTypes.Type(value = Bar::class),
)
interface CollidingBase {
    val barBase: String
}