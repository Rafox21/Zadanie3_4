# Imported Java/Maven project

## Run on Replit

This project is a Java console application. Its entry point is
`src/main/java/Main.java`, which prints a greeting and then exits.

- Run the configured `Start application` workflow to execute it.
- Click **Run** and read the output in the Console: `Hello world JPWP2!`.
  The workflow finishes normally after printing; this is not a web server.
- Build and test manually with `mvn test`.
- Run the entry point directly with `javac -d . src/main/java/Main.java && java -cp . Main`.

The Java toolchain and Maven are provided by the `java-graalvm22.3`
module in `.replit`; no additional Nix packages or secrets are needed.
`mvn test` builds successfully, but the imported project has no active tests.
