plugins {
    `kotlin-dsl`
}

configure(allprojects) {
    apply(plugin = "java")

    group = "org.otus.patterns"
    version = "1.0-SNAPSHOT"

    repositories.addAll(rootProject.buildscript.repositories)

    java.toolchain.languageVersion.set(JavaLanguageVersion.of(11))

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

    tasks.withType<Test> {
        maxHeapSize = "4G"
    }
}