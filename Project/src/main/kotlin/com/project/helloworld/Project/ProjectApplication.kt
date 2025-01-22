package com.project.helloworld.Project

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProjectApplication

fun main(args: Array<String>) {
	runApplication<ProjectApplication>(*args)
}
