@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.org.jetbrains.kotlin.kapt)
}

apply {
    from("$rootDir/buildConfig/common-config.gradle")
}

android {
    namespace = "com.kotlin.unit"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.kotlin.test"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.paging.runtime)
    implementation(libs.bundles.ktor)
    implementation(libs.constraintlayout)
    implementation(libs.hilt.android)
    implementation(libs.timber)
    implementation(libs.androidx.navigation.fragment)
    implementation(libs.com.android.support.multidex)

    androidTestImplementation(libs.androidx.test.espresso.core)

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.mockito:mockito-core:5.2.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}