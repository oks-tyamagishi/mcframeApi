import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.3.3.RELEASE"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
//    id("com.arenagod.gradle.MybatisGenerator") version "1.3"
    id("com.github.node-gradle.node") version "3.1.0"
    kotlin("jvm") version "1.3.72"
    kotlin("plugin.spring") version "1.3.72"
}

group = "com.copper.njt"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

// Jar 出力先
val collaboflowJarDirectory = "c:\\work\\lib\\mcframe"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.0")
    implementation("com.squareup.moshi:moshi:1.9.3")
    implementation("com.squareup.moshi:moshi-kotlin:1.9.3")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0")

    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
    testImplementation("org.springframework.security:spring-security-test")

//    implementation("org.springframework.boot:spring-boot-starter-mail")
//    implementation("org.springframework.boot:spring-boot-starter-security")
//    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
//    implementation("org.springframework.boot:spring-boot-starter-web")
//    implementation("org.springframework.boot:spring-boot-starter-validation")
//    implementation("org.springframework.boot:spring-boot-starter-aop")
//    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//    implementation("org.jetbrains.kotlin:kotlin-reflect")
//    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//    implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity5")
//    implementation ("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.1.3")
//    implementation ("net.sf.jasperreports:jasperreports:6.10.0")
//    implementation( "com.google.zxing:core:3.3.0")
//    implementation ("com.google.zxing:javase:3.3.0")
//    implementation ("net.sf.barcode4j:barcode4j:2.0")
//    implementation("org.apache.xmlgraphics:batik-bridge:1.11")
//    implementation ("com.lowagie:itext:2.1.7.js7")
//    implementation("org.apache.commons:commons-csv:1.8")
//    implementation("org.apache.poi:poi:5.2.3")
//    implementation("org.apache.poi:poi-ooxml:5.2.3")
//
//    runtimeOnly("org.postgresql:postgresql")
//    testImplementation("org.springframework.boot:spring-boot-starter-test") {
//        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
//    }
//    testImplementation("org.springframework.security:spring-security-test")
//    testImplementation("org.mybatis.spring.boot:mybatis-spring-boot-starter-test:2.1.3")
}

//mybatisGenerator {
//    // 設定ファイル
//    configFile = "src/main/resources/generatorConfig.xml"
//
//    dependencies {
//        mybatisGenerator ("com.itfsw:mybatis-generator-plugin:1.3.7")
//        mybatisGenerator ("org.mybatis.generator:mybatis-generator-core:1.3.7")
//        mybatisGenerator ("org.postgresql:postgresql")
//    }
//}

node {
    download.set(true)
    version.set("15.1.0")
}

tasks.yarn {
    args.set(listOf("--frozen-lockfile"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

task<Copy>("exportMcframeJar"){

    dependsOn("jar")

    val dirFrom = buildDir.resolve("libs").absolutePath
    val dirInto = "$collaboflowJarDirectory"

    doFirst {
        delete(file(dirInto))
    }

    from(dirFrom)
    into(dirInto)
}
