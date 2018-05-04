node {
    stage ('Checkout') {
      checkout scm
    }

    stage ('Maven Build') {
      withMaven ( jdk:'JDK-1.8', maven: 'Maven 3.5.3', mavenLocalRepo: '.repository') {
          steps {
            sh "mvn clean install"
          }
      }
    }
}    
