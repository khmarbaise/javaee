project {
  modelVersion '4.0.0'
  parent {
    groupId 'com.soebes.examples.j2ee'
    artifactId 'parent'
    version '1.1.2-SNAPSHOT'
  }
  artifactId 'appasm'
  packaging 'pom'
  dependencies {
    dependency {
      groupId '${project.groupId}'
      artifactId 'webgui'
      version '${project.version}'
      type 'war'
    }
    dependency {
      groupId '${project.groupId}'
      artifactId 'service'
      version '${project.version}'
      type 'ejb'
    }
  }
  build {
    plugins {
      plugin {
        groupId 'org.codehaus.mojo'
        artifactId 'appassembler-maven-plugin'
        executions {
          execution {
            id 'package'
            phase 'package'
            goals {
              goal 'assemble'
            }
          }
        }
        configuration {
          useAllProjectDependencies 'true'
          repositoryLayout 'flat'
          programs {
            program {
              mainClass 'com.mycompany.app.App'
              id 'app'
            }
          }
        }
      }
    }
  }
}
