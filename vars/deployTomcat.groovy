def call(String warPath, String tomcatPath){
	echo "Deploying War"
	sh """
	cp ${$warPath} ${tomcatPath}/webapps/
	sudo ${tomcatPath}/bin/shutdown.sh || true
	sleep 5
	sudo ${tomcatPath}/bin/startup.sh
	"""

}
