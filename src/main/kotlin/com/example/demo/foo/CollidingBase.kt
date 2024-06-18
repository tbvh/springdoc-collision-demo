package com.example.demo.foo

import com.fasterxml.jackson.annotation.JsonSubTypes

@JsonSubTypes(
    JsonSubTypes.Type(value = Foo::class),
)
interface CollidingBase {
    val fooBase: String
}
