plugins{
    id("java")
}

dependencies {
    implementation(project(":module-right-arm-v1:right-arm"))
    implementation(project(":module-right-arm-v1:right-hand"))
    implementation(project(":module-right-arm-v1:right-shoulder"))
}