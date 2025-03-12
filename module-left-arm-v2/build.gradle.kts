plugins{
    id("java")
}

dependencies{
    implementation(project(":module-left-arm-v2:left-arm"))
    implementation(project(":module-left-arm-v2:left-hand"))
    implementation(project(":module-left-arm-v2:left-shoulder"))
    implementation(project(":module-core"))
}