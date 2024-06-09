plugins {
    id("java")
    id("maven-publish")
    application
}

repositories {
    mavenCentral()
}

group = "com.github.kisman2000"
version = "2.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "lavahack"
            artifactId = "kevin"

            artifact(tasks.jar) {
                classifier = "core"
            }
        }
    }
}