/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Scala library project to get you started.
 * For more details take a look at the Scala plugin chapter in the Gradle
 * User Manual available at https://docs.gradle.org/6.2/userguide/scala_plugin.html
 */

plugins {
    // Apply the scala plugin to add support for Scala
    scala
    id("com.github.maiflai.scalatest") version "0.26"
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // Use Scala 2.13 in our library project
    implementation("org.scala-lang:scala-library:2.13.1")

    testImplementation("org.scalatest:scalatest_2.13:3.1.2")
    testImplementation("org.scalatestplus:scalacheck-1-14_2.13:3.1.2.0")

    testRuntime("com.vladsch.flexmark:flexmark-all:0.35.10")
}
