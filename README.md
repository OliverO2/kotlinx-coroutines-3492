# Reproducer for [kotlinx.coroutines#3492](https://github.com/Kotlin/kotlinx.coroutines/issues/3492)

* This fails: `./gradlew jvmTest`
* This works: `./gradlew -P kotestRunner=false jvmTest`
