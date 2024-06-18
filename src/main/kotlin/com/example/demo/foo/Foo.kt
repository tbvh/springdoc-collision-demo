package com.example.demo.foo

class Foo(
    override val fooBase: String,
    val foo: String = "Foo",
) : CollidingBase {
}