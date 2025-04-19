plugins {
    id("org.sonarqube") version "6.0.1.5171"
    // ATTENTION: ne mets PAS android.application si on est en CI (Jenkins)
    if (System.getenv("CI") == null) {
        id("com.android.application") version "8.2.2" apply false
    }
}

if (System.getenv("CI") == null) {
    apply(plugin = "com.android.application")

    android {
        compileSdk = 34
        defaultConfig {
            applicationId = "com.example.hospital"
            minSdk = 24
            targetSdk = 34
            versionCode = 1
            versionName = "1.0"
        }
    }
}

sonarqube {
    properties {
        property("sonar.projectKey", "Host")
        property("sonar.projectName", "Host")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.login", System.getenv("SONAR_TOKEN"))
    }
}
