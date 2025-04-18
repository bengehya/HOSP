plugins {
    alias(libs.plugins.android.application) apply false
    id("org.sonarqube") version "6.0.1.5171"
}

sonar {
    properties {
        property("sonar.projectKey", "Host") // remplace "Host" si besoin
        property("sonar.projectName", "Host")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.login", "TON-SONAR-TOKEN-ICI") // ton vrai token
        property("sonar.sources", "app/src/main/java") // tes sources ici
        property("sonar.tests", "app/src/test/java") // tes tests si tu en as
    }
}
