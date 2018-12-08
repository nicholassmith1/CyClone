# CyClone

This project seeks to aggregate various idempotent code clone discovery techniques in order to compensate for the various strengths and weaknesses of different stategies. Currently, CyClone ships with a simple Lucene-based multi-line exact text matcher and a modified version of the SourcererCC strategy for clone discovery. These initial strategies were chosen for their speed, in order to create a responsive search baseline. An SPI was developed to allow experimentation with other strategies, and extension of the tool to individual users' specific use cases.

This repo contains two components, a Netbeans 8.2 plugin that allows code clone searches within an IDE, and a command line utility designed to be used for less focused discovery of code clones, or code clone discovery in an automated manner. The UI tool can be used by openning the clone search Window (from the Window menu), highlighting the desired peice of code, right clicking and initiating a 'find clones' search.


###################################################
To Make Your Own CyClone Strategy

1. Generate the SPI jar

	$ ant clean; ant jar_spi

2. Export the produced jar to your new project folder and include it in your compilation class path

3. Have a class implement CloneDetectorService, and add the name of this class to the file META-INF/services/cyclone.core.spi.CloneDetectorService, which must be contained in the jar your project produces

4. Run either the CLI or UI with your new jar in the classpath


###################################################
To Launch the Netbean Plugin

1. Run the main project

	$ ant run


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


NOTE! Always clean before makeing the SPI jar, or else you might leak other files into the intended destination project, which will probably result in NoSuchMethodErrors when you change something and try to use it later.
