@echo off
rem locate current port
grep.exe "Starting Coyote HTTP" ..\logs\catalina*.log | gawk.exe "{print $6}" | gawk.exe "{print $1}" RS="-" | grep.exe -v http > port.txt


rem get the PID for teh tomcat on teh current port
for /f "tokens=1* delims=," %%a in (port.txt) do (
	netstat.exe -a -n -o | grep.exe %%a | grep.exe LISTENING | gawk.exe "{print $5}" | grep.exe -v " 0" >> pid.txt
)
del port.txt

rem kill the PID for tomcat on teh current port
for /f "tokens=1* delims=," %%a in (pid.txt) do (
	process -k %%a
)
del pid.txt