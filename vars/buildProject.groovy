def call() {
  sh 'cd java-maven-sonar-argocd-helm-k8s/spring-boot-app'
  sh 'mvn clean package'
}
