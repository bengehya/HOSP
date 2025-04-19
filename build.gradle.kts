// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id("org.sonarqube") version "6.0.1.5171"
}

repositories {
    google()
    mavenCentral()
}

sonar {
    properties {
        property("sonar.projectKey", "Host")
        property("sonar.projectName", "Host")
        // Tu peux ajouter d'autres propriétés sonar ici si tu veux
    }
}
