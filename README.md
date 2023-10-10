# Reproduction for API visibility issue

This is a simple multiplatform app (android + desktop) that demonstrates IDE issue with platform-dependant API visibility in common source set. 

Related Compose issues:
- https://github.com/JetBrains/compose-multiplatform/issues/3503

## Reproduction steps

1. Publish `testmodule` locally: `./gradlew :testmodule:publishToMavenLocal`
2. Replace module dependency to published on in `shared/build.gradle.kts`
3. Sync Gradle changes
4. Open `Greeting.kt` file and try to use `DesktopPlatform` class directly

### Current behaviour

In case of published dependency IDE suggests platform API usage in common code and doesn't show any errors.
At the same time, the code compilation fails on Android with `Unresolved reference` error.

### Expected behaviour

Show error in IDE before compilation when users try to use platform-specific APIs from common.

