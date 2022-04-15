pipeline {
  agent any
  stages {
    stage('build') {
      parallel {
        stage('build') {
          steps {
            echo 'building project'
          }
        }

        stage('r1') {
          steps {
            git(url: 'https://github.com/narayankudav/Titanic/', branch: 'master')
            echo 'r1'
          }
        }

        stage('r2') {
          steps {
            git(url: 'https://github.com/narayankudav/Titanic/', branch: 'master')
            echo 'r2'
          }
        }

      }
    }

  }
}