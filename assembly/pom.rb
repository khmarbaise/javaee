project 'assembly' do

  model_version '4.0.0'
  id 'com.soebes.examples.j2ee:assembly:1.1.2-SNAPSHOT'
  inherit 'com.soebes.examples.j2ee:parent:1.1.2-SNAPSHOT'
  packaging 'pom'

  war '${project.groupId}:webgui:${project.version}'
  ejb '${project.groupId}:service:${project.version}'
  jar '${project.groupId}:shade:${project.version}'

  plugin :assembly do
    execute_goals( 'single',
                   :id => 'assemblies',
                   :phase => 'package',
                   'descriptors' => [ 'assembly.xml',
                                      'jar-with-prod.xml',
                                      'jar-with-dev.xml' ] )
  end

end
