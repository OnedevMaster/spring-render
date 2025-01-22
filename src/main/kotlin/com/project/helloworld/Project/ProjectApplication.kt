package com.project.helloworld.Project

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class ProjectApplication

fun main(args: Array<String>) {
	runApplication<ProjectApplication>(*args)
}

@RestController
class DemoController{
    @GetMapping("/")
    fun hello() : String {
        return "Hello World" 
    }	
}
