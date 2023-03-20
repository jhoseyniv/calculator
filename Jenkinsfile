pipeline {
agent any
stages {
            stage('Initialize'){
                steps{
                    def dockerHome = tool 'myDocker'
                    env.PATH = "${Docker_Home}/bin:${env.PATH}"
                    }
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