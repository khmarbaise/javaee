project 'shade' do

  model_version '4.0.0'
  id 'com.soebes.examples.j2ee:shade:1.1.2-SNAPSHOT'
  inherit 'com.soebes.examples.j2ee:parent:1.1.2-SNAPSHOT'
  packaging 'jar'

  war '${project.groupId}:webgui:${project.version}'
  ejb '${project.groupId}:service:${project.version}'

  plugin( :shade,
          'shadedArtifactAttached' =>  'true' ) do
    execute_goals( 'shade',
                   :id => 'test',
                   :phase => 'package',
                   'shadedClassifierName' =>  'test' )
    execute_goals( 'shade',
                   :id => 'dev',
                   :phase => 'package',
                   'shadedClassifierName' =>  'dev' )
    execute_goals( 'shade',
                   :id => 'prod',
                   :phase => 'package',
                   'shadedClassifierName' =>  'prod' )
  end

end
