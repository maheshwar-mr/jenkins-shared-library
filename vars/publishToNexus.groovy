def call(String artifactPath, String repositoryURL){
	withCredentials([usernamePassword(credentialsId: 'nexus-user-credentials', passwordVariable: 'pass', usernameVariable: 'userId')]) {
		sh "curl -v -u $userId:$pass -F maven2.generate-pom=false -F maven2.asset1=@pom.xml -F maven2.asset1.extension=pom -F maven2.asset2=$artifactPath -F maven2.asset2.extension=jar $repositoryURL"
        }               
}



