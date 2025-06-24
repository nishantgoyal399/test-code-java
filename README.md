<h1>Javadoc-Demo</h1>
This repository demonstrates how to generate HTML pages of API documentation from Java source files using the Javadoc tool.

<h3>Java Versions Used</h3>

- Java 7
- Java 8
- Java 11
- Java 17
- Java 21

<h3>Topics Covered</h3>

- Javadoc: Learn how to use the Javadoc tool to generate detailed HTML documentation from Java source files.

<h3>Command to Generate Documentation via Javadoc Tool</h3>

- To generate documentation in the same folder as the source file:

```console
javadoc SourceFileName.java
```

- To generate documentation in a different folder:

```console
javadoc -d "Output Folder Path" SourceFileName.java
```

- For example, in this project, after navigating to the project root, the following command was executed:

```console
javadoc -d "docs" src\com\kapil\javadocdemo\JavadocDemo.java
```

<h3>How to View the Documentation?</h3>

- The generated documentation files are located in the folder: <strong>docs/</strong>

- Open <strong>docs/index.html</strong> in any web browser to view the documentation.

<h3>Notes:</h3>

- Ensure the Javadoc tool is installed and accessible via your system's PATH.

- Replace <strong>SourceFileName.java</strong> with the actual Java source file you want to document.
