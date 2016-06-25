node ('master'){
    stage 'Build'
    env.PATH = "${tool 'Gradle'}/bin:${env.PATH}"
    checkout scm
    sh './gradlew clean build -x test'
}
