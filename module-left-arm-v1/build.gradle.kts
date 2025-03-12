plugins {
    id("java")
    id("java-library")
}

dependencies {
    api(project(":module-left-arm-v1:left-arm"))
    api(project(":module-left-arm-v1:left-hand"))
    api(project(":module-left-arm-v1:left-shoulder"))
    implementation(project(":module-core"))
}