# JDEMAN
Java Dead Method ANalyzer (JDEMAN) uses codeql to analyse source code of Java projects to detect unused methods (also known as dead methods).

### Downloade CodeQL CLI
To run the scripts in this repo, you need **CodeQL CLI**. To download CodeQL CLI from this [link](https://github.com/github/codeql-cli-binaries/releases). Please refer this page for further information on getting started with CodeQL CLI.

*Note: While you can run CodeQL in different platforms (Windows and MacOS) this README covers commands for linux platform (All commands were run and tested on Ubuntu 20.04).*

### Running CodeQL in the command line
CodeQL CLI comes as a zip archive. Simply unzip the file to a location that you would like. If you would like to used command `codeql` you need to include the it to the class path. Otherwise the command need to be called by accessing to the location where you extracted the files. 

`$ extracted_location/codeql-cli/codeql`

In the above command `extracted_location` is where you place your CodeQL. I renamed my CodeQL to `codeql-cli` so that it will not cofused with the command `codeql`.

### Running script on sample data

The data directory contain a sample Java project (dummyProject*) that you could run the scripts and experiment. There are couple of real world applications also provide in the data directory which were extracted from GitHub.

### Preparing your 

If you want analyse your own project using this scripts you need to include build scripts to your project. I have used gradle to build the dummyProject in the data directory. While you can figureout how to configure gradle with your project and the IDE, the simplest option would be to use IntelliJ IDEA IDE and create a gradle project (and chose Java as the language).
