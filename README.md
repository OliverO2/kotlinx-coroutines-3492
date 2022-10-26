# Reproducer for [kotlinx.coroutines#3492](https://github.com/Kotlin/kotlinx.coroutines/issues/3492)

This is an updated version including `kotlinx-coroutines-debug` dependency the as suggested
in [this issue comment](https://github.com/Kotlin/kotlinx.coroutines/issues/3492#issuecomment-1291927426).

Now the test always fails.

* `./gradlew jvmTest`

This is the intended behavior.
