plugins{
    id("java")
}

group = "com.ironman"

// 모듈 혹은 라이브러리 등록을 담당하는 DSl
dependencies {
    implementation(project(":module-core"))
    implementation(project(":module-left-arm-v1"))
    implementation(project(":module-right-arm-v1"))
}