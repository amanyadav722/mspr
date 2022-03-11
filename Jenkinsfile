// pipeline {

//   agent any

//   options {

//     buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '5', daysToKeepStr: '', numToKeepStr: '5')

//   }

//   stages {

//     stage('Clone sources') {
      
//        git url: 'https://github.com/amanyadav722/mspr_dev.git'
      
//     }
    
    
//     stage('Some configuration'){
      
//       'some integration de Jenkins comme gréer des credentials et des plugins'
      
//     }
    
    
//     stage('site web'){
      
//       'creér des fontionalites pour affichager details de agents'
      
//     }
    
//     stage('affchage details generé'){
      
//     }
    
//     stage('publish build infos'){
      
//     }

//     }

//   }

// }

pipeline {
agent any



stages {
stage('Build') {
steps {
echo 'Building..'
}
}
stage('Unit Test') {
steps {
echo 'Unit Testing..'
}
}
      
stage('e2e Test') {
steps {
echo 'e2e Testing..'
}
}
      
stage('Deploy') {
steps {
echo 'Deploying....'
}
}
}
}
