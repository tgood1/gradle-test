plugins {
    `java-library`
}

dependencies {
    implementation("com.google.guava:guava:33.3.1-jre")
}

// Stand-in for a cold cache or a large graph: make this module's dependency
// resolution slow so Gradle flushes its task output partway through.
configurations.configureEach {
    incoming.beforeResolve {
        Thread.sleep(15_000)
    }
}
