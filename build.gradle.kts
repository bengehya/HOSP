plugins {
    id("com.android.application") version "8.2.2"
    id("org.sonarqube") version "4.3.1.3277"
    kotlin("android") version "1.9.22"
}

android {
    namespace = "com.example.hosp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.hosp"
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

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
}
