node() {
    def scmVars = null

    stage("Checkout") {
        deleteDir()
        scmVars = checkout scm
    }

    stage('Maven Clean') {
            sh "mvn clean"
    }

    stage('Maven install') {
            sh "mvn install --batch-mode"
    }

    stage('Maven OWASP Security') {
            sh "mvn org.owasp:dependency-check-maven:check -X"
    }

    stage('Analyse Sonar') {
        def sonarBranchArgs = " -Dsonar.branch=" + env.BRANCH_NAME

        if(env.BRANCH_NAME.startsWith("PR"))
            sonarBranchArgs = " -Dsonar.branch=PR"

        def sonarArgs =  sonarBranchArgs + " -Dsonar.links.ci=" + env.BUILD_URL + " -Dsonar.links.scm=" + scmVars.GIT_URL
        withSonarQubeEnv('SonarQube')  {
                sh "mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.6.1.1688:sonar --batch-mode " + sonarArgs
        }
    }

    stage("Quality Gate"){
        timeout(time: 1, unit: 'HOURS') {
            def qg = waitForQualityGate()
            if (qg.status != 'OK') {
                error "Pipeline aborted due to quality gate failure: ${qg.status}"
            }
        }
    }

    stage('Rapport de tests') {
        junit allowEmptyResults: true, testResults: '**/target/surefire-reports/TEST-*.xml'
    }
}