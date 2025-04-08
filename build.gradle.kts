plugins {
    java
    id("io.freefair.lombok") version "8.6"
}

tasks.named<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "Task4.Main"
    }
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(libs.projectlombok)
    annotationProcessor(libs.projectlombok)
    testImplementation(libs.junit)
}