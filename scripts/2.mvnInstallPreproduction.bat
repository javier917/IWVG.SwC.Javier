@echo off
set workspace=D:\MIW master en ingenieria web\Asignatura 1\Arquitecto\Javier\IWVG.SwC.Javier
echo -----------------------------------------
echo . (C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo .
echo .

cd %workspace%
:: -ff, --fail-fast. Stop at first failure in reactorized builds. Línea de comentario
echo ============ mvn -ff clean test (profile: develop) =========================================================================
echo .
call mvn -ff clean test 
if errorLevel 1 goto errorDevelop

echo .
:: -Dmaven.test.skip=true. To skip running the tests for a particular project
echo ============ call mvn -Dmaven.test.skip=true install -Denvironment.type=preproduction (profile: preproduction) ================
echo .
call mvn -Dmaven.test.skip=true install -Denvironment.type=preproduction
pause
exit

:errorDevelop
echo .
echo .
echo .
echo ########  ERRORES...
pause
