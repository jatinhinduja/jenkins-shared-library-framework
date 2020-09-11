#!/usr/bin/env groovy



 

def hello(){
    //data = readYaml file: "pipeline-library-demo/vars/test.yml"
    def datas = readYaml text: """
        something: 'my first document'
        something: 'my second document'
"""
       // assert datas.size() == 2
       // assert datas[0].something == 'my first document'
       // assert datas[1].something == 'my second document'
//modify
 echo "${datas}"


}

def call(String environment = 'dev') {
  echo "Hello, ${environment}."
  hello()
}

