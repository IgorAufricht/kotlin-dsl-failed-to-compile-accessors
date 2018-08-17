import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.DefaultTask

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

import org.gradle.kotlin.dsl.*

open class GreetingPlugin : Plugin<Project> {

    override fun apply(project: Project): Unit = project.run {

        // Add the 'greeting' extension object
        val greeting = extensions.create(
            "greeting",
            GreetingPluginExtension::class.java
        )

        // Add a task that uses the configuration
        tasks {
            "hello"(Greeting::class) {
                group = "Greeting"
                message.set(greeting.message)
            }
        }
    }
}

open class GreetingPluginExtension {

    val message = ""
}

open class Greeting : DefaultTask() {

    @get:Input
    val message = project.objects.property<String>()

    @TaskAction
    fun printMessage() {
        val message = message.get()
        println("Writing message '$message'")
    }
}