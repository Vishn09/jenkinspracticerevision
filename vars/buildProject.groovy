def call(String mavenCommand='clean package') {
    sh """
        cd java-maven-sonar-argocd-helm-k8s/spring-boot-app
        mvn ${mavenCommand}
    """
}
