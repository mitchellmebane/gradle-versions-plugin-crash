plugins {
    id("java")
    id("com.github.ben-manes.versions") version "0.52.0"
    id("org.springframework.boot") version "3.4.2"
    id("io.spring.dependency-management") version "1.1.7"
    id("info.solidsoft.pitest") version "1.15.0"
}

group = "com.mitchellmebane.gradle-versions-plugin-crash"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.boot:spring-boot-dependencies:3.4.2")
    }
}

dependencies {
//    implementation(platform(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES))
    implementation("org.springframework.boot:spring-boot-starter")
}

springBoot {
    mainClass.set("com.mitchellmebane.gradle_versions_plugin_crash.Main")
}
