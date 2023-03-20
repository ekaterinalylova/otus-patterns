description = "otus-patterns-homework"

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}