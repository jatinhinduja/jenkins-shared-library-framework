#!/usr/bin/env groovy



 

def hello(){
    data = readYaml file: "pipeline-library-demo/vars/test.yml"
//modify
 echo "${data.info}"


}

def call(String environment = 'dev') {
  echo "Hello, ${environment}."
  hello()
}

