#执行这个文件    ---
#  生产和测试要修改最下面两行    sh /root/mytest/cloud-test/cloud-test-service/src/main/resources/sh/buildAndRunTest.sh


export version=`sudo docker images | grep cloud-test-service | awk '{print $2}'|awk -F '-' '{print $1}' | tr -d "a-zA-Z" | awk '{print int($0)}' | sort -g | tail -1 | awk -F. '{print $1}'`
#打包
  if [ $version -lt 1000 ]
    then
    version=1100
  fi

  if  [ ! -n "$version" ] ;then
      echo "First deployment!"
      version=1100
  else
      echo "The old version is : $version"
      let version+=1
  fi

  export version=$version
  echo New version is : $version


#kubectl delete deployments.apps manager-alarm

cd /root/mytest/cloud-test
#git fetch --all && git reset --hard origin/master
git pull

mvn -s settings.xml clean package -Dmaven.test.skip=true
mvn -s settings.xml -Dmaven.test.skip=true dockerfile:build dockerfile:push -pl cloud-test-service/ -Ddocker.version=$version


#cd /root/sdts-docs/k8s/test-sdts/manager/
#git fetch --all && git reset --hard origin/master
#git pull

#测试环境
cd /root/mytest/cloud-test/src/main/resources/sh
envsubst < cloud-test.yaml | kubectl apply -f -

