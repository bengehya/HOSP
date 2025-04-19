plugins {
    id("org.sonarqube") version "6.0.1.5171"
}

sonar {
    properties {
        property("sonar.projectKey", "Host")
        property("sonar.projectName", "Host")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.login", System.getenv("SONAR_TOKEN")) // 💥 Utilise l'env var SONAR_TOKEN
    }
}

