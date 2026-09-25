plugins {
    `java-library`
}

dependencies {
    implementation("com.google.code.gson:gson:2.11.0")
}

// Start b's Endor task a little late so its whole block prints while a's task
// is still sleeping inside its START...END window.
tasks.matching { it.name == "unresolvedDependencies_endor" }.configureEach {
    doFirst { Thread.sleep(7_000) }
}
