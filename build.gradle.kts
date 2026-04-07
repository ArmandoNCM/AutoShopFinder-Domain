plugins {
    alias(libs.plugins.jetbrains.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform)
}

kotlin {

    android {
        namespace = "com.example.domain"
        compileSdk { version = release(36) }
        withHostTest {
            isIncludeAndroidResources = false
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.kotlinx.coroutines.core)
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }

}