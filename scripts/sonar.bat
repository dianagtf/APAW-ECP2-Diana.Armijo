@echo off
echo -----------------------------------------
echo . (C) MIW -UPM
echo -----------------------------------------
echo .
set workspace=C:\Users\Diana\workspaceAPAW\APAW-ECP2-Diana.Armijo
echo .
cd %workspace%
echo ============ mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml ... ==================
echo . Se prepara cobertura
call mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml

echo ============ mvn sonar:sonar ... =======================================================
echo . Se analiza y sube a sonar cloud
call mvn sonar:sonar -X -Dsonar.organization=dianagtf-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=b296e60c12f1eeb2d90ee0f51f561987d62d03ae --settings settings.xml
pause