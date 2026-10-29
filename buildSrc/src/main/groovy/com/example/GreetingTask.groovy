package com.example

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

abstract class GreetingTask extends DefaultTask {

    @Input
    abstract Property<String> getGreeterName()

    GreetingTask() {
        getGreeterName().convention("World")
    }

    @TaskAction
    void greet() {
        logger.quiet("Hello, ${getGreeterName().get()}")
    }
}
