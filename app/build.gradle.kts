plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "demos.${rootProject.name.replace('-', '_')}"
        minSdk = 21
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.0-rc02"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.10")
    implementation("androidx.appcompat:appcompat:1.4.0")
    implementation("androidx.compose.compiler:compiler:1.1.0-rc02")
    implementation("androidx.compose.runtime:runtime:1.1.0-rc01")
    implementation("androidx.compose.foundation:foundation:1.1.0-rc01")
    implementation("androidx.activity:activity-compose:1.4.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.compose.material:material:1.1.0-rc01")

}
