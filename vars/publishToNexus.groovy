def call(String artifactPath, String repositoryURL){
	withCredentials([usernamePassword(credentialsId: 'nexus-user-credentials', passwordVariable: 'pass', usernameVariable: 'userId')]) {
		sh "curl -F r=snapshots -F hasPom=true -F e=jar -F file=@pom.xml -F file=$artifactPath -u $userId:$pass http://35.225.210.223:8081/nexus/service/local/artifact/maven/content"
        }               
}
