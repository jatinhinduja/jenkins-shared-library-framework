#!/usr/bin/env groovy



 

def hello(){
    data = readYaml file: "test.yml"
//modify
 echo "${data.info}"


}

def call(String environment = 'dev') {
  echo "Hello, ${environment}."
  hello()
}

