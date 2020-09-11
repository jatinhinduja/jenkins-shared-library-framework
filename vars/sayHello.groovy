#!/usr/bin/env groovy



 

def hello(){
    //data = readYaml file: "pipeline-library-demo/vars/test.yml"
    data = readYaml text: """
    data:
     info: change me
     aaa: bbb
     ddd: ccc
    """
//modify
 echo "${data.info}"


}

def call(String environment = 'dev') {
  echo "Hello, ${environment}."
  hello()
}

