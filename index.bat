echo off
echo NUL>_.class&&del /s /f /q *.class
cls
javac -cp com/krzem/movie_maker/modules/opencv-411.jar; com/krzem/movie_maker/Main.java&&java -cp com/krzem/movie_maker/modules/opencv-411.jar; com/krzem/movie_maker/Main
start /min cmd /c "echo NUL>_.class&&del /s /f /q *.class"