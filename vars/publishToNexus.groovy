def call(String artifactPath, String repositoryURL){
	withCredentials([usernamePassword(credentialsId: 'nexus-user-credentials', passwordVariable: 'pass', usernameVariable: 'userId')]) {
		sh "curl -F file=$artifactPath -u $userId:$pass $repositoryURL"
        }               
}
