plugins {
    kotlin("multiplatform") version "1.7.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    sourceSets {
        @Suppress("UNUSED_VARIABLE")
        val jvmTest by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.6.4")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test-jvm:1.6.4")
                implementation("org.junit.jupiter:junit-jupiter-engine:5.9.1")

                val kotestRunner: String? by project
                if (kotestRunner != "false") {
                    implementation("io.kotest:kotest-runner-junit5:5.5.1")
                }

                implementation("io.projectreactor.tools:blockhound:1.0.6.RELEASE")
            }
        }
    }
}
