project 'appasm' do

  model_version '4.0.0'
  id 'com.soebes.examples.j2ee:appasm:1.1.2-SNAPSHOT'
  inherit 'com.soebes.examples.j2ee:parent:1.1.2-SNAPSHOT'
  packaging 'pom'

  war '${project.groupId}:webgui:${project.version}'
  ejb '${project.groupId}:service:${project.version}'

  plugin( 'org.codehaus.mojo:appassembler-maven-plugin',
          'useAllProjectDependencies' =>  'true',
          'repositoryLayout' =>  'flat',
          'programs' => [ { 'mainClass' =>  'com.mycompany.app.App',
                            'id' =>  'app' } ] ) do
    execute_goals( 'assemble',
                   :id => 'package',
                   :phase => 'package' )
  end

end
