#!/usr/bin/env bash

REPOSITORY=/home/ubuntu/app

echo "> 현재 구동 중인 애플리케이션 pid 확인"

CURRENT_PID=$(pgrep -f "/home/ubuntu/app/manna-0.0.1-SNAPSHOT.jar")

echo "현재 구동 중인 애플리케이션 pid: $CURRENT_PID"

if [ -z "$CURRENT_PID" ]; then
  echo "현재 구동 중인 애플리케이션이 없으므로 종료하지 않습니다."
else
  echo "> kill -9 $CURRENT_PID"
  kill -9 $CURRENT_PID
  sleep 5
fi

echo "> 새 애플리케이션 배포"

#JAR_NAME=$(ls -tr $REPOSITORY/*.jar | tail -n 1)
JAR_NAME=$REPOSITORY/*.jar

echo "> JAR NAME: $JAR_NAME"

echo "> $JAR_NAME 에 실행권한 추가"

sudo chmod 777 $JAR_NAME

echo "> $JAR_NAME 실행"

#nohup java -jar $JAR_NAME /dev/null 2> /dev/null < /dev/null &

nohup java -jar $JAR_NAME > $REPOSITORY/nohup.out 2>&1 &

