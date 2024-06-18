package com.example.demo

import com.example.demo.bar.Bars
import com.example.demo.bar.Bar
import com.example.demo.foo.Foo
import com.example.demo.foo.Foos
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CollisionController {

    @RequestMapping("/foo")
    fun getFoo(): Foos {
        return Foos(listOf(Foo("type")))
    }

    @RequestMapping("/bar")
    fun getBar(): Bars {
        return Bars(Bar("name"))
    }
}