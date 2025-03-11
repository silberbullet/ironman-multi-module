plugins{
    id("java")
}

allprojects {
    tasks.withType<JavaCompile>{
        sourceCompatibility = JavaVersion.VERSION_21.toString()
        targetCompatibility = JavaVersion.VERSION_21.toString()
    }
    repositories {
        mavenCentral()
    }
}
