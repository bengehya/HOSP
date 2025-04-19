plugins {
    id("org.sonarqube") version "4.4.1.3373"
    kotlin("jvm") version "1.9.22"
}

dependencies {
    implementation(kotlin("stdlib"))
}

// Configuration SonarQube
sonarqube {
    properties {
        property("sonar.projectKey", "HOSP")
        property("sonar.organization", "your-organization-key")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.login", System.getenv("SONAR_TOKEN"))
    }
}
