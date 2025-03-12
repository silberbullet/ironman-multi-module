plugins{
    id("java")
}

allprojects {
    group = "com.ironman"

    tasks.withType<JavaCompile>{
        sourceCompatibility = JavaVersion.VERSION_21.toString()
        targetCompatibility = JavaVersion.VERSION_21.toString()
    }
    repositories {
        mavenCentral()
    }
}
