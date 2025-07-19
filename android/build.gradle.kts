plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "co.epsilondelta.orion_flutter"
    compileSdk = 34

    defaultConfig {
        minSdk = 23
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

repositories {
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/epsilondelta-speed/orion-flutter")
        credentials {
            username = "prasam25"
            password = "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"
        }
    }
    google()
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.10")
    implementation("co.epsilondelta:orion-flutter:1.0.1")
}
