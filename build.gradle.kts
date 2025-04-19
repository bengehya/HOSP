plugins {
    id("com.android.application") version "8.8.0"
    id("org.sonarqube") version "4.4.1.3373"
    kotlin("android") version "1.9.20"
}


android {
    namespace = "com.example.hospital"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.hospital"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

sonarqube {
    properties {
        property("sonar.projectKey", "hospital")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.sourceEncoding", "UTF-8")
    }
}
