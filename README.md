# freedom-utilities

before upload to maven repository<br>
in file pom.xml<br>
add <code><version>1.0.0-SNAPSHOT</version><code><br><br>

run: -->> mvn clean deploy<br>
run: -->> mvn versions:set -DnewVersion=1.0.0<br>
run: -->> mvn clean deploy -P release
