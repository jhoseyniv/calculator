pipeline {
agent any
stages {

            stage("Compile") {
                steps {
                        sh "./gradlew compileJava"
                      }
            }
            stage("Unit test") {
                steps {
                        sh "./gradlew test"
                }
            }
            stage("Code coverage") {
                steps {
                        sh "./gradlew jacocoTestReport"
                        sh "./gradlew jacocoTestCoverageVerification"
                }
            }

            stage("Package to Jar") {
                steps {
                        sh "./gradlew build"
                }
            }
            stage("Docker build") {
                steps {
                        sh "docker build -v /var/run/docker.sock:/var/run/docker.sock -t calculator ."
                }
            }
        }
}