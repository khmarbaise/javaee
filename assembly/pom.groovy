project {
  modelVersion '4.0.0'
  parent {
    groupId 'com.soebes.examples.j2ee'
    artifactId 'parent'
    version '1.1.2-SNAPSHOT'
  }
  artifactId 'assembly'
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
    dependency {
      groupId '${project.groupId}'
      artifactId 'shade'
      version '${project.version}'
    }
  }
  build {
    plugins {
      plugin {
        artifactId 'maven-assembly-plugin'
        executions {
          execution {
            id 'assemblies'
            phase 'package'
            goals {
              goal 'single'
            }
            configuration {
              descriptors {
                descriptor 'assembly.xml'
                descriptor 'jar-with-prod.xml'
                descriptor 'jar-with-dev.xml'
              }
            }
          }
        }
      }
    }
  }
}
