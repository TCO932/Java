plugins {
    java
}

tasks.named<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "Task1.Main"
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.projectlombok)
    testImplementation(libs.junit)
}