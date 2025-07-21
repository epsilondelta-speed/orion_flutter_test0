plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "co.epsilondelta.orion_flutter"
    compileSdk = 35

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
            username = project.findProperty("gpr.orionuser") as String? ?: System.getenv("ORION_USERNAME")
            password = project.findProperty("gpr.orionkey") as String? ?: System.getenv("ORION_GITHUB_TOKEN")
        }
    }
    google()
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.10")
    implementation("co.epsilondelta:orion-flutter:1.0.1"){
        exclude group: 'io.flutter', module: 'flutter_embedding_release'
    }
    
}
