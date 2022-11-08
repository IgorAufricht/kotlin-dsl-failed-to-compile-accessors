Repo for reproducing a problem with Gradle's Kotlin DSL.

To reproduce:
1. Checkout the repo.
2. Run `gradle`.

Should fail with something along the lines of this:
```
Failed to compile accessors.

         projectSchema: ProjectSchema(extensions=[ProjectSchemaEntry(target=org.gradle.api.Project, name=ext, type=org.gradle.api.plugins.ExtraPropertiesExtension), ProjectSchemaEntry(target=org.gradle.api.Project, name=greeting, type=GreetingPluginExtension), ProjectSchemaEntry(target=GreetingPluginExtension, name=ext, type=org.gradle.api.plugins.ExtraPropertiesExtension)], conventions=[], configurations=[])

         classPath: [C:\dev\gradle-home\caches\4.9\generated-gradle-jars\gradle-api-4.9.jar, C:\dev\apps\gradle-4.9\lib\groovy-all-2.4.12.jar, C:\dev\apps\gradle-4.9\lib\gradle-installation-beacon-4.9.jar, C:\dev\gradle-home\caches\4.9\generated-gradle-jars\gradle-kotlin-dsl-extensions-0.18.4-4.9.jar, C:\dev\apps\gradle-4.9\lib\gradle-kotlin-dsl-0.18.4.jar, C:\dev\apps\gradle-4.9\lib\gradle-kotlin-dsl-tooling-models-0.18.4.jar, C:\dev\apps\gradle-4.9\lib\kotlin-reflect-1.2.41.jar, C:\dev\apps\gradle-4.9\lib\kotlin-stdlib-1.2.41.jar, C:\dev\apps\gradle-4.9\lib\kotlin-stdlib-jdk7-1.2.41.jar, C:\dev\apps\gradle-4.9\lib\kotlin-stdlib-jdk8-1.2.41.jar, C:\dev\gradle-home\caches\jars-3\329763c26993093a040e342f73d8de99\buildSrc.jar]

         availableSchema: ProjectSchema(extensions=[ProjectSchemaEntry(target=Accessible(type=org.gradle.api.Project), name=ext, type=Accessible(type=org.gradle.api.plugins.ExtraPropertiesExtension)), ProjectSchemaEntry(target=Accessible(type=org.gradle.api.Project), name=greeting, type=Accessible(type=GreetingPluginExtension)), ProjectSchemaEntry(target=Accessible(type=GreetingPluginExtension), name=ext, type=Accessible(type=org.gradle.api.plugins.ExtraPropertiesExtension))], conventions=[], configurations=[])

```

Reproduction repo for https://github.com/gradle/kotlin-dsl-samples/issues/1051 
