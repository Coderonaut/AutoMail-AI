plugins {

    alias(libs.plugins.android.application)

    alias(libs.plugins.kotlin.compose)

}

android {

    namespace = "com.automail"

    compileSdk = 36

    defaultConfig {

        applicationId = "com.automail"

        minSdk = 24

        targetSdk = 36

        versionCode = 1

        versionName = "1.0"

        testInstrumentationRunner =
            "androidx.test.runner.AndroidJUnitRunner"

    }

    buildTypes {

        release {

            isMinifyEnabled = true

            proguardFiles(
                getDefaultProguardFile(
                    "proguard-android-optimize.txt"
                ),
                "proguard-rules.pro"
            )

        }

        debug {

            isMinifyEnabled = false

        }

    }

    compileOptions {

        sourceCompatibility = JavaVersion.VERSION_17

        targetCompatibility = JavaVersion.VERSION_17

    }

    buildFeatures {

        compose = true

    }

}

dependencies {

    // Android Core

    implementation(libs.androidx.core.ktx)

    implementation(libs.androidx.activity.compose)

    // Compose BOM

    implementation(
        platform(libs.androidx.compose.bom)
    )

    // Compose UI

    implementation(libs.androidx.compose.ui)

    implementation(libs.androidx.compose.ui.graphics)

    implementation(
        libs.androidx.compose.ui.tooling.preview
    )

    // Material 3

    implementation(libs.androidx.compose.material3)

    // Navigation

    implementation(libs.androidx.navigation.compose)

    // Lifecycle

    implementation(
        libs.androidx.lifecycle.runtime.ktx
    )

    implementation(
        libs.androidx.lifecycle.viewmodel.compose
    )

    // Debug

    debugImplementation(
        libs.androidx.compose.ui.tooling
    )

    debugImplementation(
        libs.androidx.compose.ui.test.manifest
    )

    // Unit Testing

    testImplementation(libs.junit)

    // Instrumentation Testing

    androidTestImplementation(libs.androidx.junit)

    androidTestImplementation(
        libs.androidx.espresso.core
    )

    androidTestImplementation(
        platform(libs.androidx.compose.bom)
    )

    androidTestImplementation(
        libs.androidx.compose.ui.test.junit4
    )

}
