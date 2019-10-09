@Library('devco_template') _

multibranchJavaTemplate {
    artifact = [
        name : 'javaDemo-0.0.1-SNAPSHOT.jar',
        path : 'build/libs',
        repo_name : 'pataconf'
    ]

    jUnitTestReport = 'build/test-results/TEST-*.xml'
    
    integrationTest = [
        executeDllo : true,
        executeQa : false
    ]

    e2eTest = [
        executeDllo : false,
        executeQa : false
    ]
}