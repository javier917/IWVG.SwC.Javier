#echo off
export workspace=D:\MIW master en ingenieria web\Asignatura 1\Arquitecto\Javier\IWVG.SwC.Javier
echo -----------------------------------------
echo ".(C) MIW"
echo -----------------------------------------
echo .
echo Workspace --- $workspace
echo .
cd $workspace
echo "============ mvn clean test (profile: develop) ======================================================="
echo .
mvn clean test
exit

