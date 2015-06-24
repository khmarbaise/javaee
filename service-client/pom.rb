project 'service-client' do

  model_version '4.0.0'
  id 'com.soebes.examples.j2ee:service-client:1.1.2-SNAPSHOT'
  inherit 'com.soebes.examples.j2ee:parent:1.1.2-SNAPSHOT'
  packaging 'jar'

  jar '${project.groupId}:domain:${project.version}'

end
