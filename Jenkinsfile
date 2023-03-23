pipeline {
agent any
stages {
stage('Initialize'){
        def dockerHome = tool 'docker'
        env.PATH = "${dockerHome}/bin:${env.PATH}"
    }
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
                        sh "docker build -t calculator ."
                }
            }
        }
}