plugins {
	java
	id("org.springframework.boot") version "4.1.0"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.ling"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-kafka")
	testImplementation("org.springframework.boot:spring-boot-starter-kafka-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")

	implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.22.0")
	implementation("tools.jackson.core:jackson-databind:3.1.4")

	implementation("org.zeromq:jeromq:0.6.0")
	implementation("org.locationtech.proj4j:proj4j:1.4.3")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
