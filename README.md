# CyClone


###################################################
To Make Sample CLI

1. Make the SPI definition jar

	$ ant jar_spi

2. Make the test service provider

	$ cd test
	$ ant jar

3. Make the CLI

	$ cd ..
	$ ant jar_cli

4. Run the CLI *WITH* the test service provider

	$ java -classpath dist/CyClone.jar:test/dist/TestCC.jar cyclone.cli.CyClone -R -S src/ src/cyclone/core/cloneDetector/CloneDetectorServiceProvider.java:2:40

You can add as many providers as you want by adding them to the classpath along with the actual application (the CLI or UI, here cyclone.cli.CyClone).
