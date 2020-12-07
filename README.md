# JDEMAN
Java Dead Method ANalyzer (JDEMAN) uses codeql to analyse the source code of Java projects to detect unused methods (also known as dead methods).

### Downloade CodeQL CLI
To run the scripts in this repo, you need **CodeQL CLI**. To download CodeQL CLI from this [link](https://github.com/github/codeql-cli-binaries/releases). Please refer to this [page](https://help.semmle.com/codeql/codeql-cli/procedures/get-started.html) for further information on getting started with CodeQL CLI.

*Note: While you can run CodeQL in different platforms (Windows and MacOS) this README covers commands for the Linux platform (All commands were run and tested on Ubuntu 20.04).*

### Running CodeQL in the command line
CodeQL CLI comes as a zip archive. Simply unzip the file to a location that you would like. If you would like to use the command `codeql` without specifying the path, you need to include it in the classpath. Otherwise, the command needs to be called by accessing the location where you extracted the files. 

`$ extracted_location/codeql-cli/codeql`

In the above command, `extracted_location` is where you place your CodeQL. I renamed my CodeQL directory to `codeql-cli` so that it will not confused with the executable command `codeql`.

### Running script on sample data

The data directory contains a sample Java project (dummyProject*) that you could run the scripts and experiment with. There are a couple of real-world applications also provide in the data directory which was extracted from GitHub.

### Preparing your project

If you want to analyse your own project using this script you need to include build scripts to your project. I have used gradle to build the dummyProject in the data directory. While you can figure out how to configure gradle with your project and the IDE, the simplest option would be to use IntelliJ IDEA IDE and create a gradle project (and chose Java as the language).

Once your project is ready (i.e. build passed) you can create a database of your project which CodeQL can analyse. The CodeQL command to create a database is as follows.

`codeql database create --language=java output_locattion`

This command expects you to be in the location of your project root. The actual command could look like this.

`$ extracted_location/codeql-cli/./codeql database create --language=java database_location/codeDB`

When running the command, codeQL expects that there is not codeDB dir in the database_location. I am using the command `./codeql` because I didn't include it in the classpath.

To test the database creation process, you could run the above command on the sample Java project in the source directory. The resulting database should be same as the *dummyProject* in the data directory. One could run the queries on both data bases and produce similar results. 

### Running the queries

The ql directory contains a set of quiries. If you run queries from dm_1 to dm_6 you should be able to reproduce the results as indicated in the paper. 

To run the CodeQL queries, you could either use the [VisusalStudio Code extension](https://help.semmle.com/codeql/codeql-for-vscode/procedures/using-extension.html) or the CodeQL CLI.

If you are using the extention, simply copy the queries to the java>ql>example>snippets directory. Then open one of the query file, right click on the file and select CodeQL:Run Query option. This will generate an interactive result set. One could click on the entries and view the content of the file.

If you are using CodeQL CLI use the following command to execute the queries. 

`codeql database analyze <database> <queries> --format=<format> --output=<output>`

In the above command, you need to locate `codeql` if it is not in the class path similar to database creating process. `<database>` should be replaced withe path to the databsae. `<queries>` should be replace with the path to the query. Provide the format (eg: csv) and the path for output file. More information on this topic can be found in [here](https://help.semmle.com/codeql/codeql-cli/procedures/analyze-codeql-database.html).