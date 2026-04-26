def call(){
	echo "Building Maven Project"
	sh "mvn clean package"
}
