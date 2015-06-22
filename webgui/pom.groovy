project {
  modelVersion '4.0.0'
  parent {
    groupId 'com.soebes.examples.j2ee'
    artifactId 'parent'
    version '1.1.2-SNAPSHOT'
  }
  artifactId 'webgui'
  packaging 'war'
  dependencies {
    dependency {
      groupId '${project.groupId}'
      artifactId 'service-client'
      version '${project.version}'
    }
    dependency {
      groupId 'javax'
      artifactId 'javaee-api'
      version '6.0'
      scope 'provided'
    }
  }
  build {
    resources {
      resource {
        directory '${project.basedir}'
        includes {
          include 'README.md'
        }
      }
    }
  }
}
