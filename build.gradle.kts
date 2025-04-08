plugins {
    java
    id("io.freefair.lombok") version "8.6"
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(libs.projectlombok)
    annotationProcessor(libs.projectlombok)
    testImplementation(libs.junit)
}

tasks.named<Test>("test") {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

tasks.named<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "Task4.Main"
    }
}