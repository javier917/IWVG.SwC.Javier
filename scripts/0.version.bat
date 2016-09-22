@echo off

set workspace=D:\MIW master en ingenieria web\Asignatura 1\Arquitecto\Javier\IWVG.SwC.Javier
echo -----------------------------------------
echo . (C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo JAVA_HOME --- %JAVA_HOME%
echo M2_HOME   --- %M2_HOME%
echo .
cd %workspace%
echo ============ mvn --version =======================================================
echo .
:: Se ejecuta un comando maven
call mvn --version
echo .
::Se queda la consola abierta para realizar comandos en línea
cmd /k
