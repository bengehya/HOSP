// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    // Plugin Sonar pour analyser ton code
    id("org.sonarqube") version "6.0.1.5171"

    // Plugin Android Application ➔ SEULEMENT si SDK est présent
    if (System.getenv("ANDROID_SDK_ROOT") != null || System.getenv("ANDROID_HOME") != null) {
        id("com.android.application")
    }
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    // Ajoute ici tes dépendances si besoin plus tard
}

// Bloc android ➔ exécuter seulement si SDK Android dispo (pour éviter plantage Jenkins)
if (System.getenv("ANDROID_SDK_ROOT") != null || System.getenv("ANDROID_HOME") != null) {
    android {
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
}

// Configuration SonarQube
sonar {
    properties {
        property("sonar.projectKey", "Host")
        property("sonar.projectName", "Host")
        // Optionnel ➔ Si tu veux pousser sur ton serveur SonarQube en local
        // property("sonar.host.url", "http://localhost:9000")
    }
}
