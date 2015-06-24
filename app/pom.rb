project 'app' do

  model_version '4.0.0'
  id 'com.soebes.examples.j2ee:app:1.1.2-SNAPSHOT'
  inherit 'com.soebes.examples.j2ee:parent:1.1.2-SNAPSHOT'
  packaging 'ear'

  war '${project.groupId}:webgui:${project.version}'
  ejb '${project.groupId}:service:${project.version}'

end
