plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "co.epsilondelta.orion_flutter"
    compileSdk = 35

    defaultConfig {
        minSdk = 21
        targetSdk = 34
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

repositories {
    google()
    mavenCentral()
maven {
                    name = "GitHubPackages"
                    url = uri("https://maven.pkg.github.com/epsilondelta-speed/orion-flutter")
                    credentials {
                        username = "prasam25"
                        password = "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"
                    }
                }
    
}

dependencies {
   implementation("co.epsilondelta:orion-flutter:1.0.0")
}
