# runs maven commands and driver class
import os, sys

def main():
	try:
		file_name = sys.argv[1]

		os.system('mvn clean compile assembly:single')
		os.system('java -cp target/astar_testassignment-1.0-SNAPSHOT-jar-with-dependencies.jar com.mca.astar.Map.MainApp ' + file_name)

	except IndexError:
		os.system('mvn clean compile assembly:single')
		os.system('java -cp target/astar_testassignment-1.0-SNAPSHOT-jar-with-dependencies.jar com.mca.astar.Map.MainApp')

main()