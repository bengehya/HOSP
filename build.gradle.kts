// build.gradle.kts (à la racine)

plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.sonarqube") version "6.0.1.5171"
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

subprojects {
    afterEvaluate {
        if (plugins.hasPlugin("com.android.application")) {
            extensions.configure<com.android.build.gradle.BaseExtension> {
                compileSdkVersion(34)

                defaultConfig {
                    applicationId = "com.example.hospital"
                    minSdk = 24
                    targetSdk = 34
                    versionCode = 1
                    versionName = "1.0"
                }
            }
        }
    }
}

sonar {
    properties {
        property("sonar.projectKey", "Host")
        property("sonar.projectName", "Host")
    }
}
